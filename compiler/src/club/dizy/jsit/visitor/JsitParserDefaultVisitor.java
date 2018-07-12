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
 import club.dizy.jsit.visitor.common.ASTArgumentListVisitor;
 import club.dizy.jsit.visitor.common.ASTArgumentsVisitor;
 import club.dizy.jsit.visitor.common.ASTArrayInitializerVisitor;
 import club.dizy.jsit.visitor.common.ASTFormalParameterVisitor;
 import club.dizy.jsit.visitor.common.ASTFormalParametersVisitor;
 import club.dizy.jsit.visitor.common.ASTLocalVariableDeclarationVisitor;
 import club.dizy.jsit.visitor.common.ASTVariableDeclaratorIdVisitor;
 import club.dizy.jsit.visitor.common.ASTVariableDeclaratorVisitor;
 import club.dizy.jsit.visitor.expression.ASTAdditiveExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTAllocationExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTAndExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTArrayDimsAndInitsVisitor;
 import club.dizy.jsit.visitor.expression.ASTAssignmentOperatorVisitor;
 import club.dizy.jsit.visitor.expression.ASTBooleanLiteralVisitor;
 import club.dizy.jsit.visitor.expression.ASTCastExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTConditionalAndExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTConditionalExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTConditionalOrExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTEqualityExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTExclusiveOrExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTInclusiveOrExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTInstanceOfExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTLiteralVisitor;
 import club.dizy.jsit.visitor.expression.ASTMultiplicativeExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTNullLiteralVisitor;
 import club.dizy.jsit.visitor.expression.ASTPostfixExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTPreDecrementExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTPreIncrementExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTPrimaryPrefixVisitor;
 import club.dizy.jsit.visitor.expression.ASTPrimarySuffixVisitor;
 import club.dizy.jsit.visitor.expression.ASTPrimitiveTypeVisitor;
 import club.dizy.jsit.visitor.expression.ASTRelationalExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTResultTypeVisitor;
 import club.dizy.jsit.visitor.expression.ASTShiftExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTStatementExpressionListVisitor;
 import club.dizy.jsit.visitor.expression.ASTStatementExpressionVisitor;
 import club.dizy.jsit.visitor.expression.ASTTypeVisitor;
 import club.dizy.jsit.visitor.expression.ASTUnaryExpressionNotPlusMinusVisitor;
 import club.dizy.jsit.visitor.expression.ASTUnaryExpressionVisitor;
 import club.dizy.jsit.visitor.statement.ASTBlockStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTBlockVisitor;
 import club.dizy.jsit.visitor.statement.ASTBreakStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTContinueStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTDoStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTForStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTIfStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTLabeledStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTReturnStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTSwitchLabelVisitor;
 import club.dizy.jsit.visitor.statement.ASTSwitchStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTThrowStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTTryStatementVisitor;
 import club.dizy.jsit.visitor.statement.ASTWhileStatementVisitor;
 import club.dizy.jsit.visitor.structure.ASTClassBodyDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTClassBodyVisitor;
 import club.dizy.jsit.visitor.structure.ASTClassDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTCompilationUnitVisitor;
 import club.dizy.jsit.visitor.structure.ASTContructorDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTExplicitConstructorInvocationVisitor;
 import club.dizy.jsit.visitor.structure.ASTFieldDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTInterfaceDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTMethodDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTMethodDeclaratorVisitor;
 import club.dizy.jsit.visitor.structure.ASTNameListVisitor;
 import club.dizy.jsit.visitor.structure.ASTNameVisitor;
 import club.dizy.jsit.visitor.structure.ASTNamespaceDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTNestedClassDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTNestedInterfaceDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTUnmodeifiedClassDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTUnmodifiedInterfaceDeclarationVisitor;
 import club.dizy.jsit.visitor.structure.ASTUseDeclarationVisitor;
 
 public class JsitParserDefaultVisitor
   implements JsitParserVisitor
 {
   public Object defaultVisit(SimpleNode node, Object data)
   {
     node.childrenAccept(this, data);
     return data;
   }
   
   public Object visit(SimpleNode node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTCompilationUnit node, Object data)
   {
     ASTCompilationUnitVisitor visitor = new ASTCompilationUnitVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTNamespaceDeclaration node, Object data)
   {
     ASTNamespaceDeclarationVisitor visitor = new ASTNamespaceDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTUseDeclaration node, Object data)
   {
     ASTUseDeclarationVisitor visitor = new ASTUseDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTTypeDeclaration node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTClassDeclaration node, Object data)
   {
     ASTClassDeclarationVisitor visitor = new ASTClassDeclarationVisitor(node, data);
     visitor.before();
     defaultVisit(node, data);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTUnmodifiedClassDeclaration node, Object data)
   {
     ASTUnmodeifiedClassDeclarationVisitor visitor = new ASTUnmodeifiedClassDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTClassBody node, Object data)
   {
     ASTClassBodyVisitor visitor = new ASTClassBodyVisitor(node, data);
     visitor.before();
     defaultVisit(node, data);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTNestedClassDeclaration node, Object data)
   {
     ASTNestedClassDeclarationVisitor visitor = new ASTNestedClassDeclarationVisitor(node, data);
     visitor.before();
     defaultVisit(node, data);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTClassBodyDeclaration node, Object data)
   {
     ASTClassBodyDeclarationVisitor visitor = new ASTClassBodyDeclarationVisitor(node, data);
     visitor.before();
     defaultVisit(node, data);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTMethodDeclarationLookahead node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTInterfaceDeclaration node, Object data)
   {
     ASTInterfaceDeclarationVisitor visitor = new ASTInterfaceDeclarationVisitor(node, data);
     visitor.before();
     defaultVisit(node, data);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTNestedInterfaceDeclaration node, Object data)
   {
     ASTNestedInterfaceDeclarationVisitor visitor = new ASTNestedInterfaceDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTUnmodifiedInterfaceDeclaration node, Object data)
   {
     ASTUnmodifiedInterfaceDeclarationVisitor visitor = new ASTUnmodifiedInterfaceDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTInterfaceMemberDeclaration node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTFieldDeclaration node, Object data)
   {
     ASTFieldDeclarationVisitor visitor = new ASTFieldDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTVariableDeclarator node, Object data)
   {
     ASTVariableDeclaratorVisitor visitor = new ASTVariableDeclaratorVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTVariableDeclaratorId node, Object data)
   {
     ASTVariableDeclaratorIdVisitor visitor = new ASTVariableDeclaratorIdVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTVariableInitializer node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTArrayInitializer node, Object data)
   {
     ASTArrayInitializerVisitor visitor = new ASTArrayInitializerVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTMethodDeclaration node, Object data)
   {
     ASTMethodDeclarationVisitor visitor = new ASTMethodDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTMethodDeclarator node, Object data)
   {
     ASTMethodDeclaratorVisitor visitor = new ASTMethodDeclaratorVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTFormalParameters node, Object data)
   {
     ASTFormalParametersVisitor visitor = new ASTFormalParametersVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTFormalParameter node, Object data)
   {
     ASTFormalParameterVisitor visitor = new ASTFormalParameterVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTConstructorDeclaration node, Object data)
   {
     ASTContructorDeclarationVisitor visitor = new ASTContructorDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTExplicitConstructorInvocation node, Object data)
   {
     ASTExplicitConstructorInvocationVisitor visitor = new ASTExplicitConstructorInvocationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTInitializer node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTType node, Object data)
   {
     ASTTypeVisitor visitor = new ASTTypeVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTPrimitiveType node, Object data)
   {
     ASTPrimitiveTypeVisitor visitor = new ASTPrimitiveTypeVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTResultType node, Object data)
   {
     ASTResultTypeVisitor visitor = new ASTResultTypeVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTName node, Object data)
   {
     ASTNameVisitor visitor = new ASTNameVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTNameList node, Object data)
   {
     ASTNameListVisitor visitor = new ASTNameListVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTExpression node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTAssignmentOperator node, Object data)
   {
     ASTAssignmentOperatorVisitor visitor = new ASTAssignmentOperatorVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTConditionalExpression node, Object data)
   {
     ASTConditionalExpressionVisitor visitor = new ASTConditionalExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTConditionalOrExpression node, Object data)
   {
     ASTConditionalOrExpressionVisitor visitor = new ASTConditionalOrExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTConditionalAndExpression node, Object data)
   {
     ASTConditionalAndExpressionVisitor visitor = new ASTConditionalAndExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTInclusiveOrExpression node, Object data)
   {
     ASTInclusiveOrExpressionVisitor visitor = new ASTInclusiveOrExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTExclusiveOrExpression node, Object data)
   {
     ASTExclusiveOrExpressionVisitor visitor = new ASTExclusiveOrExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTAndExpression node, Object data)
   {
     ASTAndExpressionVisitor visitor = new ASTAndExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTEqualityExpression node, Object data)
   {
     ASTEqualityExpressionVisitor visitor = new ASTEqualityExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTInstanceOfExpression node, Object data)
   {
     ASTInstanceOfExpressionVisitor visitor = new ASTInstanceOfExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTRelationalExpression node, Object data)
   {
     ASTRelationalExpressionVisitor visitor = new ASTRelationalExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTShiftExpression node, Object data)
   {
     ASTShiftExpressionVisitor visitor = new ASTShiftExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTAdditiveExpression node, Object data)
   {
     ASTAdditiveExpressionVisitor visitor = new ASTAdditiveExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTMultiplicativeExpression node, Object data)
   {
     ASTMultiplicativeExpressionVisitor visitor = new ASTMultiplicativeExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTUnaryExpression node, Object data)
   {
     ASTUnaryExpressionVisitor visitor = new ASTUnaryExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTPreIncrementExpression node, Object data)
   {
     ASTPreIncrementExpressionVisitor visitor = new ASTPreIncrementExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTPreDecrementExpression node, Object data)
   {
     ASTPreDecrementExpressionVisitor visitor = new ASTPreDecrementExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTUnaryExpressionNotPlusMinus node, Object data)
   {
     ASTUnaryExpressionNotPlusMinusVisitor visitor = new ASTUnaryExpressionNotPlusMinusVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTCastLookahead node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTPostfixExpression node, Object data)
   {
     ASTPostfixExpressionVisitor visitor = new ASTPostfixExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTCastExpression node, Object data)
   {
     ASTCastExpressionVisitor visitor = new ASTCastExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTPrimaryExpression node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTPrimaryPrefix node, Object data)
   {
     ASTPrimaryPrefixVisitor visitor = new ASTPrimaryPrefixVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTPrimarySuffix node, Object data)
   {
     ASTPrimarySuffixVisitor visitor = new ASTPrimarySuffixVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTLiteral node, Object data)
   {
     ASTLiteralVisitor visitor = new ASTLiteralVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTBooleanLiteral node, Object data)
   {
     ASTBooleanLiteralVisitor visitor = new ASTBooleanLiteralVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTNullLiteral node, Object data)
   {
     ASTNullLiteralVisitor visitor = new ASTNullLiteralVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTArguments node, Object data)
   {
     ASTArgumentsVisitor visitor = new ASTArgumentsVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTArgumentList node, Object data)
   {
     ASTArgumentListVisitor visitor = new ASTArgumentListVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTAllocationExpression node, Object data)
   {
     ASTAllocationExpressionVisitor visitor = new ASTAllocationExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTArrayDimsAndInits node, Object data)
   {
     ASTArrayDimsAndInitsVisitor visitor = new ASTArrayDimsAndInitsVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTStatement node, Object data)
   {
     ASTStatementVisitor visitor = new ASTStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTLabeledStatement node, Object data)
   {
     ASTLabeledStatementVisitor visitor = new ASTLabeledStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTBlock node, Object data)
   {
     ASTBlockVisitor visitor = new ASTBlockVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTBlockStatement node, Object data)
   {
     ASTBlockStatementVisitor visitor = new ASTBlockStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTLocalVariableDeclaration node, Object data)
   {
     ASTLocalVariableDeclarationVisitor visitor = new ASTLocalVariableDeclarationVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTEmptyStatement node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTStatementExpression node, Object data)
   {
     ASTStatementExpressionVisitor visitor = new ASTStatementExpressionVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTSwitchStatement node, Object data)
   {
     ASTSwitchStatementVisitor visitor = new ASTSwitchStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTSwitchLabel node, Object data)
   {
     ASTSwitchLabelVisitor visitor = new ASTSwitchLabelVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTIfStatement node, Object data)
   {
     ASTIfStatementVisitor visitor = new ASTIfStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTWhileStatement node, Object data)
   {
     ASTWhileStatementVisitor visitor = new ASTWhileStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTDoStatement node, Object data)
   {
     ASTDoStatementVisitor visitor = new ASTDoStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTForStatement node, Object data)
   {
     ASTForStatementVisitor visitor = new ASTForStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTForInit node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTStatementExpressionList node, Object data)
   {
     ASTStatementExpressionListVisitor visitor = new ASTStatementExpressionListVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTForUpdate node, Object data)
   {
     return defaultVisit(node, data);
   }
   
   public Object visit(ASTBreakStatement node, Object data)
   {
     ASTBreakStatementVisitor visitor = new ASTBreakStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTContinueStatement node, Object data)
   {
     ASTContinueStatementVisitor visitor = new ASTContinueStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTReturnStatement node, Object data)
   {
     ASTReturnStatementVisitor visitor = new ASTReturnStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTThrowStatement node, Object data)
   {
     ASTThrowStatementVisitor visitor = new ASTThrowStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
   
   public Object visit(ASTTryStatement node, Object data)
   {
     ASTTryStatementVisitor visitor = new ASTTryStatementVisitor(node, data);
     visitor.before();
     visitor.visitChildren(this);
     visitor.after();
     return data;
   }
 }




