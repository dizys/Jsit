 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.statement.ASTBlock;
 import club.dizy.jsit.node.structure.ASTNameList;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTMethodDeclarationVisitor
   extends Visitor
 {
   public ASTMethodDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     int i = 0;
     boolean accessModified = false;
     startLineWith("");
     String[] availbles = { "public", "protected", "private", "static", "abstract" };
     String[] accessAvailbles = { "public", "protected", "private" };
     String modifications = "";
     while (((Token)this.tokens.get(i)).in(availbles))
     {
       modifications = modifications + this.tokens.getImage(i) + " ";
       if ((((Token)this.tokens.get(i)).in(accessAvailbles)) && (!accessModified)) {
         accessModified = true;
       }
       i++;
     }
     if (!accessModified) {
       add("public ");
     }
     add(modifications);
   }
   
   public void after() {}
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     Node resultTypeNode = this.node.jjtGetChild(1);
     resultTypeNode.jjtAccept(defaultVisitor, this.ctx);
     add(" ");
     Node methodDeclaratorNode = this.node.jjtGetChild(0);
     methodDeclaratorNode.jjtAccept(defaultVisitor, this.ctx);
     int i = 1;
     if ((this.node.jjtGetChild(++i) instanceof ASTNameList))
     {
       add("throws ");
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
     else
     {
       i--;
     }
     if ((this.node.jjtGetChild(++i) instanceof ASTBlock))
     {
       add("\n");
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
     }
     else
     {
       add(";\n");
     }
   }
 }




