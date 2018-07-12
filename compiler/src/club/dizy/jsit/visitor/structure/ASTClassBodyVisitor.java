 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTClassBodyVisitor
   extends Visitor
 {
   public ASTClassBodyVisitor(SimpleNode node, Object data)
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




