 package club.dizy.jsit.visitor.statement;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTContinueStatementVisitor
   extends Visitor
 {
   public ASTContinueStatementVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add(this.tokens.needleTokens(0, -1));
   }
   
   public void after() {}
 }




