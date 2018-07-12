 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTEqualityExpression
   extends SimpleNode
 {
   public ASTEqualityExpression(int id)
   {
     super(id);
   }
   
   public ASTEqualityExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTEqualityExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTEqualityExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




