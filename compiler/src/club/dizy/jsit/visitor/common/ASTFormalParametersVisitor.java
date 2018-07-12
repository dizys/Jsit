 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.common.ASTFormalParameter;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTFormalParametersVisitor
   extends Visitor
 {
   public ASTFormalParametersVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("(");
   }
   
   public void after()
   {
     add(") ");
   }
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if ((this.node.jjtGetFirstChild() instanceof ASTFormalParameter))
     {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       int i = 0;
       while ((this.node.jjtGetChild(++i) instanceof ASTFormalParameter))
       {
         add(", ");
         this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
       }
     }
   }
 }




