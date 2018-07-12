 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTExpression;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTReturnStatementVisitor
   extends Visitor
 {
   public ASTReturnStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("return ");
     if ((this.node.jjtGetFirstChild() instanceof ASTExpression)) {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     }
     add(";");
   }
 }




