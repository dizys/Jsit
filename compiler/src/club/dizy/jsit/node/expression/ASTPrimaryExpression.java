 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTPrimaryExpression
   extends SimpleNode
 {
   public ASTPrimaryExpression(int id)
   {
     super(id);
   }
   
   public ASTPrimaryExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTPrimaryExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTPrimaryExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




