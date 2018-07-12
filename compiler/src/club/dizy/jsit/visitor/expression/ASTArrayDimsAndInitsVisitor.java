 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTArrayDimsAndInitsVisitor
   extends Visitor
 {
   public ASTArrayDimsAndInitsVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     if (((Token)this.tokens.get(1)).is("]"))
     {
       add("[]");
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     }
     else
     {
       add("[");
       this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
       add("]");
       SimpleNode first = (SimpleNode)this.node.jjtGetFirstChild();
       int index = this.tokens.indexOf(first.getTokens().last());
       String left = this.tokens.needleTokens(index + 2, -1);
       add(left);
     }
   }
 }




