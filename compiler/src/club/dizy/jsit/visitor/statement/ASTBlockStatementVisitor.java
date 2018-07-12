 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.common.ASTLocalVariableDeclaration;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTBlockStatementVisitor
   extends Visitor
 {
   public ASTBlockStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if ((this.node.jjtGetFirstChild() instanceof ASTLocalVariableDeclaration)) {
       startLineWith("");
     }
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     if ((this.node.jjtGetFirstChild() instanceof ASTLocalVariableDeclaration)) {
       add(";\n");
     }
   }
 }




