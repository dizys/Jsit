 package club.dizy.jsit.resolve;
 
 import club.dizy.jsit.resolve.scope.Scope;
 
 public class ScopeContext
 {
   protected Scope rootScope;
   protected Scope nowScope;
   
   public ScopeContext()
   {
     this.rootScope = new Scope(null);
     this.nowScope = this.rootScope;
   }
   
   public Scope getNowScope()
   {
     return this.nowScope;
   }
   
   public Scope getRootScope()
   {
     return this.rootScope;
   }
   
   public Scope getIn(Scope scope)
   {
     this.nowScope.addChild(scope);
     this.nowScope = scope;
     return scope;
   }
   
   public Scope getOut()
   {
     if (this.nowScope.getParent() == null) {
       return null;
     }
     this.nowScope = this.nowScope.getParent();
     return this.nowScope;
   }
 }




