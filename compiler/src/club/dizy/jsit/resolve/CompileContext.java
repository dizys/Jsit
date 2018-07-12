 package club.dizy.jsit.resolve;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.TokenList;
 
 public class CompileContext
 {
   protected CodeContext codeCtx;
   protected ScopeContext scopeCtx;
   protected TokenList tokenList;
   protected SimpleNode rootNode;
   
   public CompileContext()
   {
     this.codeCtx = new CodeContext();
     this.scopeCtx = new ScopeContext();
   }
   
   public TokenList getTokenList()
   {
     return this.tokenList;
   }
   
   public void setTokenList(TokenList list)
   {
     this.tokenList = list;
   }
   
   public SimpleNode getRootNode()
   {
     return this.rootNode;
   }
   
   public void setRootNode(SimpleNode node)
   {
     this.rootNode = node;
   }
   
   public CodeContext getCodeCtx()
   {
     return this.codeCtx;
   }
   
   public ScopeContext getScopeCtx()
   {
     return this.scopeCtx;
   }
 }




