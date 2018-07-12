 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTLabeledStatementVisitor
   extends Visitor
 {
   public ASTLabeledStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     SimpleNode subnode = (SimpleNode)this.node.jjtGetFirstChild();
     int index = this.tokens.indexOf(subnode.getTokens().first());
     add(this.tokens.needleTokens(0, index - 1));
     subnode.jjtAccept(defaultVisitor, this.ctx);
   }
 }




