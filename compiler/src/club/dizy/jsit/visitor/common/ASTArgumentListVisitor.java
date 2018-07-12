 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTExpression;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTArgumentListVisitor
   extends Visitor
 {
   public ASTArgumentListVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     int i = 0;
     while ((this.node.jjtGetChild(++i) instanceof ASTExpression))
     {
       add(",");
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




