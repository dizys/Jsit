 package club.dizy.jsit.node.expression;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTPrimaryPrefix
   extends SimpleNode
 {
   public ASTPrimaryPrefix(int id)
   {
     super(id);
   }
   
   public ASTPrimaryPrefix(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTPrimaryPrefix(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTPrimaryPrefix(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




