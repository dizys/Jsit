 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTConditionalAndExpression
   extends SimpleNode
 {
   public ASTConditionalAndExpression(int id)
   {
     super(id);
   }
   
   public ASTConditionalAndExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTConditionalAndExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTConditionalAndExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




