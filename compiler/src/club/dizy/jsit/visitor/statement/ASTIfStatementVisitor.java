 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.statement.ASTStatement;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTIfStatementVisitor
   extends Visitor
 {
   public ASTIfStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("if ");
     add("(");
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     add(")\n");
     this.node.jjtGetChild(1).jjtAccept(defaultVisitor, this.ctx);
     if ((this.node.jjtGetChild(2) instanceof ASTStatement))
     {
       add(" else ");
       this.node.jjtGetChild(2).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




