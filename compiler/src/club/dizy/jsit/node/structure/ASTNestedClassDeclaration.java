 package club.dizy.jsit.node.structure;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTNestedClassDeclaration
   extends SimpleNode
 {
   public ASTNestedClassDeclaration(int id)
   {
     super(id);
   }
   
   public ASTNestedClassDeclaration(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTNestedClassDeclaration(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTNestedClassDeclaration(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




