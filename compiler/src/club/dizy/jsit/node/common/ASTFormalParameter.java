 package club.dizy.jsit.node.common;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTFormalParameter
   extends SimpleNode
 {
   public ASTFormalParameter(int id)
   {
     super(id);
   }
   
   public ASTFormalParameter(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTFormalParameter(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTFormalParameter(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




