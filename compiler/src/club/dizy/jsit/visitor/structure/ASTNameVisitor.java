 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTNameVisitor
   extends Visitor
 {
   public ASTNameVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add(this.tokens.needleTokens(0, -1));
   }
   
   public void after() {}
 }




