package club.dizy.jsit;

import club.dizy.jsit.node.*;
import club.dizy.jsit.node.common.*;
import club.dizy.jsit.node.expression.*;
import club.dizy.jsit.node.statement.*;
import club.dizy.jsit.node.structure.*;
import club.dizy.jsit.resolve.CompileContext;
import club.dizy.jsit.token.JsitParserTokenManager;
import club.dizy.jsit.token.Token;
import club.dizy.jsit.visitor.JsitParserDefaultVisitor;



public class JsitParser implements JsitParserTreeConstants, JsitParserConstants {
  protected JJTJsitParserState jjtree = new JJTJsitParserState();
  public static void main(String args[]) {
    JsitParser parser;
    if (args.length == 0) {
      System.out.println("Jsit Parser Version 0.0.1:  Reading from standard input . . .");
      parser = new JsitParser(System.in);
    } else if (args.length == 1) {
      System.out.println("Jsit Parser Version 0.0.1:  Reading from file " + args[0] + " . . .");
      try {
        parser = new JsitParser(new java.io.FileInputStream(args[0]));
      } catch (java.io.FileNotFoundException e) {
        System.out.println("Jsit Parser Version 0.0.1:  File " + args[0] + " not found.");
        return;
      }
    } else {
      System.out.println("Jsit Parser Version 0.0.1:  Usage is one of:");
      System.out.println("         java JsitParser < inputfile");
      System.out.println("OR");
      System.out.println("         java JsitParser inputfile");
      return;
    }
    try {
      ASTCompilationUnit u = parser.CompilationUnit();
      JsitParserDefaultVisitor visitor = new JsitParserDefaultVisitor();
      CompileContext data = new CompileContext();
      u.jjtAccept(visitor, data);
      System.out.println("Compiled Result:\n" + data.getCodeCtx().getCodes());
      System.out.println("Jsit Parser Version 0.0.1:  Jsit program parsed successfully.");
    } catch (ParseException e) {
      System.out.println(e.getMessage());
      System.out.println("Jsit Parser Version 0.0.1:  Encountered errors during parse.");
    }
  }




  final public 
ASTCompilationUnit CompilationUnit() throws ParseException {
  ASTCompilationUnit jjtn000 = (ASTCompilationUnit)ASTCompilationUnit.jjtCreate(this, JJTCOMPILATIONUNIT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NAMESPACE:{
        NamespaceDeclaration();
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        ;
      }
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case USE:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
        UseDeclaration();
      }
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case CLASS:
        case INTERFACE:
        case PUBLIC:
        case SEMICOLON:{
          ;
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          break label_2;
        }
        TypeDeclaration();
      }
      jj_consume_token(0);
jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
{if ("" != null) return jjtn000;}
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public void NamespaceDeclaration() throws ParseException {
  ASTNamespaceDeclaration jjtn000 = (ASTNamespaceDeclaration)ASTNamespaceDeclaration.jjtCreate(this, JJTNAMESPACEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(NAMESPACE);
      Name();
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void UseDeclaration() throws ParseException {
  ASTUseDeclaration jjtn000 = (ASTUseDeclaration)ASTUseDeclaration.jjtCreate(this, JJTUSEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(USE);
      Name();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DOT:{
        jj_consume_token(DOT);
        jj_consume_token(STAR);
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void TypeDeclaration() throws ParseException {
  ASTTypeDeclaration jjtn000 = (ASTTypeDeclaration)ASTTypeDeclaration.jjtCreate(this, JJTTYPEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_1(2147483647)) {
        ClassDeclaration();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case INTERFACE:
        case PUBLIC:{
          InterfaceDeclaration();
          break;
          }
        case SEMICOLON:{
          jj_consume_token(SEMICOLON);
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  final public 
void ClassDeclaration() throws ParseException {
  ASTClassDeclaration jjtn000 = (ASTClassDeclaration)ASTClassDeclaration.jjtCreate(this, JJTCLASSDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case PUBLIC:{
          ;
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          break label_3;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:{
          jj_consume_token(ABSTRACT);
          break;
          }
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      UnmodifiedClassDeclaration();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void UnmodifiedClassDeclaration() throws ParseException {
  ASTUnmodifiedClassDeclaration jjtn000 = (ASTUnmodifiedClassDeclaration)ASTUnmodifiedClassDeclaration.jjtCreate(this, JJTUNMODIFIEDCLASSDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(CLASS);
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EXTENDS:{
        jj_consume_token(EXTENDS);
        Name();
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IMPLEMENTS:{
        jj_consume_token(IMPLEMENTS);
        NameList();
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        ;
      }
      ClassBody();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ClassBody() throws ParseException {
  ASTClassBody jjtn000 = (ASTClassBody)ASTClassBody.jjtCreate(this, JJTCLASSBODY);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LBRACE);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case CLASS:
        case CONST:
        case CONSTRUCTOR:
        case FUNCTION:
        case INTERFACE:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:
        case IDENTIFIER:
        case LBRACE:{
          ;
          break;
          }
        default:
          jj_la1[9] = jj_gen;
          break label_4;
        }
        ClassBodyDeclaration();
      }
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void NestedClassDeclaration() throws ParseException {
  ASTNestedClassDeclaration jjtn000 = (ASTNestedClassDeclaration)ASTNestedClassDeclaration.jjtCreate(this, JJTNESTEDCLASSDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:{
          ;
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          break label_5;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STATIC:{
          jj_consume_token(STATIC);
          break;
          }
        case ABSTRACT:{
          jj_consume_token(ABSTRACT);
          break;
          }
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        case PROTECTED:{
          jj_consume_token(PROTECTED);
          break;
          }
        case PRIVATE:{
          jj_consume_token(PRIVATE);
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      UnmodifiedClassDeclaration();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ClassBodyDeclaration() throws ParseException {
  ASTClassBodyDeclaration jjtn000 = (ASTClassBodyDeclaration)ASTClassBodyDeclaration.jjtCreate(this, JJTCLASSBODYDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_2(2)) {
        Initializer();
      } else if (jj_2_3(2147483647)) {
        NestedClassDeclaration();
      } else if (jj_2_4(2147483647)) {
        NestedInterfaceDeclaration();
      } else if (jj_2_5(2147483647)) {
        ConstructorDeclaration();
      } else if (jj_2_6(2147483647)) {
        MethodDeclaration();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CONST:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:
        case IDENTIFIER:{
          FieldDeclaration();
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  final public void MethodDeclarationLookahead() throws ParseException {
  ASTMethodDeclarationLookahead jjtn000 = (ASTMethodDeclarationLookahead)ASTMethodDeclarationLookahead.jjtCreate(this, JJTMETHODDECLARATIONLOOKAHEAD);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:{
          ;
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          break label_6;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        case PROTECTED:{
          jj_consume_token(PROTECTED);
          break;
          }
        case PRIVATE:{
          jj_consume_token(PRIVATE);
          break;
          }
        case STATIC:{
          jj_consume_token(STATIC);
          break;
          }
        case ABSTRACT:{
          jj_consume_token(ABSTRACT);
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      jj_consume_token(FUNCTION);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LPAREN);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void InterfaceDeclaration() throws ParseException {
  ASTInterfaceDeclaration jjtn000 = (ASTInterfaceDeclaration)ASTInterfaceDeclaration.jjtCreate(this, JJTINTERFACEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case PUBLIC:{
          ;
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          break label_7;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:{
          jj_consume_token(ABSTRACT);
          break;
          }
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      UnmodifiedInterfaceDeclaration();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void NestedInterfaceDeclaration() throws ParseException {
  ASTNestedInterfaceDeclaration jjtn000 = (ASTNestedInterfaceDeclaration)ASTNestedInterfaceDeclaration.jjtCreate(this, JJTNESTEDINTERFACEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:{
          ;
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          break label_8;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STATIC:{
          jj_consume_token(STATIC);
          break;
          }
        case ABSTRACT:{
          jj_consume_token(ABSTRACT);
          break;
          }
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        case PROTECTED:{
          jj_consume_token(PROTECTED);
          break;
          }
        case PRIVATE:{
          jj_consume_token(PRIVATE);
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      UnmodifiedInterfaceDeclaration();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void UnmodifiedInterfaceDeclaration() throws ParseException {
  ASTUnmodifiedInterfaceDeclaration jjtn000 = (ASTUnmodifiedInterfaceDeclaration)ASTUnmodifiedInterfaceDeclaration.jjtCreate(this, JJTUNMODIFIEDINTERFACEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INTERFACE);
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EXTENDS:{
        jj_consume_token(EXTENDS);
        NameList();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        ;
      }
      jj_consume_token(LBRACE);
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case CLASS:
        case CONST:
        case FUNCTION:
        case INTERFACE:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[20] = jj_gen;
          break label_9;
        }
        InterfaceMemberDeclaration();
      }
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void InterfaceMemberDeclaration() throws ParseException {
  ASTInterfaceMemberDeclaration jjtn000 = (ASTInterfaceMemberDeclaration)ASTInterfaceMemberDeclaration.jjtCreate(this, JJTINTERFACEMEMBERDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_7(2147483647)) {
        NestedClassDeclaration();
      } else if (jj_2_8(2147483647)) {
        NestedInterfaceDeclaration();
      } else if (jj_2_9(2147483647)) {
        MethodDeclaration();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CONST:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:
        case IDENTIFIER:{
          FieldDeclaration();
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void FieldDeclaration() throws ParseException {
  ASTFieldDeclaration jjtn000 = (ASTFieldDeclaration)ASTFieldDeclaration.jjtCreate(this, JJTFIELDDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CONST:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:{
          ;
          break;
          }
        default:
          jj_la1[22] = jj_gen;
          break label_10;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        case PROTECTED:{
          jj_consume_token(PROTECTED);
          break;
          }
        case PRIVATE:{
          jj_consume_token(PRIVATE);
          break;
          }
        case STATIC:{
          jj_consume_token(STATIC);
          break;
          }
        case CONST:{
          jj_consume_token(CONST);
          break;
          }
        default:
          jj_la1[23] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      VariableDeclarator();
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[24] = jj_gen;
          break label_11;
        }
        jj_consume_token(COMMA);
        VariableDeclarator();
      }
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void VariableDeclarator() throws ParseException {
  ASTVariableDeclarator jjtn000 = (ASTVariableDeclarator)ASTVariableDeclarator.jjtCreate(this, JJTVARIABLEDECLARATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      VariableDeclaratorId();
      jj_consume_token(COLON);
      Type();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASSIGN:{
        jj_consume_token(ASSIGN);
        VariableInitializer();
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void VariableDeclaratorId() throws ParseException {
  ASTVariableDeclaratorId jjtn000 = (ASTVariableDeclaratorId)ASTVariableDeclaratorId.jjtCreate(this, JJTVARIABLEDECLARATORID);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[26] = jj_gen;
          break label_12;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void VariableInitializer() throws ParseException {
  ASTVariableInitializer jjtn000 = (ASTVariableInitializer)ASTVariableInitializer.jjtCreate(this, JJTVARIABLEINITIALIZER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LBRACKET:{
        ArrayInitializer();
        break;
        }
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case LT:
      case BANG:
      case TILDE:
      case INCR:
      case DECR:
      case PLUS:
      case MINUS:{
        Expression();
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ArrayInitializer() throws ParseException {
  ASTArrayInitializer jjtn000 = (ASTArrayInitializer)ASTArrayInitializer.jjtCreate(this, JJTARRAYINITIALIZER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LBRACKET);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case LBRACKET:
      case LT:
      case BANG:
      case TILDE:
      case INCR:
      case DECR:
      case PLUS:
      case MINUS:{
        VariableInitializer();
        label_13:
        while (true) {
          if (jj_2_10(2)) {
            ;
          } else {
            break label_13;
          }
          jj_consume_token(COMMA);
          VariableInitializer();
        }
        break;
        }
      default:
        jj_la1[28] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        jj_consume_token(COMMA);
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        ;
      }
      jj_consume_token(RBRACKET);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void MethodDeclaration() throws ParseException {
  ASTMethodDeclaration jjtn000 = (ASTMethodDeclaration)ASTMethodDeclaration.jjtCreate(this, JJTMETHODDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_14:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ABSTRACT:
        case PRIVATE:
        case PROTECTED:
        case PUBLIC:
        case STATIC:{
          ;
          break;
          }
        default:
          jj_la1[30] = jj_gen;
          break label_14;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        case PROTECTED:{
          jj_consume_token(PROTECTED);
          break;
          }
        case PRIVATE:{
          jj_consume_token(PRIVATE);
          break;
          }
        case STATIC:{
          jj_consume_token(STATIC);
          break;
          }
        case ABSTRACT:{
          jj_consume_token(ABSTRACT);
          break;
          }
        default:
          jj_la1[31] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      jj_consume_token(FUNCTION);
      MethodDeclarator();
      jj_consume_token(COLON);
      ResultType();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case THROWS:{
        jj_consume_token(THROWS);
        NameList();
        break;
        }
      default:
        jj_la1[32] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LBRACE:{
        Block();
        break;
        }
      case SEMICOLON:{
        jj_consume_token(SEMICOLON);
        break;
        }
      default:
        jj_la1[33] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void MethodDeclarator() throws ParseException {
  ASTMethodDeclarator jjtn000 = (ASTMethodDeclarator)ASTMethodDeclarator.jjtCreate(this, JJTMETHODDECLARATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      FormalParameters();
      label_15:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[34] = jj_gen;
          break label_15;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void FormalParameters() throws ParseException {
  ASTFormalParameters jjtn000 = (ASTFormalParameters)ASTFormalParameters.jjtCreate(this, JJTFORMALPARAMETERS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        FormalParameter();
        label_16:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COMMA:{
            ;
            break;
            }
          default:
            jj_la1[35] = jj_gen;
            break label_16;
          }
          jj_consume_token(COMMA);
          FormalParameter();
        }
        break;
        }
      default:
        jj_la1[36] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void FormalParameter() throws ParseException {
  ASTFormalParameter jjtn000 = (ASTFormalParameter)ASTFormalParameter.jjtCreate(this, JJTFORMALPARAMETER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      VariableDeclaratorId();
      jj_consume_token(COLON);
      Type();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ConstructorDeclaration() throws ParseException {
  ASTConstructorDeclaration jjtn000 = (ASTConstructorDeclaration)ASTConstructorDeclaration.jjtCreate(this, JJTCONSTRUCTORDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PRIVATE:
      case PROTECTED:
      case PUBLIC:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PUBLIC:{
          jj_consume_token(PUBLIC);
          break;
          }
        case PROTECTED:{
          jj_consume_token(PROTECTED);
          break;
          }
        case PRIVATE:{
          jj_consume_token(PRIVATE);
          break;
          }
        default:
          jj_la1[37] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[38] = jj_gen;
        ;
      }
      jj_consume_token(CONSTRUCTOR);
      FormalParameters();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case THROWS:{
        jj_consume_token(THROWS);
        NameList();
        break;
        }
      default:
        jj_la1[39] = jj_gen;
        ;
      }
      jj_consume_token(LBRACE);
      if (jj_2_11(2147483647)) {
        ExplicitConstructorInvocation();
      } else {
        ;
      }
      label_17:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BOOLEAN:
        case BREAK:
        case BYTE:
        case CLASS:
        case CONST:
        case CONTINUE:
        case DO:
        case FALSE:
        case FOR:
        case IF:
        case INTERFACE:
        case LET:
        case NUMBER:
        case NEW:
        case NULL:
        case RETURN:
        case STRING:
        case SUPER:
        case SWITCH:
        case THIS:
        case THROW:
        case TRUE:
        case TRY:
        case VOID:
        case WHILE:
        case NUMBER_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case LPAREN:
        case LBRACE:
        case SEMICOLON:
        case INCR:
        case DECR:{
          ;
          break;
          }
        default:
          jj_la1[40] = jj_gen;
          break label_17;
        }
        BlockStatement();
      }
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ExplicitConstructorInvocation() throws ParseException {
  ASTExplicitConstructorInvocation jjtn000 = (ASTExplicitConstructorInvocation)ASTExplicitConstructorInvocation.jjtCreate(this, JJTEXPLICITCONSTRUCTORINVOCATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_13(2147483647)) {
        jj_consume_token(THIS);
        Arguments();
        jj_consume_token(SEMICOLON);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BOOLEAN:
        case BYTE:
        case FALSE:
        case NUMBER:
        case NEW:
        case NULL:
        case STRING:
        case SUPER:
        case THIS:
        case TRUE:
        case VOID:
        case NUMBER_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case LPAREN:{
          if (jj_2_12(2)) {
            PrimaryExpression();
            jj_consume_token(DOT);
          } else {
            ;
          }
          jj_consume_token(SUPER);
          Arguments();
          jj_consume_token(SEMICOLON);
          break;
          }
        default:
          jj_la1[41] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Initializer() throws ParseException {
  ASTInitializer jjtn000 = (ASTInitializer)ASTInitializer.jjtCreate(this, JJTINITIALIZER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case STATIC:{
        jj_consume_token(STATIC);
        break;
        }
      default:
        jj_la1[42] = jj_gen;
        ;
      }
      Block();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  final public 
void Type() throws ParseException {
  ASTType jjtn000 = (ASTType)ASTType.jjtCreate(this, JJTTYPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case NUMBER:
      case STRING:{
        PrimitiveType();
        break;
        }
      case IDENTIFIER:{
        Name();
        break;
        }
      default:
        jj_la1[43] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_18:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[44] = jj_gen;
          break label_18;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PrimitiveType() throws ParseException {
  ASTPrimitiveType jjtn000 = (ASTPrimitiveType)ASTPrimitiveType.jjtCreate(this, JJTPRIMITIVETYPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:{
        jj_consume_token(BOOLEAN);
        break;
        }
      case BYTE:{
        jj_consume_token(BYTE);
        break;
        }
      case NUMBER:{
        jj_consume_token(NUMBER);
        break;
        }
      case STRING:{
        jj_consume_token(STRING);
        break;
        }
      default:
        jj_la1[45] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ResultType() throws ParseException {
  ASTResultType jjtn000 = (ASTResultType)ASTResultType.jjtCreate(this, JJTRESULTTYPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VOID:{
        jj_consume_token(VOID);
        break;
        }
      case BOOLEAN:
      case BYTE:
      case NUMBER:
      case STRING:
      case IDENTIFIER:{
        Type();
        break;
        }
      default:
        jj_la1[46] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Name() throws ParseException {
  ASTName jjtn000 = (ASTName)ASTName.jjtCreate(this, JJTNAME);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      label_19:
      while (true) {
        if (jj_2_14(2)) {
          ;
        } else {
          break label_19;
        }
        jj_consume_token(DOT);
        jj_consume_token(IDENTIFIER);
      }
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void NameList() throws ParseException {
  ASTNameList jjtn000 = (ASTNameList)ASTNameList.jjtCreate(this, JJTNAMELIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Name();
      label_20:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[47] = jj_gen;
          break label_20;
        }
        jj_consume_token(COMMA);
        Name();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  final public 
void Expression() throws ParseException {
  ASTExpression jjtn000 = (ASTExpression)ASTExpression.jjtCreate(this, JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ConditionalExpression();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASSIGN:
      case PLUSASSIGN:
      case MINUSASSIGN:
      case STARASSIGN:
      case SLASHASSIGN:
      case ANDASSIGN:
      case ORASSIGN:
      case XORASSIGN:
      case REMASSIGN:
      case LSHIFTASSIGN:
      case RSIGNEDSHIFTASSIGN:
      case RUNSIGNEDSHIFTASSIGN:{
        AssignmentOperator();
        Expression();
        break;
        }
      default:
        jj_la1[48] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void AssignmentOperator() throws ParseException {
  ASTAssignmentOperator jjtn000 = (ASTAssignmentOperator)ASTAssignmentOperator.jjtCreate(this, JJTASSIGNMENTOPERATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASSIGN:{
        jj_consume_token(ASSIGN);
        break;
        }
      case STARASSIGN:{
        jj_consume_token(STARASSIGN);
        break;
        }
      case SLASHASSIGN:{
        jj_consume_token(SLASHASSIGN);
        break;
        }
      case REMASSIGN:{
        jj_consume_token(REMASSIGN);
        break;
        }
      case PLUSASSIGN:{
        jj_consume_token(PLUSASSIGN);
        break;
        }
      case MINUSASSIGN:{
        jj_consume_token(MINUSASSIGN);
        break;
        }
      case LSHIFTASSIGN:{
        jj_consume_token(LSHIFTASSIGN);
        break;
        }
      case RSIGNEDSHIFTASSIGN:{
        jj_consume_token(RSIGNEDSHIFTASSIGN);
        break;
        }
      case RUNSIGNEDSHIFTASSIGN:{
        jj_consume_token(RUNSIGNEDSHIFTASSIGN);
        break;
        }
      case ANDASSIGN:{
        jj_consume_token(ANDASSIGN);
        break;
        }
      case XORASSIGN:{
        jj_consume_token(XORASSIGN);
        break;
        }
      case ORASSIGN:{
        jj_consume_token(ORASSIGN);
        break;
        }
      default:
        jj_la1[49] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ConditionalExpression() throws ParseException {
  ASTConditionalExpression jjtn000 = (ASTConditionalExpression)ASTConditionalExpression.jjtCreate(this, JJTCONDITIONALEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ConditionalOrExpression();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case HOOK:{
        jj_consume_token(HOOK);
        Expression();
        jj_consume_token(COLON);
        ConditionalExpression();
        break;
        }
      default:
        jj_la1[50] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ConditionalOrExpression() throws ParseException {
  ASTConditionalOrExpression jjtn000 = (ASTConditionalOrExpression)ASTConditionalOrExpression.jjtCreate(this, JJTCONDITIONALOREXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ConditionalAndExpression();
      label_21:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SC_OR:{
          ;
          break;
          }
        default:
          jj_la1[51] = jj_gen;
          break label_21;
        }
        jj_consume_token(SC_OR);
        ConditionalAndExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ConditionalAndExpression() throws ParseException {
  ASTConditionalAndExpression jjtn000 = (ASTConditionalAndExpression)ASTConditionalAndExpression.jjtCreate(this, JJTCONDITIONALANDEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      InclusiveOrExpression();
      label_22:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SC_AND:{
          ;
          break;
          }
        default:
          jj_la1[52] = jj_gen;
          break label_22;
        }
        jj_consume_token(SC_AND);
        InclusiveOrExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void InclusiveOrExpression() throws ParseException {
  ASTInclusiveOrExpression jjtn000 = (ASTInclusiveOrExpression)ASTInclusiveOrExpression.jjtCreate(this, JJTINCLUSIVEOREXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ExclusiveOrExpression();
      label_23:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BIT_OR:{
          ;
          break;
          }
        default:
          jj_la1[53] = jj_gen;
          break label_23;
        }
        jj_consume_token(BIT_OR);
        ExclusiveOrExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ExclusiveOrExpression() throws ParseException {
  ASTExclusiveOrExpression jjtn000 = (ASTExclusiveOrExpression)ASTExclusiveOrExpression.jjtCreate(this, JJTEXCLUSIVEOREXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      AndExpression();
      label_24:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case XOR:{
          ;
          break;
          }
        default:
          jj_la1[54] = jj_gen;
          break label_24;
        }
        jj_consume_token(XOR);
        AndExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void AndExpression() throws ParseException {
  ASTAndExpression jjtn000 = (ASTAndExpression)ASTAndExpression.jjtCreate(this, JJTANDEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      EqualityExpression();
      label_25:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BIT_AND:{
          ;
          break;
          }
        default:
          jj_la1[55] = jj_gen;
          break label_25;
        }
        jj_consume_token(BIT_AND);
        EqualityExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void EqualityExpression() throws ParseException {
  ASTEqualityExpression jjtn000 = (ASTEqualityExpression)ASTEqualityExpression.jjtCreate(this, JJTEQUALITYEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      InstanceOfExpression();
      label_26:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case EQ:
        case NE:{
          ;
          break;
          }
        default:
          jj_la1[56] = jj_gen;
          break label_26;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case EQ:{
          jj_consume_token(EQ);
          break;
          }
        case NE:{
          jj_consume_token(NE);
          break;
          }
        default:
          jj_la1[57] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        InstanceOfExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void InstanceOfExpression() throws ParseException {
  ASTInstanceOfExpression jjtn000 = (ASTInstanceOfExpression)ASTInstanceOfExpression.jjtCreate(this, JJTINSTANCEOFEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      RelationalExpression();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INSTANCEOF:{
        jj_consume_token(INSTANCEOF);
        Type();
        break;
        }
      default:
        jj_la1[58] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void RelationalExpression() throws ParseException {
  ASTRelationalExpression jjtn000 = (ASTRelationalExpression)ASTRelationalExpression.jjtCreate(this, JJTRELATIONALEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ShiftExpression();
      label_27:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case GT:
        case LT:
        case LE:
        case GE:{
          ;
          break;
          }
        default:
          jj_la1[59] = jj_gen;
          break label_27;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LT:{
          jj_consume_token(LT);
          break;
          }
        case GT:{
          jj_consume_token(GT);
          break;
          }
        case LE:{
          jj_consume_token(LE);
          break;
          }
        case GE:{
          jj_consume_token(GE);
          break;
          }
        default:
          jj_la1[60] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        ShiftExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ShiftExpression() throws ParseException {
  ASTShiftExpression jjtn000 = (ASTShiftExpression)ASTShiftExpression.jjtCreate(this, JJTSHIFTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      AdditiveExpression();
      label_28:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LSHIFT:
        case RSIGNEDSHIFT:
        case RUNSIGNEDSHIFT:{
          ;
          break;
          }
        default:
          jj_la1[61] = jj_gen;
          break label_28;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LSHIFT:{
          jj_consume_token(LSHIFT);
          break;
          }
        case RSIGNEDSHIFT:{
          jj_consume_token(RSIGNEDSHIFT);
          break;
          }
        case RUNSIGNEDSHIFT:{
          jj_consume_token(RUNSIGNEDSHIFT);
          break;
          }
        default:
          jj_la1[62] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        AdditiveExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void AdditiveExpression() throws ParseException {
  ASTAdditiveExpression jjtn000 = (ASTAdditiveExpression)ASTAdditiveExpression.jjtCreate(this, JJTADDITIVEEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      MultiplicativeExpression();
      label_29:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:
        case MINUS:{
          ;
          break;
          }
        default:
          jj_la1[63] = jj_gen;
          break label_29;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[64] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        MultiplicativeExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void MultiplicativeExpression() throws ParseException {
  ASTMultiplicativeExpression jjtn000 = (ASTMultiplicativeExpression)ASTMultiplicativeExpression.jjtCreate(this, JJTMULTIPLICATIVEEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      UnaryExpression();
      label_30:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STAR:
        case SLASH:
        case REM:{
          ;
          break;
          }
        default:
          jj_la1[65] = jj_gen;
          break label_30;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STAR:{
          jj_consume_token(STAR);
          break;
          }
        case SLASH:{
          jj_consume_token(SLASH);
          break;
          }
        case REM:{
          jj_consume_token(REM);
          break;
          }
        default:
          jj_la1[66] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        UnaryExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void UnaryExpression() throws ParseException {
  ASTUnaryExpression jjtn000 = (ASTUnaryExpression)ASTUnaryExpression.jjtCreate(this, JJTUNARYEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[67] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        UnaryExpression();
        break;
        }
      case INCR:{
        PreIncrementExpression();
        break;
        }
      case DECR:{
        PreDecrementExpression();
        break;
        }
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case LT:
      case BANG:
      case TILDE:{
        UnaryExpressionNotPlusMinus();
        break;
        }
      default:
        jj_la1[68] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PreIncrementExpression() throws ParseException {
  ASTPreIncrementExpression jjtn000 = (ASTPreIncrementExpression)ASTPreIncrementExpression.jjtCreate(this, JJTPREINCREMENTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INCR);
      PrimaryExpression();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PreDecrementExpression() throws ParseException {
  ASTPreDecrementExpression jjtn000 = (ASTPreDecrementExpression)ASTPreDecrementExpression.jjtCreate(this, JJTPREDECREMENTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(DECR);
      PrimaryExpression();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void UnaryExpressionNotPlusMinus() throws ParseException {
  ASTUnaryExpressionNotPlusMinus jjtn000 = (ASTUnaryExpressionNotPlusMinus)ASTUnaryExpressionNotPlusMinus.jjtCreate(this, JJTUNARYEXPRESSIONNOTPLUSMINUS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BANG:
      case TILDE:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TILDE:{
          jj_consume_token(TILDE);
          break;
          }
        case BANG:{
          jj_consume_token(BANG);
          break;
          }
        default:
          jj_la1[69] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        UnaryExpression();
        break;
        }
      default:
        jj_la1[70] = jj_gen;
        if (jj_2_15(2147483647)) {
          CastExpression();
        } else {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case BOOLEAN:
          case BYTE:
          case FALSE:
          case NUMBER:
          case NEW:
          case NULL:
          case STRING:
          case SUPER:
          case THIS:
          case TRUE:
          case VOID:
          case NUMBER_LITERAL:
          case STRING_LITERAL:
          case IDENTIFIER:
          case LPAREN:{
            PostfixExpression();
            break;
            }
          default:
            jj_la1[71] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  final public void CastLookahead() throws ParseException {
  ASTCastLookahead jjtn000 = (ASTCastLookahead)ASTCastLookahead.jjtCreate(this, JJTCASTLOOKAHEAD);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_16(2)) {
        jj_consume_token(LT);
        PrimitiveType();
      } else if (jj_2_17(2147483647)) {
        jj_consume_token(LT);
        Name();
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LT:{
          jj_consume_token(LT);
          Name();
          jj_consume_token(GT);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case TILDE:{
            jj_consume_token(TILDE);
            break;
            }
          case BANG:{
            jj_consume_token(BANG);
            break;
            }
          case LPAREN:{
            jj_consume_token(LPAREN);
            break;
            }
          case IDENTIFIER:{
            jj_consume_token(IDENTIFIER);
            break;
            }
          case THIS:{
            jj_consume_token(THIS);
            break;
            }
          case SUPER:{
            jj_consume_token(SUPER);
            break;
            }
          case NEW:{
            jj_consume_token(NEW);
            break;
            }
          case FALSE:
          case NULL:
          case TRUE:
          case NUMBER_LITERAL:
          case STRING_LITERAL:{
            Literal();
            break;
            }
          default:
            jj_la1[72] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[73] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PostfixExpression() throws ParseException {
  ASTPostfixExpression jjtn000 = (ASTPostfixExpression)ASTPostfixExpression.jjtCreate(this, JJTPOSTFIXEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      PrimaryExpression();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INCR:
      case DECR:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INCR:{
          jj_consume_token(INCR);
          break;
          }
        case DECR:{
          jj_consume_token(DECR);
          break;
          }
        default:
          jj_la1[74] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[75] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void CastExpression() throws ParseException {
  ASTCastExpression jjtn000 = (ASTCastExpression)ASTCastExpression.jjtCreate(this, JJTCASTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_18(2147483647)) {
        jj_consume_token(LT);
        Type();
        jj_consume_token(GT);
        UnaryExpression();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LT:{
          jj_consume_token(LT);
          Type();
          jj_consume_token(GT);
          UnaryExpressionNotPlusMinus();
          break;
          }
        default:
          jj_la1[76] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PrimaryExpression() throws ParseException {
  ASTPrimaryExpression jjtn000 = (ASTPrimaryExpression)ASTPrimaryExpression.jjtCreate(this, JJTPRIMARYEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      PrimaryPrefix();
      label_31:
      while (true) {
        if (jj_2_19(2)) {
          ;
        } else {
          break label_31;
        }
        PrimarySuffix();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PrimaryPrefix() throws ParseException {
  ASTPrimaryPrefix jjtn000 = (ASTPrimaryPrefix)ASTPrimaryPrefix.jjtCreate(this, JJTPRIMARYPREFIX);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FALSE:
      case NULL:
      case TRUE:
      case NUMBER_LITERAL:
      case STRING_LITERAL:{
        Literal();
        break;
        }
      case THIS:{
        jj_consume_token(THIS);
        break;
        }
      case SUPER:{
        jj_consume_token(SUPER);
        jj_consume_token(DOT);
        jj_consume_token(IDENTIFIER);
        break;
        }
      case LPAREN:{
        jj_consume_token(LPAREN);
        Expression();
        jj_consume_token(RPAREN);
        break;
        }
      case NEW:{
        AllocationExpression();
        break;
        }
      default:
        jj_la1[77] = jj_gen;
        if (jj_2_20(2147483647)) {
          ResultType();
          jj_consume_token(DOT);
          jj_consume_token(CLASS);
        } else {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case IDENTIFIER:{
            Name();
            break;
            }
          default:
            jj_la1[78] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void PrimarySuffix() throws ParseException {
  ASTPrimarySuffix jjtn000 = (ASTPrimarySuffix)ASTPrimarySuffix.jjtCreate(this, JJTPRIMARYSUFFIX);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_21(2)) {
        jj_consume_token(DOT);
        jj_consume_token(THIS);
      } else if (jj_2_22(2)) {
        jj_consume_token(DOT);
        AllocationExpression();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          jj_consume_token(LBRACKET);
          Expression();
          jj_consume_token(RBRACKET);
          break;
          }
        case DOT:{
          jj_consume_token(DOT);
          jj_consume_token(IDENTIFIER);
          break;
          }
        case LPAREN:{
          Arguments();
          break;
          }
        default:
          jj_la1[79] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Literal() throws ParseException {
  ASTLiteral jjtn000 = (ASTLiteral)ASTLiteral.jjtCreate(this, JJTLITERAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMBER_LITERAL:{
        jj_consume_token(NUMBER_LITERAL);
        break;
        }
      case STRING_LITERAL:{
        jj_consume_token(STRING_LITERAL);
        break;
        }
      case FALSE:
      case TRUE:{
        BooleanLiteral();
        break;
        }
      case NULL:{
        NullLiteral();
        break;
        }
      default:
        jj_la1[80] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void BooleanLiteral() throws ParseException {
  ASTBooleanLiteral jjtn000 = (ASTBooleanLiteral)ASTBooleanLiteral.jjtCreate(this, JJTBOOLEANLITERAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:{
        jj_consume_token(TRUE);
        break;
        }
      case FALSE:{
        jj_consume_token(FALSE);
        break;
        }
      default:
        jj_la1[81] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void NullLiteral() throws ParseException {
  ASTNullLiteral jjtn000 = (ASTNullLiteral)ASTNullLiteral.jjtCreate(this, JJTNULLLITERAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(NULL);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Arguments() throws ParseException {
  ASTArguments jjtn000 = (ASTArguments)ASTArguments.jjtCreate(this, JJTARGUMENTS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case LT:
      case BANG:
      case TILDE:
      case INCR:
      case DECR:
      case PLUS:
      case MINUS:{
        ArgumentList();
        break;
        }
      default:
        jj_la1[82] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ArgumentList() throws ParseException {
  ASTArgumentList jjtn000 = (ASTArgumentList)ASTArgumentList.jjtCreate(this, JJTARGUMENTLIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Expression();
      label_32:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[83] = jj_gen;
          break label_32;
        }
        jj_consume_token(COMMA);
        Expression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void AllocationExpression() throws ParseException {
  ASTAllocationExpression jjtn000 = (ASTAllocationExpression)ASTAllocationExpression.jjtCreate(this, JJTALLOCATIONEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_23(2)) {
        jj_consume_token(NEW);
        PrimitiveType();
        ArrayDimsAndInits();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NEW:{
          jj_consume_token(NEW);
          Name();
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LBRACKET:{
            ArrayDimsAndInits();
            break;
            }
          case LPAREN:{
            Arguments();
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case LBRACE:{
              ClassBody();
              break;
              }
            default:
              jj_la1[84] = jj_gen;
              ;
            }
            break;
            }
          default:
            jj_la1[85] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[86] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ArrayDimsAndInits() throws ParseException {
  ASTArrayDimsAndInits jjtn000 = (ASTArrayDimsAndInits)ASTArrayDimsAndInits.jjtCreate(this, JJTARRAYDIMSANDINITS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_26(2)) {
        label_33:
        while (true) {
          jj_consume_token(LBRACKET);
          Expression();
          jj_consume_token(RBRACKET);
          if (jj_2_24(2)) {
            ;
          } else {
            break label_33;
          }
        }
        label_34:
        while (true) {
          if (jj_2_25(2)) {
            ;
          } else {
            break label_34;
          }
          jj_consume_token(LBRACKET);
          jj_consume_token(RBRACKET);
        }
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          label_35:
          while (true) {
            jj_consume_token(LBRACKET);
            jj_consume_token(RBRACKET);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case LBRACKET:{
              ;
              break;
              }
            default:
              jj_la1[87] = jj_gen;
              break label_35;
            }
          }
          ArrayInitializer();
          break;
          }
        default:
          jj_la1[88] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  final public 
void Statement() throws ParseException {
  ASTStatement jjtn000 = (ASTStatement)ASTStatement.jjtCreate(this, JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_27(2)) {
        LabeledStatement();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACE:{
          Block();
          break;
          }
        case SEMICOLON:{
          EmptyStatement();
          break;
          }
        case BOOLEAN:
        case BYTE:
        case FALSE:
        case NUMBER:
        case NEW:
        case NULL:
        case STRING:
        case SUPER:
        case THIS:
        case TRUE:
        case VOID:
        case NUMBER_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case LPAREN:
        case INCR:
        case DECR:{
          StatementExpression();
          jj_consume_token(SEMICOLON);
          break;
          }
        case SWITCH:{
          SwitchStatement();
          break;
          }
        case IF:{
          IfStatement();
          break;
          }
        case WHILE:{
          WhileStatement();
          break;
          }
        case DO:{
          DoStatement();
          break;
          }
        case FOR:{
          ForStatement();
          break;
          }
        case BREAK:{
          BreakStatement();
          break;
          }
        case CONTINUE:{
          ContinueStatement();
          break;
          }
        case RETURN:{
          ReturnStatement();
          break;
          }
        case THROW:{
          ThrowStatement();
          break;
          }
        case TRY:{
          TryStatement();
          break;
          }
        default:
          jj_la1[89] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void LabeledStatement() throws ParseException {
  ASTLabeledStatement jjtn000 = (ASTLabeledStatement)ASTLabeledStatement.jjtCreate(this, JJTLABELEDSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(COLON);
      Statement();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Block() throws ParseException {
  ASTBlock jjtn000 = (ASTBlock)ASTBlock.jjtCreate(this, JJTBLOCK);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LBRACE);
      label_36:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BOOLEAN:
        case BREAK:
        case BYTE:
        case CLASS:
        case CONST:
        case CONTINUE:
        case DO:
        case FALSE:
        case FOR:
        case IF:
        case INTERFACE:
        case LET:
        case NUMBER:
        case NEW:
        case NULL:
        case RETURN:
        case STRING:
        case SUPER:
        case SWITCH:
        case THIS:
        case THROW:
        case TRUE:
        case TRY:
        case VOID:
        case WHILE:
        case NUMBER_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case LPAREN:
        case LBRACE:
        case SEMICOLON:
        case INCR:
        case DECR:{
          ;
          break;
          }
        default:
          jj_la1[90] = jj_gen;
          break label_36;
        }
        BlockStatement();
      }
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void BlockStatement() throws ParseException {
  ASTBlockStatement jjtn000 = (ASTBlockStatement)ASTBlockStatement.jjtCreate(this, JJTBLOCKSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_28(2147483647)) {
        LocalVariableDeclaration();
        jj_consume_token(SEMICOLON);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BOOLEAN:
        case BREAK:
        case BYTE:
        case CONTINUE:
        case DO:
        case FALSE:
        case FOR:
        case IF:
        case NUMBER:
        case NEW:
        case NULL:
        case RETURN:
        case STRING:
        case SUPER:
        case SWITCH:
        case THIS:
        case THROW:
        case TRUE:
        case TRY:
        case VOID:
        case WHILE:
        case NUMBER_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case LPAREN:
        case LBRACE:
        case SEMICOLON:
        case INCR:
        case DECR:{
          Statement();
          break;
          }
        case CLASS:{
          UnmodifiedClassDeclaration();
          break;
          }
        case INTERFACE:{
          UnmodifiedInterfaceDeclaration();
          break;
          }
        default:
          jj_la1[91] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void LocalVariableDeclaration() throws ParseException {
  ASTLocalVariableDeclaration jjtn000 = (ASTLocalVariableDeclaration)ASTLocalVariableDeclaration.jjtCreate(this, JJTLOCALVARIABLEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LET:{
        jj_consume_token(LET);
        break;
        }
      case CONST:{
        jj_consume_token(CONST);
        break;
        }
      default:
        jj_la1[92] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      VariableDeclarator();
      label_37:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[93] = jj_gen;
          break label_37;
        }
        jj_consume_token(COMMA);
        VariableDeclarator();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void EmptyStatement() throws ParseException {
  ASTEmptyStatement jjtn000 = (ASTEmptyStatement)ASTEmptyStatement.jjtCreate(this, JJTEMPTYSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(SEMICOLON);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void StatementExpression() throws ParseException {
  ASTStatementExpression jjtn000 = (ASTStatementExpression)ASTStatementExpression.jjtCreate(this, JJTSTATEMENTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INCR:{
        PreIncrementExpression();
        break;
        }
      case DECR:{
        PreDecrementExpression();
        break;
        }
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:{
        PrimaryExpression();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ASSIGN:
        case INCR:
        case DECR:
        case PLUSASSIGN:
        case MINUSASSIGN:
        case STARASSIGN:
        case SLASHASSIGN:
        case ANDASSIGN:
        case ORASSIGN:
        case XORASSIGN:
        case REMASSIGN:
        case LSHIFTASSIGN:
        case RSIGNEDSHIFTASSIGN:
        case RUNSIGNEDSHIFTASSIGN:{
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case INCR:{
            jj_consume_token(INCR);
            break;
            }
          case DECR:{
            jj_consume_token(DECR);
            break;
            }
          case ASSIGN:
          case PLUSASSIGN:
          case MINUSASSIGN:
          case STARASSIGN:
          case SLASHASSIGN:
          case ANDASSIGN:
          case ORASSIGN:
          case XORASSIGN:
          case REMASSIGN:
          case LSHIFTASSIGN:
          case RSIGNEDSHIFTASSIGN:
          case RUNSIGNEDSHIFTASSIGN:{
            AssignmentOperator();
            Expression();
            break;
            }
          default:
            jj_la1[94] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[95] = jj_gen;
          ;
        }
        break;
        }
      default:
        jj_la1[96] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void SwitchStatement() throws ParseException {
  ASTSwitchStatement jjtn000 = (ASTSwitchStatement)ASTSwitchStatement.jjtCreate(this, JJTSWITCHSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(SWITCH);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      jj_consume_token(LBRACE);
      label_38:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CASE:
        case _DEFAULT:{
          ;
          break;
          }
        default:
          jj_la1[97] = jj_gen;
          break label_38;
        }
        SwitchLabel();
        label_39:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case BOOLEAN:
          case BREAK:
          case BYTE:
          case CLASS:
          case CONST:
          case CONTINUE:
          case DO:
          case FALSE:
          case FOR:
          case IF:
          case INTERFACE:
          case LET:
          case NUMBER:
          case NEW:
          case NULL:
          case RETURN:
          case STRING:
          case SUPER:
          case SWITCH:
          case THIS:
          case THROW:
          case TRUE:
          case TRY:
          case VOID:
          case WHILE:
          case NUMBER_LITERAL:
          case STRING_LITERAL:
          case IDENTIFIER:
          case LPAREN:
          case LBRACE:
          case SEMICOLON:
          case INCR:
          case DECR:{
            ;
            break;
            }
          default:
            jj_la1[98] = jj_gen;
            break label_39;
          }
          BlockStatement();
        }
      }
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void SwitchLabel() throws ParseException {
  ASTSwitchLabel jjtn000 = (ASTSwitchLabel)ASTSwitchLabel.jjtCreate(this, JJTSWITCHLABEL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:{
        jj_consume_token(CASE);
        Expression();
        jj_consume_token(COLON);
        break;
        }
      case _DEFAULT:{
        jj_consume_token(_DEFAULT);
        jj_consume_token(COLON);
        break;
        }
      default:
        jj_la1[99] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void IfStatement() throws ParseException {
  ASTIfStatement jjtn000 = (ASTIfStatement)ASTIfStatement.jjtCreate(this, JJTIFSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IF);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      Statement();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ELSE:{
        jj_consume_token(ELSE);
        Statement();
        break;
        }
      default:
        jj_la1[100] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void WhileStatement() throws ParseException {
  ASTWhileStatement jjtn000 = (ASTWhileStatement)ASTWhileStatement.jjtCreate(this, JJTWHILESTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(WHILE);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      Statement();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void DoStatement() throws ParseException {
  ASTDoStatement jjtn000 = (ASTDoStatement)ASTDoStatement.jjtCreate(this, JJTDOSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(DO);
      Statement();
      jj_consume_token(WHILE);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ForStatement() throws ParseException {
  ASTForStatement jjtn000 = (ASTForStatement)ASTForStatement.jjtCreate(this, JJTFORSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FOR);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case CONST:
      case FALSE:
      case LET:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case INCR:
      case DECR:{
        ForInit();
        break;
        }
      default:
        jj_la1[101] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case LT:
      case BANG:
      case TILDE:
      case INCR:
      case DECR:
      case PLUS:
      case MINUS:{
        Expression();
        break;
        }
      default:
        jj_la1[102] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case INCR:
      case DECR:{
        ForUpdate();
        break;
        }
      default:
        jj_la1[103] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
      Statement();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ForInit() throws ParseException {
  ASTForInit jjtn000 = (ASTForInit)ASTForInit.jjtCreate(this, JJTFORINIT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_29(2147483647)) {
        LocalVariableDeclaration();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BOOLEAN:
        case BYTE:
        case FALSE:
        case NUMBER:
        case NEW:
        case NULL:
        case STRING:
        case SUPER:
        case THIS:
        case TRUE:
        case VOID:
        case NUMBER_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case LPAREN:
        case INCR:
        case DECR:{
          StatementExpressionList();
          break;
          }
        default:
          jj_la1[104] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void StatementExpressionList() throws ParseException {
  ASTStatementExpressionList jjtn000 = (ASTStatementExpressionList)ASTStatementExpressionList.jjtCreate(this, JJTSTATEMENTEXPRESSIONLIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      StatementExpression();
      label_40:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[105] = jj_gen;
          break label_40;
        }
        jj_consume_token(COMMA);
        StatementExpression();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ForUpdate() throws ParseException {
  ASTForUpdate jjtn000 = (ASTForUpdate)ASTForUpdate.jjtCreate(this, JJTFORUPDATE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      StatementExpressionList();
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void BreakStatement() throws ParseException {
  ASTBreakStatement jjtn000 = (ASTBreakStatement)ASTBreakStatement.jjtCreate(this, JJTBREAKSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(BREAK);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[106] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ContinueStatement() throws ParseException {
  ASTContinueStatement jjtn000 = (ASTContinueStatement)ASTContinueStatement.jjtCreate(this, JJTCONTINUESTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(CONTINUE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[107] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ReturnStatement() throws ParseException {
  ASTReturnStatement jjtn000 = (ASTReturnStatement)ASTReturnStatement.jjtCreate(this, JJTRETURNSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(RETURN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:
      case BYTE:
      case FALSE:
      case NUMBER:
      case NEW:
      case NULL:
      case STRING:
      case SUPER:
      case THIS:
      case TRUE:
      case VOID:
      case NUMBER_LITERAL:
      case STRING_LITERAL:
      case IDENTIFIER:
      case LPAREN:
      case LT:
      case BANG:
      case TILDE:
      case INCR:
      case DECR:
      case PLUS:
      case MINUS:{
        Expression();
        break;
        }
      default:
        jj_la1[108] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ThrowStatement() throws ParseException {
  ASTThrowStatement jjtn000 = (ASTThrowStatement)ASTThrowStatement.jjtCreate(this, JJTTHROWSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(THROW);
      Expression();
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void TryStatement() throws ParseException {
  ASTTryStatement jjtn000 = (ASTTryStatement)ASTTryStatement.jjtCreate(this, JJTTRYSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(TRY);
      Block();
      label_41:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CATCH:{
          ;
          break;
          }
        default:
          jj_la1[109] = jj_gen;
          break label_41;
        }
        jj_consume_token(CATCH);
        jj_consume_token(LPAREN);
        FormalParameter();
        jj_consume_token(RPAREN);
        Block();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FINALLY:{
        jj_consume_token(FINALLY);
        Block();
        break;
        }
      default:
        jj_la1[110] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_2_8(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  private boolean jj_2_9(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  private boolean jj_2_10(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  private boolean jj_2_11(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  private boolean jj_2_12(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  private boolean jj_2_13(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  private boolean jj_2_14(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  private boolean jj_2_15(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  private boolean jj_2_16(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  private boolean jj_2_17(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  private boolean jj_2_18(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  private boolean jj_2_19(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  private boolean jj_2_20(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_20(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  private boolean jj_2_21(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_21(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(20, xla); }
  }

  private boolean jj_2_22(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_22(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(21, xla); }
  }

  private boolean jj_2_23(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_23(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(22, xla); }
  }

  private boolean jj_2_24(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_24(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(23, xla); }
  }

  private boolean jj_2_25(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_25(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(24, xla); }
  }

  private boolean jj_2_26(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_26(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(25, xla); }
  }

  private boolean jj_2_27(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_27(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(26, xla); }
  }

  private boolean jj_2_28(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_28(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(27, xla); }
  }

  private boolean jj_2_29(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_29(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(28, xla); }
  }

  private boolean jj_3R_216()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_215()) return true;
    return false;
  }

  private boolean jj_3R_68()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_12()) jj_scanpos = xsp;
    if (jj_scan_token(SUPER)) return true;
    if (jj_3R_53()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_67()
 {
    if (jj_scan_token(THIS)) return true;
    if (jj_3R_53()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_51()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_67()) {
    jj_scanpos = xsp;
    if (jj_3R_68()) return true;
    }
    return false;
  }

  private boolean jj_3R_105()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(37)) {
    jj_scanpos = xsp;
    if (jj_scan_token(21)) return true;
    }
    if (jj_3R_197()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_227()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_191()
 {
    if (jj_3R_93()) return true;
    return false;
  }

  private boolean jj_3R_190()
 {
    if (jj_3R_51()) return true;
    return false;
  }

  private boolean jj_3_28()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(37)) {
    jj_scanpos = xsp;
    if (jj_scan_token(21)) return true;
    }
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_62()) return true;
    return false;
  }

  private boolean jj_3R_100()
 {
    if (jj_3R_108()) return true;
    return false;
  }

  private boolean jj_3R_187()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_99()
 {
    if (jj_3R_107()) return true;
    return false;
  }

  private boolean jj_3R_177()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_187()) jj_scanpos = xsp;
    if (jj_scan_token(CONSTRUCTOR)) return true;
    if (jj_3R_188()) return true;
    xsp = jj_scanpos;
    if (jj_3R_189()) jj_scanpos = xsp;
    if (jj_scan_token(LBRACE)) return true;
    xsp = jj_scanpos;
    if (jj_3R_190()) jj_scanpos = xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_191()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RBRACE)) return true;
    return false;
  }

  private boolean jj_3R_98()
 {
    if (jj_3R_106()) return true;
    return false;
  }

  private boolean jj_3_10()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_50()) return true;
    return false;
  }

  private boolean jj_3R_82()
 {
    if (jj_3R_93()) return true;
    return false;
  }

  private boolean jj_3R_93()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_97()) {
    jj_scanpos = xsp;
    if (jj_3R_98()) {
    jj_scanpos = xsp;
    if (jj_3R_99()) {
    jj_scanpos = xsp;
    if (jj_3R_100()) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_97()
 {
    if (jj_3R_105()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_215()
 {
    if (jj_3R_208()) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_62()) return true;
    return false;
  }

  private boolean jj_3R_205()
 {
    if (jj_3R_215()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_216()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_63()
 {
    if (jj_scan_token(LBRACE)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_82()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RBRACE)) return true;
    return false;
  }

  private boolean jj_3R_188()
 {
    if (jj_scan_token(LPAREN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_205()) jj_scanpos = xsp;
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  private boolean jj_3R_61()
 {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_106()) return true;
    return false;
  }

  private boolean jj_3R_209()
 {
    if (jj_scan_token(ASSIGN)) return true;
    if (jj_3R_50()) return true;
    return false;
  }

  private boolean jj_3R_193()
 {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_3R_188()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_207()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_25()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_126()
 {
    if (jj_3R_140()) return true;
    return false;
  }

  private boolean jj_3R_195()
 {
    if (jj_3R_63()) return true;
    return false;
  }

  private boolean jj_3R_125()
 {
    if (jj_3R_139()) return true;
    return false;
  }

  private boolean jj_3R_192()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) {
    jj_scanpos = xsp;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_124()
 {
    if (jj_3R_138()) return true;
    return false;
  }

  private boolean jj_3R_178()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_192()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(FUNCTION)) return true;
    if (jj_3R_193()) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_58()) return true;
    xsp = jj_scanpos;
    if (jj_3R_194()) jj_scanpos = xsp;
    xsp = jj_scanpos;
    if (jj_3R_195()) {
    jj_scanpos = xsp;
    if (jj_scan_token(75)) return true;
    }
    return false;
  }

  private boolean jj_3R_161()
 {
    if (jj_3R_50()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_10()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_123()
 {
    if (jj_3R_137()) return true;
    return false;
  }

  private boolean jj_3R_122()
 {
    if (jj_3R_136()) return true;
    return false;
  }

  private boolean jj_3R_218()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_121()
 {
    if (jj_3R_135()) return true;
    return false;
  }

  private boolean jj_3R_83()
 {
    if (jj_scan_token(LBRACKET)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_161()) jj_scanpos = xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(76)) jj_scanpos = xsp;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_120()
 {
    if (jj_3R_134()) return true;
    return false;
  }

  private boolean jj_3R_198()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_197()) return true;
    return false;
  }

  private boolean jj_3R_119()
 {
    if (jj_3R_133()) return true;
    return false;
  }

  private boolean jj_3R_118()
 {
    if (jj_3R_132()) return true;
    return false;
  }

  private boolean jj_3R_66()
 {
    if (jj_3R_60()) return true;
    return false;
  }

  private boolean jj_3R_117()
 {
    if (jj_3R_131()) return true;
    return false;
  }

  private boolean jj_3R_65()
 {
    if (jj_3R_83()) return true;
    return false;
  }

  private boolean jj_3R_50()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_65()) {
    jj_scanpos = xsp;
    if (jj_3R_66()) return true;
    }
    return false;
  }

  private boolean jj_3R_116()
 {
    if (jj_3R_130()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_115()
 {
    if (jj_3R_129()) return true;
    return false;
  }

  private boolean jj_3R_114()
 {
    if (jj_3R_63()) return true;
    return false;
  }

  private boolean jj_3R_208()
 {
    if (jj_scan_token(IDENTIFIER)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_218()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_27()
 {
    if (jj_3R_61()) return true;
    return false;
  }

  private boolean jj_3R_106()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_27()) {
    jj_scanpos = xsp;
    if (jj_3R_114()) {
    jj_scanpos = xsp;
    if (jj_3R_115()) {
    jj_scanpos = xsp;
    if (jj_3R_116()) {
    jj_scanpos = xsp;
    if (jj_3R_117()) {
    jj_scanpos = xsp;
    if (jj_3R_118()) {
    jj_scanpos = xsp;
    if (jj_3R_119()) {
    jj_scanpos = xsp;
    if (jj_3R_120()) {
    jj_scanpos = xsp;
    if (jj_3R_121()) {
    jj_scanpos = xsp;
    if (jj_3R_122()) {
    jj_scanpos = xsp;
    if (jj_3R_123()) {
    jj_scanpos = xsp;
    if (jj_3R_124()) {
    jj_scanpos = xsp;
    if (jj_3R_125()) {
    jj_scanpos = xsp;
    if (jj_3R_126()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_154()
 {
    if (jj_3R_158()) return true;
    return false;
  }

  private boolean jj_3R_197()
 {
    if (jj_3R_208()) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_62()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_209()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_203()
 {
    if (jj_scan_token(EXTENDS)) return true;
    if (jj_3R_206()) return true;
    return false;
  }

  private boolean jj_3R_196()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) {
    jj_scanpos = xsp;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(21)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_157()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3_9()
 {
    if (jj_3R_47()) return true;
    return false;
  }

  private boolean jj_3R_49()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_179()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_196()) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_197()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_198()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_153()
 {
    Token xsp;
    if (jj_3R_157()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_157()) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_83()) return true;
    return false;
  }

  private boolean jj_3_24()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3_8()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_49()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(INTERFACE)) return true;
    return false;
  }

  private boolean jj_3R_48()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_26()
 {
    Token xsp;
    if (jj_3_24()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_24()) { jj_scanpos = xsp; break; }
    }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_25()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_146()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_26()) {
    jj_scanpos = xsp;
    if (jj_3R_153()) return true;
    }
    return false;
  }

  private boolean jj_3_7()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_48()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(CLASS)) return true;
    return false;
  }

  private boolean jj_3R_224()
 {
    if (jj_3R_179()) return true;
    return false;
  }

  private boolean jj_3R_148()
 {
    if (jj_3R_53()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_154()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_147()
 {
    if (jj_3R_146()) return true;
    return false;
  }

  private boolean jj_3R_95()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_60()) return true;
    return false;
  }

  private boolean jj_3R_223()
 {
    if (jj_3R_178()) return true;
    return false;
  }

  private boolean jj_3R_222()
 {
    if (jj_3R_176()) return true;
    return false;
  }

  private boolean jj_3R_77()
 {
    if (jj_scan_token(NEW)) return true;
    if (jj_3R_56()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_147()) {
    jj_scanpos = xsp;
    if (jj_3R_148()) return true;
    }
    return false;
  }

  private boolean jj_3R_221()
 {
    if (jj_3R_175()) return true;
    return false;
  }

  private boolean jj_3R_214()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_221()) {
    jj_scanpos = xsp;
    if (jj_3R_222()) {
    jj_scanpos = xsp;
    if (jj_3R_223()) {
    jj_scanpos = xsp;
    if (jj_3R_224()) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_204()
 {
    if (jj_3R_214()) return true;
    return false;
  }

  private boolean jj_3R_59()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_23()) {
    jj_scanpos = xsp;
    if (jj_3R_77()) return true;
    }
    return false;
  }

  private boolean jj_3_23()
 {
    if (jj_scan_token(NEW)) return true;
    if (jj_3R_55()) return true;
    if (jj_3R_146()) return true;
    return false;
  }

  private boolean jj_3R_108()
 {
    if (jj_scan_token(INTERFACE)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_203()) jj_scanpos = xsp;
    if (jj_scan_token(LBRACE)) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_204()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RBRACE)) return true;
    return false;
  }

  private boolean jj_3R_70()
 {
    if (jj_3R_90()) return true;
    return false;
  }

  private boolean jj_3R_90()
 {
    if (jj_3R_60()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_95()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_186()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_176()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_186()) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_108()) return true;
    return false;
  }

  private boolean jj_3R_53()
 {
    if (jj_scan_token(LPAREN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_70()) jj_scanpos = xsp;
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  private boolean jj_3R_91()
 {
    if (jj_3R_94()) return true;
    return false;
  }

  private boolean jj_3R_110()
 {
    if (jj_scan_token(NULL)) return true;
    return false;
  }

  private boolean jj_3R_202()
 {
    if (jj_scan_token(IMPLEMENTS)) return true;
    if (jj_3R_206()) return true;
    return false;
  }

  private boolean jj_3R_64()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) {
    jj_scanpos = xsp;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_6()
 {
    if (jj_3R_47()) return true;
    return false;
  }

  private boolean jj_3R_46()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_47()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_64()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(FUNCTION)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  private boolean jj_3R_109()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(53)) {
    jj_scanpos = xsp;
    if (jj_scan_token(28)) return true;
    }
    return false;
  }

  private boolean jj_3_5()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_46()) jj_scanpos = xsp;
    if (jj_scan_token(CONSTRUCTOR)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  private boolean jj_3R_45()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_4()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_45()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(INTERFACE)) return true;
    return false;
  }

  private boolean jj_3R_44()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_102()
 {
    if (jj_3R_110()) return true;
    return false;
  }

  private boolean jj_3R_172()
 {
    if (jj_3R_179()) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_44()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(CLASS)) return true;
    return false;
  }

  private boolean jj_3R_101()
 {
    if (jj_3R_109()) return true;
    return false;
  }

  private boolean jj_3R_171()
 {
    if (jj_3R_178()) return true;
    return false;
  }

  private boolean jj_3R_94()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(58)) {
    jj_scanpos = xsp;
    if (jj_scan_token(65)) {
    jj_scanpos = xsp;
    if (jj_3R_101()) {
    jj_scanpos = xsp;
    if (jj_3R_102()) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_170()
 {
    if (jj_3R_177()) return true;
    return false;
  }

  private boolean jj_3R_169()
 {
    if (jj_3R_176()) return true;
    return false;
  }

  private boolean jj_3R_75()
 {
    if (jj_3R_53()) return true;
    return false;
  }

  private boolean jj_3R_201()
 {
    if (jj_scan_token(EXTENDS)) return true;
    if (jj_3R_56()) return true;
    return false;
  }

  private boolean jj_3R_168()
 {
    if (jj_3R_175()) return true;
    return false;
  }

  private boolean jj_3R_74()
 {
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  private boolean jj_3R_165()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_168()) {
    jj_scanpos = xsp;
    if (jj_3R_169()) {
    jj_scanpos = xsp;
    if (jj_3R_170()) {
    jj_scanpos = xsp;
    if (jj_3R_171()) {
    jj_scanpos = xsp;
    if (jj_3R_172()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_3R_43()) return true;
    return false;
  }

  private boolean jj_3R_73()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3_22()
 {
    if (jj_scan_token(DOT)) return true;
    if (jj_3R_59()) return true;
    return false;
  }

  private boolean jj_3_20()
 {
    if (jj_3R_58()) return true;
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(CLASS)) return true;
    return false;
  }

  private boolean jj_3R_185()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_57()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_21()) {
    jj_scanpos = xsp;
    if (jj_3_22()) {
    jj_scanpos = xsp;
    if (jj_3R_73()) {
    jj_scanpos = xsp;
    if (jj_3R_74()) {
    jj_scanpos = xsp;
    if (jj_3R_75()) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_21()
 {
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(THIS)) return true;
    return false;
  }

  private boolean jj_3R_175()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_185()) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_107()) return true;
    return false;
  }

  private boolean jj_3R_162()
 {
    if (jj_3R_165()) return true;
    return false;
  }

  private boolean jj_3R_89()
 {
    if (jj_3R_56()) return true;
    return false;
  }

  private boolean jj_3R_158()
 {
    if (jj_scan_token(LBRACE)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_162()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RBRACE)) return true;
    return false;
  }

  private boolean jj_3_19()
 {
    if (jj_3R_57()) return true;
    return false;
  }

  private boolean jj_3R_88()
 {
    if (jj_3R_58()) return true;
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(CLASS)) return true;
    return false;
  }

  private boolean jj_3R_87()
 {
    if (jj_3R_59()) return true;
    return false;
  }

  private boolean jj_3R_86()
 {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  private boolean jj_3R_107()
 {
    if (jj_scan_token(CLASS)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_201()) jj_scanpos = xsp;
    xsp = jj_scanpos;
    if (jj_3R_202()) jj_scanpos = xsp;
    if (jj_3R_158()) return true;
    return false;
  }

  private boolean jj_3R_85()
 {
    if (jj_scan_token(SUPER)) return true;
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  private boolean jj_3R_236()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(91)) {
    jj_scanpos = xsp;
    if (jj_scan_token(92)) return true;
    }
    return false;
  }

  private boolean jj_3R_69()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_84()) {
    jj_scanpos = xsp;
    if (jj_scan_token(50)) {
    jj_scanpos = xsp;
    if (jj_3R_85()) {
    jj_scanpos = xsp;
    if (jj_3R_86()) {
    jj_scanpos = xsp;
    if (jj_3R_87()) {
    jj_scanpos = xsp;
    if (jj_3R_88()) {
    jj_scanpos = xsp;
    if (jj_3R_89()) return true;
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_84()
 {
    if (jj_3R_94()) return true;
    return false;
  }

  private boolean jj_3R_42()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(44)) return true;
    }
    return false;
  }

  private boolean jj_3_18()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_55()) return true;
    return false;
  }

  private boolean jj_3R_52()
 {
    if (jj_3R_69()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_19()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_1()
 {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_42()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(CLASS)) return true;
    return false;
  }

  private boolean jj_3R_226()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_62()) return true;
    if (jj_scan_token(GT)) return true;
    if (jj_3R_200()) return true;
    return false;
  }

  private boolean jj_3R_225()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_62()) return true;
    if (jj_scan_token(GT)) return true;
    if (jj_3R_174()) return true;
    return false;
  }

  private boolean jj_3R_219()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_225()) {
    jj_scanpos = xsp;
    if (jj_3R_226()) return true;
    }
    return false;
  }

  private boolean jj_3_17()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_56()) return true;
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_220()
 {
    if (jj_3R_52()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_236()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_72()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_56()) return true;
    if (jj_scan_token(GT)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(82)) {
    jj_scanpos = xsp;
    if (jj_scan_token(81)) {
    jj_scanpos = xsp;
    if (jj_scan_token(69)) {
    jj_scanpos = xsp;
    if (jj_scan_token(66)) {
    jj_scanpos = xsp;
    if (jj_scan_token(50)) {
    jj_scanpos = xsp;
    if (jj_scan_token(48)) {
    jj_scanpos = xsp;
    if (jj_scan_token(40)) {
    jj_scanpos = xsp;
    if (jj_3R_91()) return true;
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_71()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_56()) return true;
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3_15()
 {
    if (jj_3R_54()) return true;
    return false;
  }

  private boolean jj_3R_54()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_16()) {
    jj_scanpos = xsp;
    if (jj_3R_71()) {
    jj_scanpos = xsp;
    if (jj_3R_72()) return true;
    }
    }
    return false;
  }

  private boolean jj_3_16()
 {
    if (jj_scan_token(LT)) return true;
    if (jj_3R_55()) return true;
    return false;
  }

  private boolean jj_3R_213()
 {
    if (jj_3R_220()) return true;
    return false;
  }

  private boolean jj_3R_212()
 {
    if (jj_3R_219()) return true;
    return false;
  }

  private boolean jj_3R_211()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(82)) {
    jj_scanpos = xsp;
    if (jj_scan_token(81)) return true;
    }
    if (jj_3R_174()) return true;
    return false;
  }

  private boolean jj_3R_200()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_211()) {
    jj_scanpos = xsp;
    if (jj_3R_212()) {
    jj_scanpos = xsp;
    if (jj_3R_213()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_152()
 {
    if (jj_scan_token(DECR)) return true;
    if (jj_3R_52()) return true;
    return false;
  }

  private boolean jj_3R_199()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(93)) {
    jj_scanpos = xsp;
    if (jj_scan_token(94)) return true;
    }
    if (jj_3R_167()) return true;
    return false;
  }

  private boolean jj_3R_210()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(95)) {
    jj_scanpos = xsp;
    if (jj_scan_token(96)) {
    jj_scanpos = xsp;
    if (jj_scan_token(100)) return true;
    }
    }
    if (jj_3R_174()) return true;
    return false;
  }

  private boolean jj_3R_151()
 {
    if (jj_scan_token(INCR)) return true;
    if (jj_3R_52()) return true;
    return false;
  }

  private boolean jj_3R_184()
 {
    if (jj_3R_200()) return true;
    return false;
  }

  private boolean jj_3R_180()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(101)) {
    jj_scanpos = xsp;
    if (jj_scan_token(102)) {
    jj_scanpos = xsp;
    if (jj_scan_token(103)) return true;
    }
    }
    if (jj_3R_164()) return true;
    return false;
  }

  private boolean jj_3R_183()
 {
    if (jj_3R_152()) return true;
    return false;
  }

  private boolean jj_3R_182()
 {
    if (jj_3R_151()) return true;
    return false;
  }

  private boolean jj_3R_181()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(93)) {
    jj_scanpos = xsp;
    if (jj_scan_token(94)) return true;
    }
    if (jj_3R_174()) return true;
    return false;
  }

  private boolean jj_3R_174()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_181()) {
    jj_scanpos = xsp;
    if (jj_3R_182()) {
    jj_scanpos = xsp;
    if (jj_3R_183()) {
    jj_scanpos = xsp;
    if (jj_3R_184()) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_173()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(80)) {
    jj_scanpos = xsp;
    if (jj_scan_token(79)) {
    jj_scanpos = xsp;
    if (jj_scan_token(86)) {
    jj_scanpos = xsp;
    if (jj_scan_token(87)) return true;
    }
    }
    }
    if (jj_3R_160()) return true;
    return false;
  }

  private boolean jj_3R_166()
 {
    if (jj_scan_token(INSTANCEOF)) return true;
    if (jj_3R_62()) return true;
    return false;
  }

  private boolean jj_3R_167()
 {
    if (jj_3R_174()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_210()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_163()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(85)) {
    jj_scanpos = xsp;
    if (jj_scan_token(88)) return true;
    }
    if (jj_3R_150()) return true;
    return false;
  }

  private boolean jj_3R_164()
 {
    if (jj_3R_167()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_199()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_160()
 {
    if (jj_3R_164()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_180()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_159()
 {
    if (jj_scan_token(BIT_AND)) return true;
    if (jj_3R_142()) return true;
    return false;
  }

  private boolean jj_3R_156()
 {
    if (jj_3R_160()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_173()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_149()
 {
    if (jj_scan_token(BIT_OR)) return true;
    if (jj_3R_113()) return true;
    return false;
  }

  private boolean jj_3R_155()
 {
    if (jj_scan_token(XOR)) return true;
    if (jj_3R_128()) return true;
    return false;
  }

  private boolean jj_3R_150()
 {
    if (jj_3R_156()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_166()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_141()
 {
    if (jj_scan_token(SC_AND)) return true;
    if (jj_3R_104()) return true;
    return false;
  }

  private boolean jj_3R_142()
 {
    if (jj_3R_150()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_163()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_235()
 {
    if (jj_scan_token(FINALLY)) return true;
    if (jj_3R_63()) return true;
    return false;
  }

  private boolean jj_3R_127()
 {
    if (jj_scan_token(SC_OR)) return true;
    if (jj_3R_96()) return true;
    return false;
  }

  private boolean jj_3R_234()
 {
    if (jj_scan_token(CATCH)) return true;
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_215()) return true;
    if (jj_scan_token(RPAREN)) return true;
    if (jj_3R_63()) return true;
    return false;
  }

  private boolean jj_3R_232()
 {
    if (jj_3R_241()) return true;
    return false;
  }

  private boolean jj_3R_140()
 {
    if (jj_scan_token(TRY)) return true;
    if (jj_3R_63()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_234()) { jj_scanpos = xsp; break; }
    }
    xsp = jj_scanpos;
    if (jj_3R_235()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_233()
 {
    if (jj_3R_60()) return true;
    return false;
  }

  private boolean jj_3R_128()
 {
    if (jj_3R_142()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_159()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_111()
 {
    if (jj_scan_token(HOOK)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_78()) return true;
    return false;
  }

  private boolean jj_3R_139()
 {
    if (jj_scan_token(THROW)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_113()
 {
    if (jj_3R_128()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_155()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_248()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_130()) return true;
    return false;
  }

  private boolean jj_3R_138()
 {
    if (jj_scan_token(RETURN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_233()) jj_scanpos = xsp;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_104()
 {
    if (jj_3R_113()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_149()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_137()
 {
    if (jj_scan_token(CONTINUE)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(66)) jj_scanpos = xsp;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_96()
 {
    if (jj_3R_104()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_141()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_231()
 {
    if (jj_3R_60()) return true;
    return false;
  }

  private boolean jj_3R_136()
 {
    if (jj_scan_token(BREAK)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(66)) jj_scanpos = xsp;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_92()
 {
    if (jj_3R_96()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_127()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_229()
 {
    if (jj_scan_token(ELSE)) return true;
    if (jj_3R_106()) return true;
    return false;
  }

  private boolean jj_3R_241()
 {
    if (jj_3R_247()) return true;
    return false;
  }

  private boolean jj_3R_78()
 {
    if (jj_3R_92()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_111()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3_29()
 {
    if (jj_scan_token(LET)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(COLON)) return true;
    if (jj_3R_62()) return true;
    return false;
  }

  private boolean jj_3R_247()
 {
    if (jj_3R_130()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_248()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_112()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(78)) {
    jj_scanpos = xsp;
    if (jj_scan_token(106)) {
    jj_scanpos = xsp;
    if (jj_scan_token(107)) {
    jj_scanpos = xsp;
    if (jj_scan_token(111)) {
    jj_scanpos = xsp;
    if (jj_scan_token(104)) {
    jj_scanpos = xsp;
    if (jj_scan_token(105)) {
    jj_scanpos = xsp;
    if (jj_scan_token(112)) {
    jj_scanpos = xsp;
    if (jj_scan_token(113)) {
    jj_scanpos = xsp;
    if (jj_scan_token(114)) {
    jj_scanpos = xsp;
    if (jj_scan_token(108)) {
    jj_scanpos = xsp;
    if (jj_scan_token(110)) {
    jj_scanpos = xsp;
    if (jj_scan_token(109)) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_230()
 {
    if (jj_3R_240()) return true;
    return false;
  }

  private boolean jj_3R_246()
 {
    if (jj_3R_247()) return true;
    return false;
  }

  private boolean jj_3R_103()
 {
    if (jj_3R_112()) return true;
    if (jj_3R_60()) return true;
    return false;
  }

  private boolean jj_3R_245()
 {
    if (jj_3R_105()) return true;
    return false;
  }

  private boolean jj_3R_240()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_245()) {
    jj_scanpos = xsp;
    if (jj_3R_246()) return true;
    }
    return false;
  }

  private boolean jj_3R_60()
 {
    if (jj_3R_78()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_103()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_135()
 {
    if (jj_scan_token(FOR)) return true;
    if (jj_scan_token(LPAREN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_230()) jj_scanpos = xsp;
    if (jj_scan_token(SEMICOLON)) return true;
    xsp = jj_scanpos;
    if (jj_3R_231()) jj_scanpos = xsp;
    if (jj_scan_token(SEMICOLON)) return true;
    xsp = jj_scanpos;
    if (jj_3R_232()) jj_scanpos = xsp;
    if (jj_scan_token(RPAREN)) return true;
    if (jj_3R_106()) return true;
    return false;
  }

  private boolean jj_3R_217()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_56()) return true;
    return false;
  }

  private boolean jj_3R_134()
 {
    if (jj_scan_token(DO)) return true;
    if (jj_3R_106()) return true;
    if (jj_scan_token(WHILE)) return true;
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RPAREN)) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_206()
 {
    if (jj_3R_56()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_217()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_81()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_133()
 {
    if (jj_scan_token(WHILE)) return true;
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RPAREN)) return true;
    if (jj_3R_106()) return true;
    return false;
  }

  private boolean jj_3R_239()
 {
    if (jj_3R_93()) return true;
    return false;
  }

  private boolean jj_3_14()
 {
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  private boolean jj_3R_56()
 {
    if (jj_scan_token(IDENTIFIER)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_14()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_132()
 {
    if (jj_scan_token(IF)) return true;
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RPAREN)) return true;
    if (jj_3R_106()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_229()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_227()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_197()) return true;
    return false;
  }

  private boolean jj_3R_76()
 {
    if (jj_3R_62()) return true;
    return false;
  }

  private boolean jj_3R_80()
 {
    if (jj_3R_56()) return true;
    return false;
  }

  private boolean jj_3R_244()
 {
    if (jj_scan_token(_DEFAULT)) return true;
    if (jj_scan_token(COLON)) return true;
    return false;
  }

  private boolean jj_3R_58()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(56)) {
    jj_scanpos = xsp;
    if (jj_3R_76()) return true;
    }
    return false;
  }

  private boolean jj_3R_243()
 {
    if (jj_scan_token(CASE)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(COLON)) return true;
    return false;
  }

  private boolean jj_3R_238()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_243()) {
    jj_scanpos = xsp;
    if (jj_3R_244()) return true;
    }
    return false;
  }

  private boolean jj_3R_228()
 {
    if (jj_3R_238()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_239()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_131()
 {
    if (jj_scan_token(SWITCH)) return true;
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(RPAREN)) return true;
    if (jj_scan_token(LBRACE)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_228()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RBRACE)) return true;
    return false;
  }

  private boolean jj_3R_55()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(15)) {
    jj_scanpos = xsp;
    if (jj_scan_token(17)) {
    jj_scanpos = xsp;
    if (jj_scan_token(39)) {
    jj_scanpos = xsp;
    if (jj_scan_token(47)) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_189()
 {
    if (jj_scan_token(THROWS)) return true;
    if (jj_3R_206()) return true;
    return false;
  }

  private boolean jj_3R_242()
 {
    if (jj_3R_112()) return true;
    if (jj_3R_60()) return true;
    return false;
  }

  private boolean jj_3R_79()
 {
    if (jj_3R_55()) return true;
    return false;
  }

  private boolean jj_3R_62()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_79()) {
    jj_scanpos = xsp;
    if (jj_3R_80()) return true;
    }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_81()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_237()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(91)) {
    jj_scanpos = xsp;
    if (jj_scan_token(92)) {
    jj_scanpos = xsp;
    if (jj_3R_242()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_145()
 {
    if (jj_3R_52()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_237()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_194()
 {
    if (jj_scan_token(THROWS)) return true;
    if (jj_3R_206()) return true;
    return false;
  }

  private boolean jj_3R_144()
 {
    if (jj_3R_152()) return true;
    return false;
  }

  private boolean jj_3R_130()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_143()) {
    jj_scanpos = xsp;
    if (jj_3R_144()) {
    jj_scanpos = xsp;
    if (jj_3R_145()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_143()
 {
    if (jj_3R_151()) return true;
    return false;
  }

  private boolean jj_3_13()
 {
    if (jj_scan_token(THIS)) return true;
    if (jj_3R_53()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_43()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(46)) jj_scanpos = xsp;
    if (jj_3R_63()) return true;
    return false;
  }

  private boolean jj_3_11()
 {
    if (jj_3R_51()) return true;
    return false;
  }

  private boolean jj_3R_207()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_scan_token(RBRACKET)) return true;
    return false;
  }

  private boolean jj_3_12()
 {
    if (jj_3R_52()) return true;
    if (jj_scan_token(DOT)) return true;
    return false;
  }

  private boolean jj_3R_129()
 {
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  
  public JsitParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  
  public Token token;
  
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[111];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x0,0x102000,0x0,0x2000,0x2000,0x2000,0x8000000,0x0,0x80702000,0x2000,0x2000,0x200000,0x2000,0x2000,0x2000,0x2000,0x2000,0x2000,0x8000000,0x80302000,0x200000,0x200000,0x200000,0x0,0x0,0x0,0x10028000,0x10028000,0x0,0x2000,0x2000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x52b38000,0x10028000,0x0,0x28000,0x0,0x28000,0x28000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10028000,0x0,0x0,0x10028000,0x10000000,0x0,0x0,0x0,0x0,0x10000000,0x0,0x0,0x10000000,0x10000000,0x10028000,0x0,0x0,0x0,0x0,0x0,0x0,0x52838000,0x52b38000,0x52938000,0x200000,0x0,0x0,0x0,0x10028000,0x1040000,0x52b38000,0x1040000,0x4000000,0x10228000,0x10028000,0x10028000,0x10028000,0x0,0x0,0x0,0x10028000,0x80000,0x20000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x40,0x800000,0x1010,0x0,0x1010,0x1000,0x1000,0x0,0x4,0x5c10,0x5c00,0x5c00,0x5c00,0x5c00,0x5c00,0x1000,0x1000,0x5c00,0x5c00,0x0,0x5c10,0x5c00,0x5c00,0x5c00,0x0,0x0,0x0,0x5258380,0x5258380,0x0,0x5c00,0x5c00,0x100000,0x0,0x0,0x0,0x0,0x1c00,0x1c00,0x100000,0x76fa3b2,0x5258380,0x4000,0x8080,0x0,0x8080,0x1008080,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x8,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x5258380,0x0,0x0,0x5258380,0x4250300,0x0,0x0,0x0,0x0,0x4250300,0x0,0x0,0x4200200,0x200000,0x5258380,0x0,0x0,0x0,0x100,0x0,0x0,0x76fa382,0x76fa3b2,0x76fa392,0x20,0x0,0x0,0x0,0x5258380,0x0,0x76fa3b2,0x0,0x0,0x52583a0,0x5258380,0x5258380,0x5258380,0x0,0x0,0x0,0x5258380,0x0,0x0,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,0x800,0x2000,0x800,0x0,0x0,0x0,0x0,0x84,0x0,0x0,0x4,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4,0x4,0x0,0x0,0x1000,0x4000,0x200,0x78070226,0x78070226,0x1000,0x0,0x0,0x0,0x880,0x200,0x1000,0x4,0x0,0x0,0x0,0x180008a6,0x26,0x0,0x4,0x200,0x0,0x4,0x1000,0x4000,0x4000,0x80000,0x2000000,0x4000000,0x0,0x0,0x0,0x1200000,0x1200000,0x0,0xc18000,0xc18000,0x0,0x0,0x60000000,0x60000000,0x80000000,0x80000000,0x60000000,0x78070026,0x60000,0x60000,0x26,0x60026,0x10000,0x18000000,0x18000000,0x10000,0x22,0x4,0x2220,0x2,0x0,0x78070026,0x1000,0x80,0x220,0x0,0x200,0x200,0x180008a6,0x180008a6,0x180008a6,0x0,0x1000,0x18004000,0x18004000,0x18000026,0x0,0x180008a6,0x0,0x0,0x18000026,0x78070026,0x18000026,0x18000026,0x1000,0x4,0x4,0x78070026,0x0,0x0,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x7ff00,0x7ff00,0x0,0x0,0x0,0x4,0x8,0x2,0x0,0x0,0x0,0x0,0x0,0xe0,0xe0,0x0,0x0,0x11,0x11,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x7ff00,0x7ff00,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[29];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  
  public JsitParser(java.io.InputStream stream) {
     this(stream, null);
  }
  
  public JsitParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new JsitParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 111; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 111; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  
  public JsitParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new JsitParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 111; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 111; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  
  public JsitParser(JsitParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 111; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  
  public void ReInit(JsitParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 111; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }



  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }


  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[115];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 111; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 115; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  
  final public void enable_tracing() {
  }

  
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 29; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
            case 14: jj_3_15(); break;
            case 15: jj_3_16(); break;
            case 16: jj_3_17(); break;
            case 17: jj_3_18(); break;
            case 18: jj_3_19(); break;
            case 19: jj_3_20(); break;
            case 20: jj_3_21(); break;
            case 21: jj_3_22(); break;
            case 22: jj_3_23(); break;
            case 23: jj_3_24(); break;
            case 24: jj_3_25(); break;
            case 25: jj_3_26(); break;
            case 26: jj_3_27(); break;
            case 27: jj_3_28(); break;
            case 28: jj_3_29(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
