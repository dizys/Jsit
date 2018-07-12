 package club.dizy.jsit.node.statement;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTContinueStatement
   extends SimpleNode
 {
   public ASTContinueStatement(int id)
   {
     super(id);
   }
   
   public ASTContinueStatement(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTContinueStatement(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTContinueStatement(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




