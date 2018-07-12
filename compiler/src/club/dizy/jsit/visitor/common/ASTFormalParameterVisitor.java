 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTFormalParameterVisitor
   extends Visitor
 {
   public ASTFormalParameterVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetLastChild().jjtAccept(defaultVisitor, this.ctx);
     add(" ");
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
   }
 }




