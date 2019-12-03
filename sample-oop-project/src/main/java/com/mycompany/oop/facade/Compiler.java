/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.facade;
import java.util.List;
/**
 *
 * @author 4
 */
public class Compiler {

  public static int compile(String input) throws Exception {

    Parser parser = new Parser();
    List<String> tokens = Tokenizer.tokenize(input);
    Node expression = parser.parse(tokens);
    int result = Generator.generate(expression);

    return result;
  }
    
}
