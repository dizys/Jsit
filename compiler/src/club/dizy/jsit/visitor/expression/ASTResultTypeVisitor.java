 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTResultTypeVisitor
   extends Visitor
 {
   public ASTResultTypeVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if (this.node.jjtGetFirstChild() == null) {
       add("void");
     } else {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




