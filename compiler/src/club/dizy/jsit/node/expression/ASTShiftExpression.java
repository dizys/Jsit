 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTShiftExpression
   extends SimpleNode
 {
   public ASTShiftExpression(int id)
   {
     super(id);
   }
   
   public ASTShiftExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTShiftExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTShiftExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




