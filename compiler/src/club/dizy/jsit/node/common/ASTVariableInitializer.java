 package club.dizy.jsit.node.common;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTVariableInitializer
   extends SimpleNode
 {
   public ASTVariableInitializer(int id)
   {
     super(id);
   }
   
   public ASTVariableInitializer(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTVariableInitializer(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTVariableInitializer(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




