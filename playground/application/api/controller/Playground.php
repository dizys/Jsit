<?php
/**
 * Created by PhpStorm.
 * User: Dizy
 * Date: 2018/5/30
 * Time: 16:50
 */

namespace app\api\controller;


use app\base\controller\Api;

class Playground extends Api
{
    public function list_codes(){
        $lists = [];
        foreach(glob(PLAYGROUND_PATH . DS . '*' .'.jst') as $file)
        {
            $lastDsPos = strrpos($file, DS);
            $filename = substr($file, $lastDsPos + 1);
            array_push($lists, $filename);
        }
        s('success', $lists);
    }

    public function get_content($code){
        if(file_exists(PLAYGROUND_PATH . $code)){
            $code = file_get_contents(PLAYGROUND_PATH . $code);
            s('success', $code);
        }else{
            e(1, 'File not exists');
        }
    }

    public function write_content($code){
        if(file_exists(PLAYGROUND_PATH . $code)){
            $content = input('post.content');
            file_put_contents(PLAYGROUND_PATH . $code, $content);
            s();
        }else{
            e(1, 'File not exists');
        }
    }

    public function delete($code){
        $file = PLAYGROUND_PATH . DS . $code;
        if(is_file($file)){
            unlink($file);
            s();
        }else{
            e(1, 'No such file');
        }
    }

    public function add($code){
        $className = mrtrim($code, '.jst');
        $file = PLAYGROUND_PATH . DS . $className . '.jst';
        if(!is_file($file)){
            file_put_contents($file, getInitJst($className));
            s('success', ['filename' => $className.'.jst']);
        }else{
            e(1, 'File already exists');
        }
    }

    public function translate(){
        $lists = "";
        emptyDirsForTranslate();
        foreach(glob(PLAYGROUND_PATH . '*' .'.jst') as $file)
        {
            $lastDsPos = strrpos($file, DS);
            $filename = substr($file, $lastDsPos + 1);
            $lists .= PLAYGROUND_PATH . $filename." ";
        }
        $resultOut = null;
        $out = shell_exec("java -jar " . PLAYGROUND_PATH . "jsit.jar ". $lists);
        if(is_file(PLAYGROUND_OUT_PATH . "result.out")){
            $resultOut = file_get_contents(PLAYGROUND_OUT_PATH . "result.out");
        }
        s(null, [
            'stdout' => $out,
            'out' => $resultOut
        ]);
    }

    public function show_token($code){
        $token = file_get_contents(PLAYGROUND_OUT_TOKEN_PATH . $code . ".txt");
        $token = json_decode($token);
        if($token){
            s('success', $token->data);
        }else{
            e(1, 'Invalid token table');
        }
    }

    public function show_ast($code){
        $ast = file_get_contents(PLAYGROUND_OUT_TREE_PATH . $code . ".txt");
        $ast = json_decode($ast);
        if($ast){
            s('success', $ast);
        }else{
            e(1, 'Invalid AST');
        }
    }

    public function build(){
        $javaOutFile = PLAYGROUND_OUT_PATH . "javac.out";
        emptyDirsForBuild();
        $javaOut = null;
        @mkdir(PLAYGROUND_OUT_BIN_PATH);
        $coms = "javac " . PLAYGROUND_OUT_JAVA_PATH . "*.java"  . "  -d " . PLAYGROUND_OUT_BIN_PATH . " 2> ". $javaOutFile;
        system($coms, $returnVal);
        if(is_file($javaOutFile)){
            $javaOut = file_get_contents($javaOutFile);
            $javaOut = characet($javaOut);
        }
        s('success', [
            'ret' => $returnVal,
            'out' => $javaOut,
        ]);
    }

    public function run($entrance){
        $className = mrtrim($entrance, '.jst');
        if(!is_file(PLAYGROUND_PATH . $entrance)){
            e(1, 'Entrance file not exists');
        }
        if(!is_file(PLAYGROUND_OUT_BIN_PATH  . $className . ".class")){
            e(2, 'Entrance hasn\'s been built');
        }
        $errorOutFile = PLAYGROUND_OUT_PATH . "run.out";
        $errorOut = null;
        $t1 = microtime(true);
        exec("java -classpath " . PLAYGROUND_OUT_BIN_PATH . " " . $className . " 2> " . $errorOutFile, $output, $retVal);
        $t2 = microtime(true);
        if(is_file($errorOutFile)){
            $errorOut = file_get_contents($errorOutFile);
            $errorOut = characet($errorOut);
        }
        $time = $t2 - $t1;
        //$time = $time > 0 ? $time : 0;
        s('success', [
            'ret' => $retVal,
            'out' => $output,
            'error' => $errorOut,
            'time' => round($time,4)
        ]);
    }

    public function download_binaries(){
        $binariesTar = PLAYGROUND_OUT_PATH . "binaries.tar.gz";
        if(is_file($binariesTar)){
            @unlink($binariesTar);
        }
        shell_exec("tar -cvzf  " . $binariesTar . " -C " . PLAYGROUND_OUT_PATH . " bin");
        $this->redirect("http://jsit.trealent.com/playground/out/binaries.tar.gz");
    }
}