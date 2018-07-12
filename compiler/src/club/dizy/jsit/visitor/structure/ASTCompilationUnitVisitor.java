 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.structure.ASTTypeDeclaration;
 import club.dizy.jsit.resolve.CodeContext;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTCompilationUnitVisitor
   extends Visitor
 {
   public ASTCompilationUnitVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before() {}
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     int childNum = this.node.jjtGetNumChildren();
     boolean foundFirst = false;
     for (int i = 0; i < childNum; i++)
     {
       Node nowNode = this.node.jjtGetChild(i);
       if ((!foundFirst) && ((nowNode instanceof ASTTypeDeclaration)))
       {
         this.cctx.addLine(0, "import java.lang.*;");
         foundFirst = true;
       }
       nowNode.jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




