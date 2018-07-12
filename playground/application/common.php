<?php

// 应用公共文件
defined('PLAYGROUND_PATH') or define('PLAYGROUND_PATH', ROOT_PATH . 'public' . DS . 'playground' . DS );
defined('PLAYGROUND_OUT_PATH') or define('PLAYGROUND_OUT_PATH', PLAYGROUND_PATH . 'out' . DS );
defined('PLAYGROUND_OUT_TOKEN_PATH') or define('PLAYGROUND_OUT_TOKEN_PATH', PLAYGROUND_OUT_PATH . 'token' . DS );
defined('PLAYGROUND_OUT_TREE_PATH') or define('PLAYGROUND_OUT_TREE_PATH', PLAYGROUND_OUT_PATH . 'tree' . DS );
defined('PLAYGROUND_OUT_JAVA_PATH') or define('PLAYGROUND_OUT_JAVA_PATH', PLAYGROUND_OUT_PATH . 'java' . DS );
defined('PLAYGROUND_OUT_BIN_PATH') or define('PLAYGROUND_OUT_BIN_PATH', PLAYGROUND_OUT_PATH . 'bin' . DS );


function s($msg='success', $data = null){
    throw new think\exception\HttpResponseException(json([
        "code"=>200,
        "msg" => mlang($msg),
        "data" => $data
    ]));
}

function e($code = 0, $msg = 'failure', $data = null){
    throw new think\exception\HttpResponseException(json(
        ["code"=>400+$code,
            "msg" => mlang($msg),
            "data" => $data
        ]));
}

function mlang($str){
    return is_null($str)?null:lang($str);
}

function mrtrim($text, $needle)
{
    $text = trim($text);
    $pos = strrpos($text, $needle);
    if($pos!==false){
        $len = strlen($text);
        $nlen = strlen($needle);
        if($len-$pos == $nlen){
            return substr($text, 0, -$nlen);
        }else{
            return $text;
        }
    }else{
        return $text;
    }
}

function getInitJst($className){
    return "public class $className {
    constructor() {
    }
}
";
}

function delDir($dir) {
    $dh = @opendir($dir);
    if(!$dh)
        return false;
    while ($file = readdir($dh)) {
        if($file != "." && $file!="..") {
            $fullPath = $dir."/".$file;
            if(!is_dir($fullPath)) {
                @unlink($fullPath);
            } else {
                @deldir($fullPath);
            }
        }
    }
    closedir($dh);
    if(@rmdir($dir)) {
        return true;
    } else {
        return false;
    }
}

function emptyDirsForTranslate(){
    if(is_file(PLAYGROUND_OUT_PATH . 'result.out')){
        @unlink(PLAYGROUND_OUT_PATH . 'result.out');
    }
    delDir(PLAYGROUND_OUT_JAVA_PATH);
    delDir(PLAYGROUND_OUT_TOKEN_PATH);
    delDir(PLAYGROUND_OUT_TREE_PATH);
}

function emptyDirsForBuild(){
    delDir(PLAYGROUND_OUT_BIN_PATH);
}

function characet($data){
	  if( !empty($data) ){
            $fileType = mb_detect_encoding($data , array('UTF-8','GBK','LATIN1','BIG5')) ;
            if( $fileType != 'UTF-8'){
                $data = mb_convert_encoding($data ,'utf-8' , $fileType);
            }
	  }
	  return $data;
}