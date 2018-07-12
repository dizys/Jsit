 package club.dizy.jsit.visitor;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.resolve.CodeContext;
 import club.dizy.jsit.resolve.CompileContext;
 import club.dizy.jsit.resolve.ScopeContext;
 import club.dizy.jsit.token.TokenList;
 import java.io.PrintStream;
 
 public abstract class Visitor
 {
   protected SimpleNode node;
   protected CompileContext ctx;
   protected CodeContext cctx;
   protected ScopeContext sctx;
   protected int beginLine;
   protected int endLine;
   protected TokenList tokens;
   
   public Visitor(SimpleNode node, Object data)
   {
     this.node = node;
     this.tokens = node.getTokens();
     this.beginLine = node.getBeginLine();
     this.endLine = node.getEndLine();
     this.ctx = ((CompileContext)data);
     this.cctx = this.ctx.getCodeCtx();
     this.sctx = this.ctx.getScopeCtx();
   }
   
   public CodeContext addLine(int line, String code)
   {
     return this.cctx.addLine(line, code);
   }
   
   public CodeContext addLine(String code)
   {
     return this.cctx.addLine(this.beginLine, code);
   }
   
   public CodeContext add(String code)
   {
     return this.cctx.add(code);
   }
   
   public CodeContext startLineWith(int line, String code)
   {
     return this.cctx.startLineWith(line, code);
   }
   
   public CodeContext startLineWith(String code)
   {
     return this.cctx.startLineWith(this.beginLine, code);
   }
   
   public String needleTokens(int start, int length, String needle)
   {
     return this.tokens.needleTokens(start, length, needle);
   }
   
   public String needleTokens(int start, int length)
   {
     return this.tokens.needleTokens(start, length);
   }
   
   public String needleTokensWithSpace(int start, int length)
   {
     return this.tokens.needleTokensWithSpace(start, length);
   }
   
   public void dump(Object thing)
   {
     System.out.println("Dump: " + thing);
   }
   
   public abstract void before();
   
   public abstract void after();
   
   public void visitChildren(JsitParserVisitor defaultVisitor)
   {
     this.node.childrenAccept(defaultVisitor, this.ctx);
   }
 }




