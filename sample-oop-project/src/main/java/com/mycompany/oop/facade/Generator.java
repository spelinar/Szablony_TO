package com.mycompany.oop.facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4
 */
public class Generator {

  public static int generate(Node expression) throws Exception {
    if (expression instanceof ExpressionNode) {
      ExpressionNode expressionNode = (ExpressionNode) expression;

      OperandNode rightOperandNode = (OperandNode) expressionNode.getRight();
      OperandNode leftOperandNode = (OperandNode) expressionNode.getLeft();

      int result = rightOperandNode.getValue() + leftOperandNode.getValue();

      return result;

    } else {
      throw new Exception("Error in generator");
    }
  }
    
}
