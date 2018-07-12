 package club.dizy.jsit.resolve.scope;
 
 import java.util.ArrayList;
 
 public class Scope
 {
   protected ArrayList<Scope> children;
   protected Scope parent;
   
   public Scope(Scope parent)
   {
     this.children = new ArrayList();
     this.parent = parent;
   }
   
   public Scope getParent()
   {
     return this.parent;
   }
   
   public Scope addChild(Scope child)
   {
     this.children.add(child);
     return this;
   }
   
   public Scope getChild(int index)
   {
     return (Scope)this.children.get(index);
   }
   
   public int size()
   {
     return this.children.size();
   }
   
   public ArrayList<Scope> getArrayList()
   {
     return this.children;
   }
   
   public String findClassName()
   {
     Scope find = this;
     while (find != null)
     {
       if ((find instanceof ClassScope)) {
         return ((ClassScope)find).getClassName();
       }
       find = find.parent;
     }
     return null;
   }
 }




