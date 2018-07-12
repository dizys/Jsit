 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTPreDecrementExpression
   extends SimpleNode
 {
   public ASTPreDecrementExpression(int id)
   {
     super(id);
   }
   
   public ASTPreDecrementExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTPreDecrementExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTPreDecrementExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




