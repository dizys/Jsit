 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTStatementExpressionList
   extends SimpleNode
 {
   public ASTStatementExpressionList(int id)
   {
     super(id);
   }
   
   public ASTStatementExpressionList(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTStatementExpressionList(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTStatementExpressionList(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




