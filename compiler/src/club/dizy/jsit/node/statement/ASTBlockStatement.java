 package club.dizy.jsit.node.statement;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTBlockStatement
   extends SimpleNode
 {
   public ASTBlockStatement(int id)
   {
     super(id);
   }
   
   public ASTBlockStatement(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTBlockStatement(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTBlockStatement(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




