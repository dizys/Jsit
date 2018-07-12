 package club.dizy.jsit.output;
 
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import com.google.gson.JsonArray;
 import com.google.gson.JsonObject;
 
 public class TreesOut
 {
   private SimpleNode mRoot;
   
   TreesOut(SimpleNode rootNode)
   {
     this.mRoot = rootNode;
   }
   
   public String toJson()
   {
     JsonObject json = getNode(this.mRoot);
     return json.toString();
   }
   
   private JsonObject getNode(SimpleNode node)
   {
     JsonObject thisJson = new JsonObject();
     thisJson.addProperty("name", node.getClass().getSimpleName());
     thisJson.addProperty("begin_line", Integer.valueOf(node.getBeginLine()));
     thisJson.addProperty("end_line", Integer.valueOf(node.getEndLine()));
     thisJson.add("children", getChild(node));
     return thisJson;
   }
   
   private JsonObject getNode(Node node)
   {
     return getNode((SimpleNode)node);
   }
   
   private JsonArray getChild(SimpleNode node)
   {
     JsonArray thisJson = new JsonArray();
     int childNum = node.jjtGetNumChildren();
     for (int i = 0; i < childNum; i++) {
       thisJson.add(getNode(node.jjtGetChild(i)));
     }
     return thisJson;
   }
 }




