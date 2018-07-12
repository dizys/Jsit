package club.dizy.jsit.visitor;

import club.dizy.jsit.node.ASTCompilationUnit;
import club.dizy.jsit.node.SimpleNode;
import club.dizy.jsit.node.common.ASTArgumentList;
import club.dizy.jsit.node.common.ASTArguments;
import club.dizy.jsit.node.common.ASTArrayInitializer;
import club.dizy.jsit.node.common.ASTFormalParameter;
import club.dizy.jsit.node.common.ASTFormalParameters;
import club.dizy.jsit.node.common.ASTInitializer;
import club.dizy.jsit.node.common.ASTLocalVariableDeclaration;
import club.dizy.jsit.node.common.ASTVariableDeclarator;
import club.dizy.jsit.node.common.ASTVariableDeclaratorId;
import club.dizy.jsit.node.common.ASTVariableInitializer;
import club.dizy.jsit.node.expression.ASTAdditiveExpression;
import club.dizy.jsit.node.expression.ASTAllocationExpression;
import club.dizy.jsit.node.expression.ASTAndExpression;
import club.dizy.jsit.node.expression.ASTArrayDimsAndInits;
import club.dizy.jsit.node.expression.ASTAssignmentOperator;
import club.dizy.jsit.node.expression.ASTBooleanLiteral;
import club.dizy.jsit.node.expression.ASTCastExpression;
import club.dizy.jsit.node.expression.ASTCastLookahead;
import club.dizy.jsit.node.expression.ASTConditionalAndExpression;
import club.dizy.jsit.node.expression.ASTConditionalExpression;
import club.dizy.jsit.node.expression.ASTConditionalOrExpression;
import club.dizy.jsit.node.expression.ASTEqualityExpression;
import club.dizy.jsit.node.expression.ASTExclusiveOrExpression;
import club.dizy.jsit.node.expression.ASTExpression;
import club.dizy.jsit.node.expression.ASTInclusiveOrExpression;
import club.dizy.jsit.node.expression.ASTInstanceOfExpression;
import club.dizy.jsit.node.expression.ASTLiteral;
import club.dizy.jsit.node.expression.ASTMultiplicativeExpression;
import club.dizy.jsit.node.expression.ASTNullLiteral;
import club.dizy.jsit.node.expression.ASTPostfixExpression;
import club.dizy.jsit.node.expression.ASTPreDecrementExpression;
import club.dizy.jsit.node.expression.ASTPreIncrementExpression;
import club.dizy.jsit.node.expression.ASTPrimaryExpression;
import club.dizy.jsit.node.expression.ASTPrimaryPrefix;
import club.dizy.jsit.node.expression.ASTPrimarySuffix;
import club.dizy.jsit.node.expression.ASTPrimitiveType;
import club.dizy.jsit.node.expression.ASTRelationalExpression;
import club.dizy.jsit.node.expression.ASTResultType;
import club.dizy.jsit.node.expression.ASTShiftExpression;
import club.dizy.jsit.node.expression.ASTStatementExpression;
import club.dizy.jsit.node.expression.ASTStatementExpressionList;
import club.dizy.jsit.node.expression.ASTType;
import club.dizy.jsit.node.expression.ASTUnaryExpression;
import club.dizy.jsit.node.expression.ASTUnaryExpressionNotPlusMinus;
import club.dizy.jsit.node.statement.ASTBlock;
import club.dizy.jsit.node.statement.ASTBlockStatement;
import club.dizy.jsit.node.statement.ASTBreakStatement;
import club.dizy.jsit.node.statement.ASTContinueStatement;
import club.dizy.jsit.node.statement.ASTDoStatement;
import club.dizy.jsit.node.statement.ASTEmptyStatement;
import club.dizy.jsit.node.statement.ASTForInit;
import club.dizy.jsit.node.statement.ASTForStatement;
import club.dizy.jsit.node.statement.ASTForUpdate;
import club.dizy.jsit.node.statement.ASTIfStatement;
import club.dizy.jsit.node.statement.ASTLabeledStatement;
import club.dizy.jsit.node.statement.ASTReturnStatement;
import club.dizy.jsit.node.statement.ASTStatement;
import club.dizy.jsit.node.statement.ASTSwitchLabel;
import club.dizy.jsit.node.statement.ASTSwitchStatement;
import club.dizy.jsit.node.statement.ASTThrowStatement;
import club.dizy.jsit.node.statement.ASTTryStatement;
import club.dizy.jsit.node.statement.ASTWhileStatement;
import club.dizy.jsit.node.structure.ASTClassBody;
import club.dizy.jsit.node.structure.ASTClassBodyDeclaration;
import club.dizy.jsit.node.structure.ASTClassDeclaration;
import club.dizy.jsit.node.structure.ASTConstructorDeclaration;
import club.dizy.jsit.node.structure.ASTExplicitConstructorInvocation;
import club.dizy.jsit.node.structure.ASTFieldDeclaration;
import club.dizy.jsit.node.structure.ASTInterfaceDeclaration;
import club.dizy.jsit.node.structure.ASTInterfaceMemberDeclaration;
import club.dizy.jsit.node.structure.ASTMethodDeclaration;
import club.dizy.jsit.node.structure.ASTMethodDeclarationLookahead;
import club.dizy.jsit.node.structure.ASTMethodDeclarator;
import club.dizy.jsit.node.structure.ASTName;
import club.dizy.jsit.node.structure.ASTNameList;
import club.dizy.jsit.node.structure.ASTNamespaceDeclaration;
import club.dizy.jsit.node.structure.ASTNestedClassDeclaration;
import club.dizy.jsit.node.structure.ASTNestedInterfaceDeclaration;
import club.dizy.jsit.node.structure.ASTTypeDeclaration;
import club.dizy.jsit.node.structure.ASTUnmodifiedClassDeclaration;
import club.dizy.jsit.node.structure.ASTUnmodifiedInterfaceDeclaration;
import club.dizy.jsit.node.structure.ASTUseDeclaration;

public abstract interface JsitParserVisitor
{
  public abstract Object visit(SimpleNode paramSimpleNode, Object paramObject);
  
  public abstract Object visit(ASTCompilationUnit paramASTCompilationUnit, Object paramObject);
  
  public abstract Object visit(ASTNamespaceDeclaration paramASTNamespaceDeclaration, Object paramObject);
  
  public abstract Object visit(ASTUseDeclaration paramASTUseDeclaration, Object paramObject);
  
  public abstract Object visit(ASTTypeDeclaration paramASTTypeDeclaration, Object paramObject);
  
  public abstract Object visit(ASTClassDeclaration paramASTClassDeclaration, Object paramObject);
  
  public abstract Object visit(ASTUnmodifiedClassDeclaration paramASTUnmodifiedClassDeclaration, Object paramObject);
  
  public abstract Object visit(ASTClassBody paramASTClassBody, Object paramObject);
  
  public abstract Object visit(ASTNestedClassDeclaration paramASTNestedClassDeclaration, Object paramObject);
  
  public abstract Object visit(ASTClassBodyDeclaration paramASTClassBodyDeclaration, Object paramObject);
  
  public abstract Object visit(ASTMethodDeclarationLookahead paramASTMethodDeclarationLookahead, Object paramObject);
  
  public abstract Object visit(ASTInterfaceDeclaration paramASTInterfaceDeclaration, Object paramObject);
  
  public abstract Object visit(ASTNestedInterfaceDeclaration paramASTNestedInterfaceDeclaration, Object paramObject);
  
  public abstract Object visit(ASTUnmodifiedInterfaceDeclaration paramASTUnmodifiedInterfaceDeclaration, Object paramObject);
  
  public abstract Object visit(ASTInterfaceMemberDeclaration paramASTInterfaceMemberDeclaration, Object paramObject);
  
  public abstract Object visit(ASTFieldDeclaration paramASTFieldDeclaration, Object paramObject);
  
  public abstract Object visit(ASTVariableDeclarator paramASTVariableDeclarator, Object paramObject);
  
  public abstract Object visit(ASTVariableDeclaratorId paramASTVariableDeclaratorId, Object paramObject);
  
  public abstract Object visit(ASTVariableInitializer paramASTVariableInitializer, Object paramObject);
  
  public abstract Object visit(ASTArrayInitializer paramASTArrayInitializer, Object paramObject);
  
  public abstract Object visit(ASTMethodDeclaration paramASTMethodDeclaration, Object paramObject);
  
  public abstract Object visit(ASTMethodDeclarator paramASTMethodDeclarator, Object paramObject);
  
  public abstract Object visit(ASTFormalParameters paramASTFormalParameters, Object paramObject);
  
  public abstract Object visit(ASTFormalParameter paramASTFormalParameter, Object paramObject);
  
  public abstract Object visit(ASTConstructorDeclaration paramASTConstructorDeclaration, Object paramObject);
  
  public abstract Object visit(ASTExplicitConstructorInvocation paramASTExplicitConstructorInvocation, Object paramObject);
  
  public abstract Object visit(ASTInitializer paramASTInitializer, Object paramObject);
  
  public abstract Object visit(ASTType paramASTType, Object paramObject);
  
  public abstract Object visit(ASTPrimitiveType paramASTPrimitiveType, Object paramObject);
  
  public abstract Object visit(ASTResultType paramASTResultType, Object paramObject);
  
  public abstract Object visit(ASTName paramASTName, Object paramObject);
  
  public abstract Object visit(ASTNameList paramASTNameList, Object paramObject);
  
  public abstract Object visit(ASTExpression paramASTExpression, Object paramObject);
  
  public abstract Object visit(ASTAssignmentOperator paramASTAssignmentOperator, Object paramObject);
  
  public abstract Object visit(ASTConditionalExpression paramASTConditionalExpression, Object paramObject);
  
  public abstract Object visit(ASTConditionalOrExpression paramASTConditionalOrExpression, Object paramObject);
  
  public abstract Object visit(ASTConditionalAndExpression paramASTConditionalAndExpression, Object paramObject);
  
  public abstract Object visit(ASTInclusiveOrExpression paramASTInclusiveOrExpression, Object paramObject);
  
  public abstract Object visit(ASTExclusiveOrExpression paramASTExclusiveOrExpression, Object paramObject);
  
  public abstract Object visit(ASTAndExpression paramASTAndExpression, Object paramObject);
  
  public abstract Object visit(ASTEqualityExpression paramASTEqualityExpression, Object paramObject);
  
  public abstract Object visit(ASTInstanceOfExpression paramASTInstanceOfExpression, Object paramObject);
  
  public abstract Object visit(ASTRelationalExpression paramASTRelationalExpression, Object paramObject);
  
  public abstract Object visit(ASTShiftExpression paramASTShiftExpression, Object paramObject);
  
  public abstract Object visit(ASTAdditiveExpression paramASTAdditiveExpression, Object paramObject);
  
  public abstract Object visit(ASTMultiplicativeExpression paramASTMultiplicativeExpression, Object paramObject);
  
  public abstract Object visit(ASTUnaryExpression paramASTUnaryExpression, Object paramObject);
  
  public abstract Object visit(ASTPreIncrementExpression paramASTPreIncrementExpression, Object paramObject);
  
  public abstract Object visit(ASTPreDecrementExpression paramASTPreDecrementExpression, Object paramObject);
  
  public abstract Object visit(ASTUnaryExpressionNotPlusMinus paramASTUnaryExpressionNotPlusMinus, Object paramObject);
  
  public abstract Object visit(ASTCastLookahead paramASTCastLookahead, Object paramObject);
  
  public abstract Object visit(ASTPostfixExpression paramASTPostfixExpression, Object paramObject);
  
  public abstract Object visit(ASTCastExpression paramASTCastExpression, Object paramObject);
  
  public abstract Object visit(ASTPrimaryExpression paramASTPrimaryExpression, Object paramObject);
  
  public abstract Object visit(ASTPrimaryPrefix paramASTPrimaryPrefix, Object paramObject);
  
  public abstract Object visit(ASTPrimarySuffix paramASTPrimarySuffix, Object paramObject);
  
  public abstract Object visit(ASTLiteral paramASTLiteral, Object paramObject);
  
  public abstract Object visit(ASTBooleanLiteral paramASTBooleanLiteral, Object paramObject);
  
  public abstract Object visit(ASTNullLiteral paramASTNullLiteral, Object paramObject);
  
  public abstract Object visit(ASTArguments paramASTArguments, Object paramObject);
  
  public abstract Object visit(ASTArgumentList paramASTArgumentList, Object paramObject);
  
  public abstract Object visit(ASTAllocationExpression paramASTAllocationExpression, Object paramObject);
  
  public abstract Object visit(ASTArrayDimsAndInits paramASTArrayDimsAndInits, Object paramObject);
  
  public abstract Object visit(ASTStatement paramASTStatement, Object paramObject);
  
  public abstract Object visit(ASTLabeledStatement paramASTLabeledStatement, Object paramObject);
  
  public abstract Object visit(ASTBlock paramASTBlock, Object paramObject);
  
  public abstract Object visit(ASTBlockStatement paramASTBlockStatement, Object paramObject);
  
  public abstract Object visit(ASTLocalVariableDeclaration paramASTLocalVariableDeclaration, Object paramObject);
  
  public abstract Object visit(ASTEmptyStatement paramASTEmptyStatement, Object paramObject);
  
  public abstract Object visit(ASTStatementExpression paramASTStatementExpression, Object paramObject);
  
  public abstract Object visit(ASTSwitchStatement paramASTSwitchStatement, Object paramObject);
  
  public abstract Object visit(ASTSwitchLabel paramASTSwitchLabel, Object paramObject);
  
  public abstract Object visit(ASTIfStatement paramASTIfStatement, Object paramObject);
  
  public abstract Object visit(ASTWhileStatement paramASTWhileStatement, Object paramObject);
  
  public abstract Object visit(ASTDoStatement paramASTDoStatement, Object paramObject);
  
  public abstract Object visit(ASTForStatement paramASTForStatement, Object paramObject);
  
  public abstract Object visit(ASTForInit paramASTForInit, Object paramObject);
  
  public abstract Object visit(ASTStatementExpressionList paramASTStatementExpressionList, Object paramObject);
  
  public abstract Object visit(ASTForUpdate paramASTForUpdate, Object paramObject);
  
  public abstract Object visit(ASTBreakStatement paramASTBreakStatement, Object paramObject);
  
  public abstract Object visit(ASTContinueStatement paramASTContinueStatement, Object paramObject);
  
  public abstract Object visit(ASTReturnStatement paramASTReturnStatement, Object paramObject);
  
  public abstract Object visit(ASTThrowStatement paramASTThrowStatement, Object paramObject);
  
  public abstract Object visit(ASTTryStatement paramASTTryStatement, Object paramObject);
}




