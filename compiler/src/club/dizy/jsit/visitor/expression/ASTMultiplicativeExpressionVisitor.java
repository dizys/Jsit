 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTUnaryExpression;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTMultiplicativeExpressionVisitor
   extends Visitor
 {
   public ASTMultiplicativeExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     int i = 0;
     while ((this.node.jjtGetChild(++i) instanceof ASTUnaryExpression))
     {
       SimpleNode subnode = (SimpleNode)this.node.jjtGetChild(i);
       int index = this.node.getTokens().indexOf(subnode.getTokens().first());
       String sign = this.node.getTokens().getImage(index - 1);
       add(sign);
       subnode.jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




