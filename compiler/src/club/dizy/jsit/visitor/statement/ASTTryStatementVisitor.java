 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.common.ASTFormalParameter;
 import club.dizy.jsit.node.statement.ASTBlock;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTTryStatementVisitor
   extends Visitor
 {
   public ASTTryStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     add("try ");
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     int i = 0;
     while ((this.node.jjtGetChild(++i) instanceof ASTFormalParameter))
     {
       add("catch ");
       add("(");
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
       add(")");
       this.node.jjtGetChild(++i).jjtAccept(defaultVisitor, this.ctx);
     }
     if ((this.node.jjtGetChild(i) instanceof ASTBlock)) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




