 package club.dizy.jsit.visitor.common;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTInitializerVisitor
   extends Visitor
 {
   public ASTInitializerVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     if (((Token)this.tokens.get(0)).is("static")) {
       startLineWith(this.tokens.getImage(0) + " ");
     }
   }
   
   public void after() {}
 }




