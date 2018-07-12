 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTLiteralVisitor
   extends Visitor
 {
   public ASTLiteralVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add(this.tokens.needleTokens(0, -1));
   }
   
   public void after() {}
 }




