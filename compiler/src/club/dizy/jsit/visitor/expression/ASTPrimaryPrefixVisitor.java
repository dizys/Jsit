 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.expression.ASTExpression;
 import club.dizy.jsit.node.expression.ASTResultType;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTPrimaryPrefixVisitor
   extends Visitor
 {
   public ASTPrimaryPrefixVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if (this.node.jjtGetFirstChild() == null)
     {
       add(this.tokens.needleTokens(0, -1));
     }
     else if ((this.node.jjtGetFirstChild() instanceof ASTExpression))
     {
       add("(");
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       add(")");
     }
     else if ((this.node.jjtGetFirstChild() instanceof ASTResultType))
     {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       add(".");
       add("class");
     }
     else
     {
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




