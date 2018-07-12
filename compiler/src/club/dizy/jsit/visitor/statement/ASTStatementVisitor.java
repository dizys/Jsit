 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTStatementExpression;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTStatementVisitor
   extends Visitor
 {
   public ASTStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     startLineWith("");
   }
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     if ((this.node.jjtGetFirstChild() instanceof ASTStatementExpression)) {
       add(";");
     }
     add("\n");
   }
 }




