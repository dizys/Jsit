 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTAssignmentOperator;
 import club.dizy.jsit.node.expression.ASTPrimaryExpression;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTStatementExpressionVisitor
   extends Visitor
 {
   public ASTStatementExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if ((this.node.jjtGetFirstChild() instanceof ASTPrimaryExpression))
     {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       if ((this.node.jjtGetChild(1) instanceof ASTAssignmentOperator))
       {
         this.node.jjtGetChild(1).jjtAccept(defaultVisitor, this.ctx);
         this.node.jjtGetChild(2).jjtAccept(defaultVisitor, this.ctx);
       }
       else
       {
         SimpleNode subnode = (SimpleNode)this.node.jjtGetFirstChild();
         int index = this.node.getTokens().indexOf(subnode.getTokens().last());
         String left = this.node.getTokens().needleTokens(index + 1, -1);
         add(left);
       }
     }
     else if (this.node.jjtGetFirstChild() != null)
     {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




