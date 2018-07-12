 package club.dizy.jsit.node.structure;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTMethodDeclarationLookahead
   extends SimpleNode
 {
   public ASTMethodDeclarationLookahead(int id)
   {
     super(id);
   }
   
   public ASTMethodDeclarationLookahead(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTMethodDeclarationLookahead(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTMethodDeclarationLookahead(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




