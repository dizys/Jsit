package club.dizy.jsit.token;



import club.dizy.jsit.JavaCharStream;
import club.dizy.jsit.JsitParserConstants;


@SuppressWarnings("unused")public class JsitParserTokenManager implements JsitParserConstants {

  
  public  java.io.PrintStream debugStream = System.out;
  
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x140L) != 0L || (active1 & 0x80100000000L) != 0L)
            return 2;
         if ((active0 & 0x3ffffffffffe000L) != 0L)
         {
            jjmatchedKind = 66;
            return 21;
         }
         if ((active1 & 0x2000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x100L) != 0L)
            return 0;
         if ((active0 & 0x202000000L) != 0L)
            return 21;
         if ((active0 & 0x3fffffdfdffe000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 66;
               jjmatchedPos = 1;
            }
            return 21;
         }
         return -1;
      case 2:
         if ((active0 & 0x33ffeddbdffa000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 66;
               jjmatchedPos = 2;
            }
            return 21;
         }
         if ((active0 & 0xc0012040004000L) != 0L)
            return 21;
         return -1;
      case 3:
         if ((active0 & 0x124020104060000L) != 0L)
            return 21;
         if ((active0 & 0x21bfcdcb9f9a000L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 3;
            return 21;
         }
         return -1;
      case 4:
         if ((active0 & 0x219000010790000L) != 0L)
            return 21;
         if ((active0 & 0x2fcdca980a000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 66;
               jjmatchedPos = 4;
            }
            return 21;
         }
         return -1;
      case 5:
         if ((active0 & 0xc5ca9c0a000L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 5;
            return 21;
         }
         if ((active0 & 0x12f08000000000L) != 0L)
            return 21;
         return -1;
      case 6:
         if ((active0 & 0x85c80c02000L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 6;
            return 21;
         }
         if ((active0 & 0x40029008000L) != 0L)
            return 21;
         return -1;
      case 7:
         if ((active0 & 0x80802000L) != 0L)
            return 21;
         if ((active0 & 0x85c00400000L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 7;
            return 21;
         }
         return -1;
      case 8:
         if ((active0 & 0xc00400000L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 8;
            return 21;
         }
         if ((active0 & 0x85000000000L) != 0L)
            return 21;
         return -1;
      case 9:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 9;
            return 21;
         }
         if ((active0 & 0xc00000000L) != 0L)
            return 21;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 81;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000000L);
      case 37:
         jjmatchedKind = 100;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800000000000L);
      case 38:
         jjmatchedKind = 97;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x100004000000L);
      case 40:
         return jjStopAtPos(0, 69);
      case 41:
         return jjStopAtPos(0, 70);
      case 42:
         jjmatchedKind = 95;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40000000000L);
      case 43:
         jjmatchedKind = 93;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10008000000L);
      case 44:
         return jjStopAtPos(0, 76);
      case 45:
         jjmatchedKind = 94;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20010000000L);
      case 46:
         return jjStartNfaWithStates_0(0, 77, 7);
      case 47:
         jjmatchedKind = 96;
         return jjMoveStringLiteralDfa1_0(0x140L, 0x80000000000L);
      case 58:
         return jjStopAtPos(0, 84);
      case 59:
         return jjStopAtPos(0, 75);
      case 60:
         jjmatchedKind = 80;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1002000400000L);
      case 61:
         jjmatchedKind = 78;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200000L);
      case 62:
         jjmatchedKind = 79;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x600c000800000L);
      case 63:
         return jjStopAtPos(0, 83);
      case 91:
         return jjStopAtPos(0, 73);
      case 93:
         return jjStopAtPos(0, 74);
      case 94:
         jjmatchedKind = 99;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x400000000000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x6000L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x38000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0xfc0000L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x3000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0xc000000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0xf0000000L, 0x0L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x100000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1e00000000L, 0x0L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2000000000L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x3c000000000L, 0x0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1c0000000000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200000000000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x3c00000000000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x7c000000000000L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200000000000000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 71);
      case 124:
         jjmatchedKind = 98;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200002000000L);
      case 125:
         return jjStopAtPos(0, 72);
      case 126:
         return jjStopAtPos(0, 82);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 90);
         break;
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 0);
         break;
      case 43:
         if ((active1 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 91);
         break;
      case 45:
         if ((active1 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 92);
         break;
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 60:
         if ((active1 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 101;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x1000000000000L);
      case 61:
         if ((active1 & 0x200000L) != 0L)
            return jjStopAtPos(1, 85);
         else if ((active1 & 0x400000L) != 0L)
            return jjStopAtPos(1, 86);
         else if ((active1 & 0x800000L) != 0L)
            return jjStopAtPos(1, 87);
         else if ((active1 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 88);
         else if ((active1 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 104);
         else if ((active1 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 105);
         else if ((active1 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 106);
         else if ((active1 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 107);
         else if ((active1 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 108);
         else if ((active1 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 109);
         else if ((active1 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 110);
         else if ((active1 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 111);
         break;
      case 62:
         if ((active1 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 102;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x6008000000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40100c0000L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x212001000000L, active1, 0L);
      case 102:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 21);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x21c000000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x4100000L, active1, 0L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800004000L, active1, 0L);
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 21);
         return jjMoveStringLiteralDfa2_0(active0, 0x100000140e08000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x600c0000010000L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1128080000000L, active1, 0L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000L, active1, 0L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L, active1, 0L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L, active1, 0L);
      case 124:
         if ((active1 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 89);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 61:
         if ((active1 & 0x1000000000000L) != 0L)
            return jjStopAtPos(2, 112);
         else if ((active1 & 0x2000000000000L) != 0L)
            return jjStopAtPos(2, 113);
         break;
      case 62:
         if ((active1 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 103;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x4000000000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000100000L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L, active1, 0L);
      case 101:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 55, 21);
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L, active1, 0L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x306040000000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20010000000L, active1, 0L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000000000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0xa0e00000L, active1, 0L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000008000L, active1, 0L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000400000000L, active1, 0L);
      case 114:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 21);
         return jjMoveStringLiteralDfa3_0(active0, 0x18800000000000L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x804042000L, active1, 0L);
      case 116:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 21);
         return jjMoveStringLiteralDfa3_0(active0, 0x2011080a0000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000000L, active1, 0L);
      case 119:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 21);
         break;
      case 121:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 21);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 54, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 61:
         if ((active1 & 0x4000000000000L) != 0L)
            return jjStopAtPos(3, 114);
         break;
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x21010000L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L, active1, 0L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x80080000L, active1, 0L);
      case 100:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 56, 21);
         break;
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 21);
         else if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 21);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 21);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 53, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x1005008000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L, active1, 0L);
      case 108:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x200100400008000L, active1, 0L);
      case 111:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x18000000000000L, active1, 0L);
      case 115:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 21);
         return jjMoveStringLiteralDfa4_0(active0, 0x10700000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2480800802000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40800000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000000L);
      case 101:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 21);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 57, 21);
         return jjMoveStringLiteralDfa5_0(active0, 0x88400008000L);
      case 104:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 21);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x500000800000L);
      case 107:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 21);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x800008000000L);
      case 114:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 48, 21);
         return jjMoveStringLiteralDfa5_0(active0, 0x201000002000L);
      case 115:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 21);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x80400000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 119:
         if ((active0 & 0x8000000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0xa000L);
      case 99:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 44, 21);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 21);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      case 103:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 47, 21);
         break;
      case 104:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 49, 21);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x21000000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 110:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 21);
         return jjMoveStringLiteralDfa6_0(active0, 0x800800000L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      case 114:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 39, 21);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 115:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 52, 21);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x5000000000L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x800002000L);
      case 101:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 42, 21);
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      case 110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 21);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000L);
      case 115:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 21);
         break;
      case 116:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(6, 24, 21);
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0xc00000L);
      case 121:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(6, 29, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x5000400000L);
      case 101:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 21);
         return jjMoveStringLiteralDfa8_0(active0, 0x80800000000L);
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(7, 31, 21);
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(7, 13, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 43, 21);
         break;
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 36, 21);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 38, 21);
         break;
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x800000000L);
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x400400000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(9, 35, 21);
         break;
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x400000L);
      case 115:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(9, 34, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(10, 22, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0xfff0000000200002L, 0xffffffffffffdfffL, 0xfffff00f7fffffffL, 0x12000000007fffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x420043c00000000L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0xffffcffffffffL, 0xffffffffffff0000L, 0xf9ff3fffffffffffL, 0x401f00030003L
};
static final long[] jjbitVec6 = {
   0x0L, 0x400000000000000L, 0xfffffffbffffd740L, 0xffffffcff7fffL
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffffff003L, 0x33fffffffff199fL
};
static final long[] jjbitVec8 = {
   0xfffe000000000000L, 0xfffffffe027fffffL, 0xffL, 0x707ffffff0000L
};
static final long[] jjbitVec9 = {
   0x7fffffe00000000L, 0xfffe0000000007ffL, 0xffffffffffffffffL, 0x1c000060002fffffL
};
static final long[] jjbitVec10 = {
   0x1ffffffd0000L, 0x0L, 0x3fffffffffL, 0x0L
};
static final long[] jjbitVec11 = {
   0x23ffffffffffffe0L, 0x3ff010000L, 0x3c5fdfffff99fe0L, 0xf0003b0000000L
};
static final long[] jjbitVec12 = {
   0x36dfdfffff987e0L, 0x1c00005e000000L, 0x23edfdfffffbafe0L, 0x100010000L
};
static final long[] jjbitVec13 = {
   0x23cdfdfffff99fe0L, 0x3b0000000L, 0x3bfc718d63dc7e0L, 0x0L
};
static final long[] jjbitVec14 = {
   0x3effdfffffddfe0L, 0x300000000L, 0x3effdfffffddfe0L, 0x340000000L
};
static final long[] jjbitVec15 = {
   0x3fffdfffffddfe0L, 0x300000000L, 0x2ffbfffffc7fffe0L, 0x7fL
};
static final long[] jjbitVec16 = {
   0x800dfffffffffffeL, 0x7fL, 0x200decaefef02596L, 0x3000005fL
};
static final long[] jjbitVec17 = {
   0x1L, 0x7fffffffeffL, 0xf00L, 0x0L
};
static final long[] jjbitVec18 = {
   0x6fbffffffffL, 0x3f0000L, 0xffffffff00000000L, 0x7fffffffff003fL
};
static final long[] jjbitVec19 = {
   0xffffffffffffffffL, 0xffffffff83ffffffL, 0xffffff07ffffffffL, 0x3ffffffffffffffL
};
static final long[] jjbitVec20 = {
   0xffffffffffffff7fL, 0xffffffff3d7f3d7fL, 0x7f3d7fffffff3d7fL, 0xffff7fffff7f7f3dL
};
static final long[] jjbitVec21 = {
   0xffffffff7f3d7fffL, 0x7ffff7fL, 0xffffffff00000000L, 0x1fffffffffffffL
};
static final long[] jjbitVec22 = {
   0xffffffffffffffffL, 0x7f9fffffffffffL, 0xffffffff07fffffeL, 0x7ffffffffffL
};
static final long[] jjbitVec23 = {
   0x0L, 0x0L, 0xfffffffffffffL, 0x8000000L
};
static final long[] jjbitVec24 = {
   0xffffffff00000000L, 0xffffffffffffffL, 0x1ffffffffffL, 0x0L
};
static final long[] jjbitVec25 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffff0fffffffL, 0x3ffffffffffffffL
};
static final long[] jjbitVec26 = {
   0xffffffff3f3fffffL, 0x3fffffffaaff3f3fL, 0x5fdfffffffffffffL, 0x1fdc1fff0fcf1fdcL
};
static final long[] jjbitVec27 = {
   0x8000000000000000L, 0x8000000000000001L, 0xffff00000000L, 0x0L
};
static final long[] jjbitVec28 = {
   0x3fbbd503e2ffc84L, 0xffffffff00000000L, 0xfL, 0x0L
};
static final long[] jjbitVec29 = {
   0x73e03fe000000e0L, 0xfffffffffffffffeL, 0xfffffffe601fffffL, 0x7fffffffffffffffL
};
static final long[] jjbitVec30 = {
   0xfffe1fffffffffe0L, 0xffffffffffffffffL, 0xffffff00007fffL, 0x0L
};
static final long[] jjbitVec31 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffL, 0x0L
};
static final long[] jjbitVec32 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffL, 0x0L
};
static final long[] jjbitVec33 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x1fffL, 0x0L
};
static final long[] jjbitVec34 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffL, 0x0L
};
static final long[] jjbitVec35 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec36 = {
   0x5f7ffdffa0f8007fL, 0xffffffffffffffdbL, 0x3ffffffffffffL, 0xfffffffffff80000L
};
static final long[] jjbitVec37 = {
   0x3fffffffffffffffL, 0xffffffffffff0000L, 0xfffffffffffcffffL, 0xfff0000000000ffL
};
static final long[] jjbitVec38 = {
   0x18000000000000L, 0xffd702000000e000L, 0xffffffffffffffffL, 0x1fffffffffffffffL
};
static final long[] jjbitVec39 = {
   0x87fffffe00000010L, 0xffffffe007fffffeL, 0x7fffffffffffffffL, 0x631cfcfcfcL
};
static final long[] jjbitVec40 = {
   0x0L, 0x0L, 0x420043cffffffffL, 0xff7fffffff7fffffL
};
static final long[] jjbitVec41 = {
   0xffffffffffffffffL, 0x400000700007fffL, 0xfffffffbffffd740L, 0xffffffcff7fffL
};
static final long[] jjbitVec42 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xfffffffffffff07bL, 0x33fffffffff199fL
};
static final long[] jjbitVec43 = {
   0xfffe000000000000L, 0xfffffffe027fffffL, 0xbbfffffbfffe00ffL, 0x707ffffff0016L
};
static final long[] jjbitVec44 = {
   0x7fffffe00000000L, 0xffff03ff003fffffL, 0xffffffffffffffffL, 0x1fff3dff9fefffffL
};
static final long[] jjbitVec45 = {
   0xffff1fffffff8000L, 0x7ffL, 0x1ffffffffffffL, 0x0L
};
static final long[] jjbitVec46 = {
   0xf3ffffffffffffeeL, 0xffcfff1f3fffL, 0xd3c5fdfffff99feeL, 0xfffcfb080399fL
};
static final long[] jjbitVec47 = {
   0xd36dfdfffff987e4L, 0x1fffc05e003987L, 0xf3edfdfffffbafeeL, 0xffc100013bbfL
};
static final long[] jjbitVec48 = {
   0xf3cdfdfffff99feeL, 0xffc3b0c0398fL, 0xc3bfc718d63dc7ecL, 0xff8000803dc7L
};
static final long[] jjbitVec49 = {
   0xc3effdfffffddfeeL, 0xffc300603ddfL, 0xc3effdfffffddfecL, 0xffc340603ddfL
};
static final long[] jjbitVec50 = {
   0xc3fffdfffffddfecL, 0xffc300803dcfL, 0x2ffbfffffc7fffecL, 0xc0000ff5f847fL
};
static final long[] jjbitVec51 = {
   0x87fffffffffffffeL, 0x3ff7fffL, 0x3bffecaefef02596L, 0x33ff3f5fL
};
static final long[] jjbitVec52 = {
   0xc2a003ff03000001L, 0xfffe07fffffffeffL, 0x1ffffffffeff0fdfL, 0x40L
};
static final long[] jjbitVec53 = {
   0x3c7f6fbffffffffL, 0x3ff03ffL, 0xffffffff00000000L, 0x7fffffffff003fL
};
static final long[] jjbitVec54 = {
   0xffffffff7f3d7fffL, 0x3fe0007ffff7fL, 0xffffffff00000000L, 0x1fffffffffffffL
};
static final long[] jjbitVec55 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0x3ff080fffffL
};
static final long[] jjbitVec56 = {
   0xffffffff03ff7800L, 0xffffffffffffffL, 0x3ffffffffffL, 0x0L
};
static final long[] jjbitVec57 = {
   0x80007c000000f000L, 0x8000fc0000000001L, 0xffff00000000L, 0x21fff0000L
};
static final long[] jjbitVec58 = {
   0x73efffe000000e0L, 0xfffffffffffffffeL, 0xfffffffe661fffffL, 0x7fffffffffffffffL
};
static final long[] jjbitVec59 = {
   0x5f7ffdffe0f8007fL, 0xffffffffffffffdbL, 0x3ffffffffffffL, 0xfffffffffff80000L
};
static final long[] jjbitVec60 = {
   0x18000f00000000L, 0xffd702000000e000L, 0xffffffffffffffffL, 0x9fffffffffffffffL
};
static final long[] jjbitVec61 = {
   0x87fffffe03ff0010L, 0xffffffe007fffffeL, 0x7fffffffffffffffL, 0xe0000631cfcfcfcL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 37;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  else if ((0x8400000000L & l) != 0L)
                     { jjCheckNAddStates(4, 6); }
                  else if (curChar == 36)
                  {
                     if (kind > 66)
                        kind = 66;
                     { jjCheckNAdd(21); }
                  }
                  else if (curChar == 46)
                     { jjCheckNAdd(7); }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 2;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(5); }
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAddTwoStates(23, 24); }
                  }
                  break;
               case 0:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 2:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 4:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(5); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(5); }
                  break;
               case 6:
                  if (curChar == 46)
                     { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 9:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(10); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
               case 14:
                  if ((0x8400000000L & l) != 0L)
                     { jjCheckNAddStates(4, 6); }
                  break;
               case 12:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddStates(4, 6); }
                  break;
               case 15:
                  if ((0x8400000000L & l) != 0L && kind > 65)
                     kind = 65;
                  break;
               case 16:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAddStates(7, 10); }
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAddStates(4, 6); }
                  break;
               case 18:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAdd(17); }
                  break;
               case 20:
                  if (curChar != 36)
                     break;
                  if (kind > 66)
                     kind = 66;
                  { jjCheckNAdd(21); }
                  break;
               case 21:
                  if ((0x3ff00100fffc1ffL & l) == 0L)
                     break;
                  if (kind > 66)
                     kind = 66;
                  { jjCheckNAdd(21); }
                  break;
               case 22:
                  if (curChar != 48)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 23:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(23); }
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(27, 28); }
                  break;
               case 29:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(30); }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(30); }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(31, 32); }
                  break;
               case 32:
                  if (curChar != 46)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 35:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(36); }
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(36); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 66)
                     kind = 66;
                  { jjCheckNAdd(21); }
                  break;
               case 1:
                  if (kind > 7)
                     kind = 7;
                  break;
               case 8:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(11, 12); }
                  break;
               case 12:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(4, 6); }
                  break;
               case 13:
                  if (curChar == 92)
                     { jjAddStates(13, 15); }
                  break;
               case 14:
                  if ((0x14404410000000L & l) != 0L)
                     { jjCheckNAddStates(4, 6); }
                  break;
               case 21:
                  if ((0x87fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 66)
                     kind = 66;
                  { jjCheckNAdd(21); }
                  break;
               case 24:
                  if ((0x100000001000000L & l) != 0L)
                     { jjCheckNAdd(25); }
                  break;
               case 25:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(25); }
                  break;
               case 28:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(16, 17); }
                  break;
               case 34:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(18, 19); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 66)
                     kind = 66;
                  { jjCheckNAdd(21); }
                  break;
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 7)
                     kind = 7;
                  break;
               case 12:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(4, 6); }
                  break;
               case 21:
                  if (!jjCanMove_2(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 66)
                     kind = 66;
                  { jjCheckNAdd(21); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 37 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_3(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x800L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      default :
         return 2;
   }
   return 2;
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 9)
                     kind = 9;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x400L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_2(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   27, 28, 31, 32, 12, 13, 15, 12, 13, 17, 15, 9, 10, 14, 16, 18, 
   29, 30, 35, 36, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 2:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 4:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 5:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 6:
         return ((jjbitVec9[i2] & l2) != 0L);
      case 7:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 9:
         return ((jjbitVec11[i2] & l2) != 0L);
      case 10:
         return ((jjbitVec12[i2] & l2) != 0L);
      case 11:
         return ((jjbitVec13[i2] & l2) != 0L);
      case 12:
         return ((jjbitVec14[i2] & l2) != 0L);
      case 13:
         return ((jjbitVec15[i2] & l2) != 0L);
      case 14:
         return ((jjbitVec16[i2] & l2) != 0L);
      case 15:
         return ((jjbitVec17[i2] & l2) != 0L);
      case 16:
         return ((jjbitVec18[i2] & l2) != 0L);
      case 17:
         return ((jjbitVec19[i2] & l2) != 0L);
      case 18:
         return ((jjbitVec20[i2] & l2) != 0L);
      case 19:
         return ((jjbitVec21[i2] & l2) != 0L);
      case 20:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 22:
         return ((jjbitVec22[i2] & l2) != 0L);
      case 23:
         return ((jjbitVec23[i2] & l2) != 0L);
      case 24:
         return ((jjbitVec24[i2] & l2) != 0L);
      case 30:
         return ((jjbitVec25[i2] & l2) != 0L);
      case 31:
         return ((jjbitVec26[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec27[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec28[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec29[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec30[i2] & l2) != 0L);
      case 77:
         return ((jjbitVec31[i2] & l2) != 0L);
      case 159:
         return ((jjbitVec32[i2] & l2) != 0L);
      case 164:
         return ((jjbitVec33[i2] & l2) != 0L);
      case 215:
         return ((jjbitVec34[i2] & l2) != 0L);
      case 250:
         return ((jjbitVec35[i2] & l2) != 0L);
      case 251:
         return ((jjbitVec36[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec37[i2] & l2) != 0L);
      case 254:
         return ((jjbitVec38[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec39[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec40[i2] & l2) != 0L);
      case 2:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec41[i2] & l2) != 0L);
      case 4:
         return ((jjbitVec42[i2] & l2) != 0L);
      case 5:
         return ((jjbitVec43[i2] & l2) != 0L);
      case 6:
         return ((jjbitVec44[i2] & l2) != 0L);
      case 7:
         return ((jjbitVec45[i2] & l2) != 0L);
      case 9:
         return ((jjbitVec46[i2] & l2) != 0L);
      case 10:
         return ((jjbitVec47[i2] & l2) != 0L);
      case 11:
         return ((jjbitVec48[i2] & l2) != 0L);
      case 12:
         return ((jjbitVec49[i2] & l2) != 0L);
      case 13:
         return ((jjbitVec50[i2] & l2) != 0L);
      case 14:
         return ((jjbitVec51[i2] & l2) != 0L);
      case 15:
         return ((jjbitVec52[i2] & l2) != 0L);
      case 16:
         return ((jjbitVec53[i2] & l2) != 0L);
      case 17:
         return ((jjbitVec19[i2] & l2) != 0L);
      case 18:
         return ((jjbitVec20[i2] & l2) != 0L);
      case 19:
         return ((jjbitVec54[i2] & l2) != 0L);
      case 20:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 22:
         return ((jjbitVec22[i2] & l2) != 0L);
      case 23:
         return ((jjbitVec55[i2] & l2) != 0L);
      case 24:
         return ((jjbitVec56[i2] & l2) != 0L);
      case 30:
         return ((jjbitVec25[i2] & l2) != 0L);
      case 31:
         return ((jjbitVec26[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec57[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec28[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec58[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec30[i2] & l2) != 0L);
      case 77:
         return ((jjbitVec31[i2] & l2) != 0L);
      case 159:
         return ((jjbitVec32[i2] & l2) != 0L);
      case 164:
         return ((jjbitVec33[i2] & l2) != 0L);
      case 215:
         return ((jjbitVec34[i2] & l2) != 0L);
      case 250:
         return ((jjbitVec35[i2] & l2) != 0L);
      case 251:
         return ((jjbitVec59[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec37[i2] & l2) != 0L);
      case 254:
         return ((jjbitVec60[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec61[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}


public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
"\141\142\163\164\162\141\143\164", "\141\156\171", "\142\157\157\154\145\141\156", "\142\162\145\141\153", 
"\142\171\164\145", "\143\141\163\145", "\143\141\164\143\150", "\143\154\141\163\163", 
"\143\157\156\163\164", "\143\157\156\163\164\162\165\143\164\157\162", 
"\143\157\156\164\151\156\165\145", "\144\145\146\141\165\154\164", "\144\157", "\145\154\163\145", 
"\145\170\164\145\156\144\163", "\146\141\154\163\145", "\146\151\156\141\154\154\171", "\146\157\162", 
"\146\165\156\143\164\151\157\156", "\147\157\164\157", "\151\146", "\151\155\160\154\145\155\145\156\164\163", 
"\151\156\163\164\141\156\143\145\157\146", "\151\156\164\145\162\146\141\143\145", "\154\145\164", 
"\156\141\155\145\163\160\141\143\145", "\156\165\155\142\145\162", "\156\145\167", "\156\165\154\154", 
"\160\162\151\166\141\164\145", "\160\162\157\164\145\143\164\145\144", "\160\165\142\154\151\143", 
"\162\145\164\165\162\156", "\163\164\141\164\151\143", "\163\164\162\151\156\147", 
"\163\165\160\145\162", "\163\167\151\164\143\150", "\164\150\151\163", "\164\150\162\157\167", 
"\164\150\162\157\167\163", "\164\162\165\145", "\164\162\171", "\165\163\145", "\166\157\151\144", 
"\167\150\151\154\145", null, null, null, null, null, null, null, null, null, null, null, "\50", 
"\51", "\173", "\175", "\133", "\135", "\73", "\54", "\56", "\75", "\76", "\74", 
"\41", "\176", "\77", "\72", "\75\75", "\74\75", "\76\75", "\41\75", "\174\174", 
"\46\46", "\53\53", "\55\55", "\53", "\55", "\52", "\57", "\46", "\174", "\136", "\45", 
"\74\74", "\76\76", "\76\76\76", "\53\75", "\55\75", "\52\75", "\57\75", "\46\75", 
"\174\75", "\136\75", "\45\75", "\74\74\75", "\76\76\75", "\76\76\76\75", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;


public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 7 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                   input_stream.backup(1);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    
    public JsitParserTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  
  public JsitParserTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  
  public void ReInit(JavaCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 37; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  
  public void ReInit(JavaCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  
  public void SwitchTo(int lexState)
  {
    if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
   "IN_FORMAL_COMMENT",
   "IN_MULTI_LINE_COMMENT",
};


public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 3, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffffffffffe001L, 0x7ffffffffffe6L, 
};
static final long[] jjtoSkip = {
   0xe3eL, 0x0L, 
};
static final long[] jjtoSpecial = {
   0xe00L, 0x0L, 
};
static final long[] jjtoMore = {
   0x11c0L, 0x0L, 
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[37];
    private final int[] jjstateSet = new int[2 * 37];

    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    
    protected char curChar;
}
