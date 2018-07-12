 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTConditionalExpression
   extends SimpleNode
 {
   public ASTConditionalExpression(int id)
   {
     super(id);
   }
   
   public ASTConditionalExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTConditionalExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTConditionalExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




