 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTAllocationExpression
   extends SimpleNode
 {
   public ASTAllocationExpression(int id)
   {
     super(id);
   }
   
   public ASTAllocationExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTAllocationExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTAllocationExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




