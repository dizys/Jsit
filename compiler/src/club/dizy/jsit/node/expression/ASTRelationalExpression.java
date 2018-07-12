 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTRelationalExpression
   extends SimpleNode
 {
   public ASTRelationalExpression(int id)
   {
     super(id);
   }
   
   public ASTRelationalExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTRelationalExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTRelationalExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




