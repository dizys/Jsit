 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTDoStatementVisitor
   extends Visitor
 {
   public ASTDoStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("do ");
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     add(" while ");
     add("(");
     this.node.jjtGetLastChild().jjtAccept(defaultVisitor, this.ctx);
     add(");");
   }
 }




