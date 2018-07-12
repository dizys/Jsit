 package club.dizy.jsit.visitor.expression;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTPrimitiveTypeVisitor
   extends Visitor
 {
   public ASTPrimitiveTypeVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     String type = this.tokens.needleTokens(0, -1);
     if (type.equals("string")) {
       add("String");
     } else if (type.equals("number")) {
       add("club.dizy.Jsit.lang.Number");
     } else if (type.equals("byte")) {
       add("byte");
     } else if (type.equals("boolean")) {
       add("boolean");
     }
   }
   
   public void after() {}
 }




