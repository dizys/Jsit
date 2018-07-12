 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTArgumentsVisitor
   extends Visitor
 {
   public ASTArgumentsVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("(");
   }
   
   public void after()
   {
     add(")");
   }
 }




