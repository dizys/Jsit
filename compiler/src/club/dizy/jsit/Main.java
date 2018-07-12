 package club.dizy.jsit;
 
 import club.dizy.jsit.node.ASTCompilationUnit;
 import club.dizy.jsit.output.FileUtils;
 import club.dizy.jsit.output.Out;
 import club.dizy.jsit.resolve.CompileContext;
 import club.dizy.jsit.visitor.JsitParserDefaultVisitor;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.PrintStream;
 
 public class Main
 {
   public static void main(String[] args)
   {
                Out out;
                JsitParser parser;
     if (args.length == 0)
     {
       System.out.println("Please add files to compile.");
       return;
     }
     try
     {
       out = new Out(FileUtils.getFilePath(args[0]));
     }
     catch (Exception e)
     {
       e.printStackTrace(); return;
     }
     for (int i = 0; i < args.length; i++)
     {
       try
       {
         parser = new JsitParser(new FileInputStream(args[i]));
       }
       catch (FileNotFoundException e)
       {
         out.println("Failed: File " + args[i] + " failed to parse.");
         out.println("File " + args[i] + " not found.");
         break;
       }
       try
       {
         ASTCompilationUnit u = parser.CompilationUnit();
         JsitParserDefaultVisitor visitor = new JsitParserDefaultVisitor();
         CompileContext data = new CompileContext();
         u.jjtAccept(visitor, data);
         out.handleCtx(args[i], data);
         out.println("Success: File " + args[i] + " parsed successfully.");
       }
       catch (ParseException e)
       {
         out.println("Failed: File " + args[i] + " failed to parse.");
         out.println(e.getMessage());
       }
     }
     System.out.println("Translation finished.");
     out.close();
   }
 }




