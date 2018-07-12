 package club.dizy.jsit.output;
 
 import club.dizy.jsit.resolve.CodeContext;
 import club.dizy.jsit.resolve.CompileContext;
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;
 
 public class Out
 {
   protected String mPath;
   protected String mOutPath;
   protected FileWriter mResult;
   
   public Out(String path)
     throws Exception
   {
     this.mPath = path;
     String outPath = path + "/out";
     this.mOutPath = outPath;
     createDir(outPath);
     createDir(outPath + "/token");
     createDir(outPath + "/tree");
     createDir(outPath + "/java");
     File fileResult = new File(outPath + "/result.out");
     fileResult.createNewFile();
     this.mResult = new FileWriter(fileResult, true);
   }
   
   public void createDir(String path)
   {
     File pathFile = new File(path);
     if (!pathFile.exists()) {
       pathFile.mkdirs();
     }
   }
   
   public void print(String text)
   {
     try
     {
       this.mResult.append(text);
     }
     catch (IOException e)
     {
       e.printStackTrace();
     }
   }
   
   public void println(String text)
   {
     print(text + "\n");
     print("==========\n");
   }
   
   public void handleCtx(String filename, CompileContext ctx)
   {
     File file = new File(filename);
     filename = file.getName();
     TokensOut tokensOut = new TokensOut(ctx.getTokenList());
     writeToFile(this.mOutPath + "/token/" + filename + ".txt", tokensOut.toJson());
     TreesOut treesOut = new TreesOut(ctx.getRootNode());
     writeToFile(this.mOutPath + "/tree/" + filename + ".txt", treesOut.toJson());
     writeToFile(this.mOutPath + "/java/" + FileUtils.getShortName(filename) + ".java", ctx.getCodeCtx().getCodes());
   }
   
   public void writeToFile(String filename, String body)
   {
     File file = new File(filename);
     if (!file.exists()) {
       try
       {
         file.createNewFile();
       }
       catch (IOException e)
       {
         e.printStackTrace();
       }
     }
     try
     {
       FileWriter fileWriter = new FileWriter(file);
       fileWriter.write(body);
       fileWriter.close();
     }
     catch (IOException e)
     {
       e.printStackTrace();
     }
   }
   
   public void close()
   {
     try
     {
       this.mResult.close();
     }
     catch (IOException e)
     {
       e.printStackTrace();
     }
   }
 }




