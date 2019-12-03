/*Roman Spelina
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.facade;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *
 * @author 4
 */
public class Tokenizer {

  public static List<String> tokenize(String source) {

    ArrayList<String> tokens = new ArrayList<String>();

    StringTokenizer stringTokenizer = new StringTokenizer(source);
    while (stringTokenizer.hasMoreElements()) {
      tokens.add((String) stringTokenizer.nextElement());
    }
    return tokens;
  }
    
}
