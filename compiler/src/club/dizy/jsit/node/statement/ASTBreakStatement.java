 package club.dizy.jsit.node.statement;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTBreakStatement
   extends SimpleNode
 {
   public ASTBreakStatement(int id)
   {
     super(id);
   }
   
   public ASTBreakStatement(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTBreakStatement(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTBreakStatement(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




