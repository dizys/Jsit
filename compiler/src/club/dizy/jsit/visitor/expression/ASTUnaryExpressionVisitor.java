 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTUnaryExpression;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTUnaryExpressionVisitor
   extends Visitor
 {
   public ASTUnaryExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if ((this.node.jjtGetFirstChild() instanceof ASTUnaryExpression)) {
       add(this.node.getTokens().firstImage());
     }
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
   }
 }




