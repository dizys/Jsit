 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTPrimaryExpression;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTExplicitConstructorInvocationVisitor
   extends Visitor
 {
   public ASTExplicitConstructorInvocationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if (this.tokens.first().is("this"))
     {
       add("this");
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       add(";");
     }
     else
     {
       int i = -1;
       if ((this.node.jjtGetChild(++i) instanceof ASTPrimaryExpression))
       {
         this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
         add(".");
       }
       else
       {
         i--;
       }
       add("super");
       this.node.jjtGetChild(++i).jjtAccept(defaultVisitor, this.ctx);
       add(";");
     }
   }
 }




