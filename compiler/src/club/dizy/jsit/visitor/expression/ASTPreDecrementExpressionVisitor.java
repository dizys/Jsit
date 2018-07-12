 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTPreDecrementExpressionVisitor
   extends Visitor
 {
   public ASTPreDecrementExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("--");
   }
   
   public void after() {}
 }




