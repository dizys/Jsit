 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTAllocationExpressionVisitor
   extends Visitor
 {
   public ASTAllocationExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("new ");
   }
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     int i = -1;
     while (this.node.jjtGetChild(++i) != null) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




