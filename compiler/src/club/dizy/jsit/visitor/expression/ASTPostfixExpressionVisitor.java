 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTPostfixExpressionVisitor
   extends Visitor
 {
   public ASTPostfixExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     SimpleNode subnode = (SimpleNode)this.node.jjtGetFirstChild();
     int index = this.node.getTokens().indexOf(subnode.getTokens().last());
     String postfix = this.node.getTokens().needleTokens(index + 1, -1);
     add(postfix);
   }
 }




