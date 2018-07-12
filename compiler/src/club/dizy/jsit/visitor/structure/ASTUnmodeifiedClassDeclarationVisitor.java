 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.resolve.ScopeContext;
 import club.dizy.jsit.resolve.scope.ClassScope;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTUnmodeifiedClassDeclarationVisitor
   extends Visitor
 {
   public ASTUnmodeifiedClassDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     add("class ");
     String className = this.tokens.getImage(1);
     add(className + " ");
     int i = 1;
     if (((Token)this.tokens.get(++i)).is("extends"))
     {
       String extending = this.tokens.getImage(++i);
       add("extends " + extending + " ");
     }
     else
     {
       i--;
     }
     if (((Token)this.tokens.get(++i)).is("implements"))
     {
       String list = "";
       add("implements ");
       while (!((Token)this.tokens.get(++i)).is("{")) {
         list = list + this.tokens.get(i);
       }
       add(list + " ");
     }
     add("\n");
     
     this.sctx.getIn(new ClassScope(this.sctx.getNowScope(), className));
   }
   
   public void after()
   {
     this.sctx.getOut();
   }
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.jjtGetLastChild().jjtAccept(defaultVisitor, this.ctx);
   }
 }




