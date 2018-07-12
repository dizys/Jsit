 package club.dizy.jsit.node;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.resolve.CompileContext;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 import java.io.PrintStream;
 
 public class SimpleNode
   implements Node
 {
   protected Node parent;
   protected Node[] children;
   protected int id;
   protected Object value;
   protected JsitParser parser;
   protected Token begin;
   protected Token end;
   
   public SimpleNode(int i)
   {
     this.id = i;
   }
   
   public SimpleNode(JsitParser p, int i)
   {
     this(i);
     this.parser = p;
   }
   
   public static Node jjtCreate(int id)
   {
     return new SimpleNode(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new SimpleNode(p, id);
   }
   
   public void jjtOpen()
   {
     this.begin = this.parser.getToken(1);
   }
   
   public void jjtClose()
   {
     this.end = this.parser.getToken(0);
   }
   
   public void jjtSetParent(Node n)
   {
     this.parent = n;
   }
   
   public Node jjtGetParent()
   {
     return this.parent;
   }
   
   public void jjtAddChild(Node n, int i)
   {
     if (this.children == null)
     {
       this.children = new Node[i + 1];
     }
     else if (i >= this.children.length)
     {
       Node[] c = new Node[i + 1];
       System.arraycopy(this.children, 0, c, 0, this.children.length);
       this.children = c;
     }
     this.children[i] = n;
   }
   
   public Node jjtGetChild(int i)
   {
     if (i >= jjtGetNumChildren()) {
       return null;
     }
     return this.children[i];
   }
   
   public Node jjtGetFirstChild()
   {
     return jjtGetChild(0);
   }
   
   public Node jjtGetLastChild()
   {
     return jjtGetChild(jjtGetNumChildren() - 1);
   }
   
   public int jjtGetNumChildren()
   {
     return this.children == null ? 0 : this.children.length;
   }
   
   public void jjtSetValue(Object value)
   {
     this.value = value;
   }
   
   public Object jjtGetValue()
   {
     return this.value;
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return visitor.visit(this, data);
   }
   
   public Object childrenAccept(JsitParserVisitor visitor, Object data)
   {
     if (this.children != null) {
       for (int i = 0; i < this.children.length; i++) {
         this.children[i].jjtAccept(visitor, data);
       }
     }
     return data;
   }
   
   public String toString()
   {
     return club.dizy.jsit.JsitParserTreeConstants.jjtNodeName[this.id];
   }
   
   public String toString(String prefix)
   {
     return prefix + toString();
   }
   
   public void dump(String prefix)
   {
     System.out.println(toString(prefix));
     if (this.children != null) {
       for (int i = 0; i < this.children.length; i++)
       {
         SimpleNode n = (SimpleNode)this.children[i];
         if (n != null) {
           n.dump(prefix + " ");
         }
       }
     }
   }
   
   public TokenList getTokens()
   {
     TokenList list = new TokenList();
     Token t = this.begin;
     while ((t != this.end) && (t != null))
     {
       list.add(t);
       t = t.next;
     }
     list.add(t);
     return list;
   }
   
   public CompileContext getCtx(Object data)
   {
     return (CompileContext)data;
   }
   
   public int getBeginLine()
   {
     return this.begin.beginLine;
   }
   
   public int getEndLine()
   {
     return this.end.endLine;
   }
   
   public int getId()
   {
     return this.id;
   }
 }




