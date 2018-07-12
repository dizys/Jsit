 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTCastExpressionVisitor
   extends Visitor
 {
   public ASTCastExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("(");
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     add(")");
     this.node.jjtGetChild(1).jjtAccept(defaultVisitor, this.ctx);
   }
 }




