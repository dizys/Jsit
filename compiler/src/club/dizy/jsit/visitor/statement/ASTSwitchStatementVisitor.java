 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTSwitchStatementVisitor
   extends Visitor
 {
   public ASTSwitchStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("switch ");
     add("(");
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     add(")");
     add("{");
     int i = 0;
     while (this.node.jjtGetChild(++i) != null) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
     add("}");
   }
 }




