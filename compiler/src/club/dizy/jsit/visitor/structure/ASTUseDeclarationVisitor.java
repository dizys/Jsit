 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTUseDeclarationVisitor
   extends Visitor
 {
   public ASTUseDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     addLine("import " + needleTokens(1, -2) + ";");
   }
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor) {}
 }




