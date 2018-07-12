 package club.dizy.jsit.node.statement;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTSwitchLabel
   extends SimpleNode
 {
   public ASTSwitchLabel(int id)
   {
     super(id);
   }
   
   public ASTSwitchLabel(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTSwitchLabel(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTSwitchLabel(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




