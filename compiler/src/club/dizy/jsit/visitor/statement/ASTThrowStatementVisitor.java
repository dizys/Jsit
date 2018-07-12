 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTThrowStatementVisitor
   extends Visitor
 {
   public ASTThrowStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("throw");
   }
   
   public void after()
   {
     add(";");
   }
 }




