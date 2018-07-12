 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTExpression;
 import club.dizy.jsit.node.statement.ASTForInit;
 import club.dizy.jsit.node.statement.ASTForUpdate;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTForStatementVisitor
   extends Visitor
 {
   public ASTForStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("for ");
     add("(");
     int i = -1;
     if ((this.node.jjtGetChild(++i) instanceof ASTForInit)) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     } else {
       i--;
     }
     add(" ; ");
     if ((this.node.jjtGetChild(++i) instanceof ASTExpression)) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     } else {
       i--;
     }
     add(" ; ");
     if ((this.node.jjtGetChild(++i) instanceof ASTForUpdate)) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     } else {
       i--;
     }
     add(")");
     this.node.jjtGetChild(++i).jjtAccept(defaultVisitor, this.ctx);
   }
 }




