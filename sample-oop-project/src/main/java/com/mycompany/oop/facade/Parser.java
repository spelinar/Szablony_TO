/*Roman Spelina
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.facade;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author 4
 */
public class Parser {

  private Stack<String> expressionStack = new Stack<String>();
  private Stack<String> operandStack = new Stack<String>();

  public Node parse(List<String> tokens) {

    for (String token : tokens) {
      if (isTokenExpression(token)) {
        expressionStack.push(token);
      } else if (isTokenOperand(token)) {
        operandStack.push(token);
      }
    }

    ExpressionNode expressionNode = new ExpressionNode();

    while (!expressionStack.empty()) {

      String expression = (String) expressionStack.pop();
      expressionNode.setOperator(expression.charAt(0));

      String rightOperand = (String) operandStack.pop();
      OperandNode rightOperandNode = new OperandNode();
      rightOperandNode.setValue(Integer.parseInt(rightOperand));

      String leftOperand = (String) operandStack.pop();
      OperandNode leftOperandNode = new OperandNode();
      leftOperandNode.setValue(Integer.parseInt(leftOperand));

      expressionNode.setRight(rightOperandNode);
      expressionNode.setLeft(leftOperandNode);

    }

    return expressionNode;
  }

  private boolean isTokenExpression(String token) {

    if (token.equals("+")) {
      return true;
    }
    return false;
  }
  private boolean isTokenOperand(String token) {
    for (char c : token.toCharArray()) {
      if (!Character.isDigit(c))
        return false;
    }
    return true;
  }
    
}
