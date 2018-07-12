package club.dizy.jsit.node;

import club.dizy.jsit.visitor.JsitParserVisitor;

public abstract interface Node
{
  public abstract void jjtOpen();
  
  public abstract void jjtClose();
  
  public abstract void jjtSetParent(Node paramNode);
  
  public abstract Node jjtGetParent();
  
  public abstract void jjtAddChild(Node paramNode, int paramInt);
  
  public abstract Node jjtGetChild(int paramInt);
  
  public abstract int jjtGetNumChildren();
  
  public abstract int getId();
  
  public abstract Object jjtAccept(JsitParserVisitor paramJsitParserVisitor, Object paramObject);
}




