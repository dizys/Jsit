 package club.dizy.jsit.node.statement;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTForStatement
   extends SimpleNode
 {
   public ASTForStatement(int id)
   {
     super(id);
   }
   
   public ASTForStatement(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTForStatement(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTForStatement(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




