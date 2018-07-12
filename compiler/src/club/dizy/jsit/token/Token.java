 package club.dizy.jsit.token;
 
 import java.io.Serializable;
 import java.util.Arrays;
 import java.util.List;
 
 public class Token
   implements Serializable
 {
   private static final long serialVersionUID = 1L;
   public int kind;
   public int beginLine;
   public int beginColumn;
   public int endLine;
   public int endColumn;
   public String image;
   public Token next;
   public Token specialToken;
   
   public Object getValue()
   {
     return null;
   }
   
   public Token() {}
   
   public Token(int kind)
   {
     this(kind, null);
   }
   
   public Token(int kind, String image)
   {
     this.kind = kind;
     this.image = image;
   }
   
   public String toString()
   {
     return this.image;
   }
   
   public boolean in(String[] images)
   {
     return Arrays.asList(images).contains(this.image);
   }
   
   public boolean is(String token)
   {
     return this.image.equals(token);
   }
   
   public static Token newToken(int ofKind, String image)
   {
     switch (ofKind)
     {
     }
     return new Token(ofKind, image);
   }
   
   public static Token newToken(int ofKind)
   {
     return newToken(ofKind, null);
   }
 }




