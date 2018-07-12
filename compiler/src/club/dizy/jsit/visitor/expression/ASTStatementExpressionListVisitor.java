 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTStatementExpression;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTStatementExpressionListVisitor
   extends Visitor
 {
   public ASTStatementExpressionListVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     int i = 0;
     while ((this.node.jjtGetChild(++i) instanceof ASTStatementExpression))
     {
       add(",");
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




