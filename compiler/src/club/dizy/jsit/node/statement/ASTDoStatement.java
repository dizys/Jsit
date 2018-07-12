 package club.dizy.jsit.node.statement;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTDoStatement
   extends SimpleNode
 {
   public ASTDoStatement(int id)
   {
     super(id);
   }
   
   public ASTDoStatement(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTDoStatement(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTDoStatement(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




