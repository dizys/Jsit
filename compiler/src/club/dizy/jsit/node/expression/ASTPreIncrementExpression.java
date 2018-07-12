 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTPreIncrementExpression
   extends SimpleNode
 {
   public ASTPreIncrementExpression(int id)
   {
     super(id);
   }
   
   public ASTPreIncrementExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTPreIncrementExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTPreIncrementExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




