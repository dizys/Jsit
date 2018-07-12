 package club.dizy.jsit.output;
 
 import java.io.File;
 
 public class FileUtils
 {
   public static String getFilePath(String file)
   {
     File pfile = new File(file).getAbsoluteFile();
     return pfile.getParentFile().getAbsolutePath();
   }
   
   public static String getShortName(String filename)
   {
     return filename.substring(0, filename.lastIndexOf("."));
   }
 }




