 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTCastExpression
   extends SimpleNode
 {
   public ASTCastExpression(int id)
   {
     super(id);
   }
   
   public ASTCastExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTCastExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTCastExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




