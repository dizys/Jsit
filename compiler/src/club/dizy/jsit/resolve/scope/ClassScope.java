 package club.dizy.jsit.resolve.scope;
 
 public class ClassScope
   extends Scope
 {
   protected String className;
   
   public ClassScope(Scope parent, String className)
   {
     super(parent);
     this.className = className;
   }
   
   public String getClassName()
   {
     return this.className;
   }
 }




