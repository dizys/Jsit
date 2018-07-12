 package club.dizy.jsit.output;
 
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import com.google.gson.JsonArray;
 import com.google.gson.JsonObject;
 
 public class TokensOut
 {
   private TokenList mList;
   
   TokensOut(TokenList list)
   {
     this.mList = list;
   }
   
   public String toJson()
   {
     JsonObject ret = new JsonObject();
     JsonArray container = new JsonArray();
     int i = 1;
     for (Token token : this.mList)
     {
       JsonObject tokenItem = new JsonObject();
       tokenItem.addProperty("id", Integer.valueOf(i));
       tokenItem.addProperty("token", token.image);
       tokenItem.addProperty("type", club.dizy.jsit.JsitParserConstants.tokenImage[token.kind]);
       tokenItem.addProperty("line", Integer.valueOf(token.beginLine));
       tokenItem.addProperty("column", Integer.valueOf(token.beginColumn));
       container.add(tokenItem);
       i++;
     }
     ret.addProperty("code", Integer.valueOf(200));
     ret.addProperty("msg", "Token parsed successfully");
     ret.add("data", container);
     return ret.toString();
   }
 }




