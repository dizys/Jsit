 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.common.ASTVariableInitializer;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTVariableDeclaratorVisitor
   extends Visitor
 {
   public ASTVariableDeclaratorVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetChild(1).jjtAccept(defaultVisitor, this.ctx);
     add(" ");
     this.node.jjtGetChild(0).jjtAccept(defaultVisitor, this.ctx);
     if ((this.node.jjtGetChild(2) instanceof ASTVariableInitializer))
     {
       add("= ");
       this.node.jjtGetChild(2).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




