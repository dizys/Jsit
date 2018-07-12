 package club.dizy.jsit.node.common;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTVariableDeclaratorId
   extends SimpleNode
 {
   public ASTVariableDeclaratorId(int id)
   {
     super(id);
   }
   
   public ASTVariableDeclaratorId(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTVariableDeclaratorId(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTVariableDeclaratorId(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




