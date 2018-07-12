 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTNamespaceDeclarationVisitor
   extends Visitor
 {
   public ASTNamespaceDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     startLineWith("package ");
   }
   
   public void after()
   {
     add(";\n");
   }
 }




