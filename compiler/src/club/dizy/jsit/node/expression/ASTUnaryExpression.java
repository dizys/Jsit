 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTUnaryExpression
   extends SimpleNode
 {
   public ASTUnaryExpression(int id)
   {
     super(id);
   }
   
   public ASTUnaryExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTUnaryExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTUnaryExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




