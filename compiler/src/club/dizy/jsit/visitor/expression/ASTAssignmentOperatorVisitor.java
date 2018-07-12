 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTAssignmentOperatorVisitor
   extends Visitor
 {
   public ASTAssignmentOperatorVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add(this.tokens.getImage(0) + " ");
   }
   
   public void after() {}
 }




