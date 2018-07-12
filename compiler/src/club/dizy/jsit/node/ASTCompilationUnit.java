 package club.dizy.jsit.node;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.resolve.CompileContext;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTCompilationUnit
   extends SimpleNode
 {
   public ASTCompilationUnit(int id)
   {
     super(id);
   }
   
   public ASTCompilationUnit(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTCompilationUnit(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTCompilationUnit(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     getCtx(data).setTokenList(getTokens());
     getCtx(data).setRootNode(this);
     return visitor
       .visit(this, data);
   }
 }




