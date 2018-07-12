 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.structure.ASTInterfaceMemberDeclaration;
 import club.dizy.jsit.node.structure.ASTNameList;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTUnmodifiedInterfaceDeclarationVisitor
   extends Visitor
 {
   public ASTUnmodifiedInterfaceDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("interface ");
     String interfaceName = this.tokens.getImage(1);
     add(interfaceName + " ");
   }
   
   public void after()
   {
     addLine(this.endLine, "}");
   }
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     int i = -1;
     if ((this.node.jjtGetChild(++i) instanceof ASTNameList))
     {
       add("extends ");
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
     else
     {
       i--;
     }
     add("\n");
     addLine("{");
     while ((this.node.jjtGetChild(++i) instanceof ASTInterfaceMemberDeclaration)) {
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




