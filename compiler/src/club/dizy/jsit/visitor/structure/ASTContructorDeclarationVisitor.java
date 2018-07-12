 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.structure.ASTNameList;
 import club.dizy.jsit.resolve.ScopeContext;
 import club.dizy.jsit.resolve.scope.Scope;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTContructorDeclarationVisitor
   extends Visitor
 {
   public ASTContructorDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     String[] availbles = { "public", "protected", "private" };
     if (((Token)this.tokens.get(0)).in(availbles)) {
       startLineWith(this.tokens.getImage(0) + " ");
     } else {
       startLineWith("public ");
     }
     String classname = this.sctx.getNowScope().findClassName();
     add(classname + " ");
   }
   
   public void after()
   {
     addLine(this.endLine, "}");
   }
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     int i = 0;
     Node thisNode = this.node.jjtGetChild(i);
     thisNode.jjtAccept(defaultVisitor, this.ctx);
     thisNode = this.node.jjtGetChild(++i);
     if ((thisNode instanceof ASTNameList))
     {
       add("throws ");
       thisNode.jjtAccept(defaultVisitor, this.ctx);
       i++;
     }
     else
     {
       i--;
     }
     add("\n");
     addLine("{");
     i++;
     for (int j = i; j < this.node.jjtGetNumChildren(); j++) {
       this.node.jjtGetChild(j).jjtAccept(defaultVisitor, this.ctx);
     }
   }
 }




