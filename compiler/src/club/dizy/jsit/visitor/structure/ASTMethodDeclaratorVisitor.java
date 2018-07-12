 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTMethodDeclaratorVisitor
   extends Visitor
 {
   public ASTMethodDeclaratorVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     String methodName = this.tokens.getImage(0);
     add(methodName + " ");
   }
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     super.visitChildren(defaultVisitor);
     SimpleNode subNode = (SimpleNode)this.node.jjtGetChild(0);
     int indexOfStart = this.node.getTokens().indexOf(subNode.getTokens().last());
     String leftTokens = this.node.getTokens().needleTokens(indexOfStart + 1, -1);
     add(leftTokens + " ");
   }
 }




