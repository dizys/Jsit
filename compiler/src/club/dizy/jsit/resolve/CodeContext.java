 package club.dizy.jsit.resolve;
 
 import java.util.ArrayList;
 
 public class CodeContext
 {
   protected ArrayList<String> codes;
   
   public CodeContext()
   {
     this.codes = new ArrayList();
   }
   
   public CodeContext addLine(int lineNo, String code)
   {
     this.codes.add(" " + code + "\n");
     return this;
   }
   
   public CodeContext add(String code)
   {
     this.codes.add(code);
     return this;
   }
   
   public CodeContext startLineWith(int lineNo, String code)
   {
     this.codes.add(" " + code);
     return this;
   }
   
   public String getCodes()
   {
     StringBuffer result = new StringBuffer();
     for (String code : this.codes) {
       result.append(code);
     }
     result.append("\n");
     return result.toString();
   }
 }




