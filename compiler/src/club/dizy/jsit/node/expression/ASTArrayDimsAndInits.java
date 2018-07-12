 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTArrayDimsAndInits
   extends SimpleNode
 {
   public ASTArrayDimsAndInits(int id)
   {
     super(id);
   }
   
   public ASTArrayDimsAndInits(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTArrayDimsAndInits(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTArrayDimsAndInits(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




