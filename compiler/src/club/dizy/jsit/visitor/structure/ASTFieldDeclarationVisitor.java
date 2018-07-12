 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.node.common.ASTVariableDeclarator;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTFieldDeclarationVisitor
   extends Visitor
 {
   protected String reusedModification;
   
   public ASTFieldDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     int i = 0;
     startLineWith("");
     String[] availables = { "public", "protected", "private", "static", "const" };
     boolean isAccessibleModiefied = false;
     String modifiedBuffer = "";
     while (((Token)this.tokens.get(i)).in(availables))
     {
       if (((Token)this.tokens.get(i)).is("const"))
       {
         modifiedBuffer = modifiedBuffer + "final ";
       }
       else if (((Token)this.tokens.get(i)).is("static"))
       {
         modifiedBuffer = modifiedBuffer + "static ";
       }
       else
       {
         modifiedBuffer = modifiedBuffer + this.tokens.getImage(i) + " ";
         isAccessibleModiefied = true;
       }
       i++;
     }
     if (!isAccessibleModiefied) {
       modifiedBuffer = "public " + modifiedBuffer;
     }
     add(modifiedBuffer);
     this.reusedModification = modifiedBuffer;
   }
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetFirstChild().jjtAccept(defaultVisitor, this.ctx);
     add(";\n");
     int i = 0;
     while ((this.node.jjtGetChild(++i) instanceof ASTVariableDeclarator))
     {
       startLineWith(this.reusedModification);
       this.node.jjtGetChild(i).jjtAccept(defaultVisitor, this.ctx);
       add(";\n");
     }
   }
   
   public void after() {}
 }




