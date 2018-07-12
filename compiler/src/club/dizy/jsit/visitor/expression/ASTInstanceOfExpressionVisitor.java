 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTType;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTInstanceOfExpressionVisitor
   extends Visitor
 {
   public ASTInstanceOfExpressionVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     if ((this.node.jjtGetChild(1) instanceof ASTType))
     {
       add(" instanceof ");
       this.node.jjtGetChild(1).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




