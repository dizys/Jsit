 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTVariableDeclaratorIdVisitor
   extends Visitor
 {
   public ASTVariableDeclaratorIdVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     String variableName = this.tokens.getImage(0);
     add(variableName + " ");
     String left = this.tokens.needleTokens(1, -1);
     add(left);
   }
   
   public void after() {}
 }




