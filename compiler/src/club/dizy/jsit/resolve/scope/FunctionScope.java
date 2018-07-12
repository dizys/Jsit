 package club.dizy.jsit.resolve.scope;
 
 public class FunctionScope
   extends Scope
 {
   protected String functionName;
   
   public FunctionScope(Scope parent, String functionName)
   {
     super(parent);
     this.functionName = functionName;
   }
   
   public String getFunctionName()
   {
     return this.functionName;
   }
 }




