 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTExpression;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTSwitchLabelVisitor
   extends Visitor
 {
   public ASTSwitchLabelVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if ((this.node.jjtGetFirstChild() instanceof ASTExpression))
     {
       add("case ");
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       add(":\n");
     }
     else
     {
       add("default:\n");
     }
   }
 }




