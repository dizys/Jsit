 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTStatementExpression
   extends SimpleNode
 {
   public ASTStatementExpression(int id)
   {
     super(id);
   }
   
   public ASTStatementExpression(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTStatementExpression(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTStatementExpression(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




