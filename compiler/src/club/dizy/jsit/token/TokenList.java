 package club.dizy.jsit.token;
 
 import java.util.ArrayList;
 
 public class TokenList
   extends ArrayList<Token>
 {
   public String needleTokens(int start, int length, String needle)
   {
     if (start > size() - 1) {
       return "";
     }
     if (start < 0) {
       start = size() + start;
     }
     if (length < 0) {
       length = size() + length - start + 1;
     }
     if (length == 0) {
       return "";
     }
     if (start + length > size()) {
       return "";
     }
     StringBuilder buffer = new StringBuilder();
     for (int i = 0; i < length; i++)
     {
       buffer.append(get(start + i));
       if (i != length - 1) {
         buffer.append(needle);
       }
     }
     return buffer.toString();
   }
   
   public String getImage(int index)
   {
     return ((Token)get(index)).image;
   }
   
   public String needleTokens(int start, int length)
   {
     return needleTokens(start, length, "");
   }
   
   public String needleTokensWithSpace(int start, int length)
   {
     return needleTokens(start, length, " ");
   }
   
   public Token first()
   {
     return (Token)get(0);
   }
   
   public Token last()
   {
     return (Token)get(size() - 1);
   }
   
   public String firstImage()
   {
     return first().image;
   }
   
   public String lastImage()
   {
     return last().image;
   }
 }
