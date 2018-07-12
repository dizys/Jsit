 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTBlockVisitor
   extends Visitor
 {
   public ASTBlockVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     addLine("{");
   }
   
   public void after()
   {
     addLine(this.endLine, "}");
   }
 }




