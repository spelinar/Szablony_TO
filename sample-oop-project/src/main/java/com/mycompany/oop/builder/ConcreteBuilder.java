/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder;

/**
 *
 * @author 4
 */
public class ConcreteBuilder extends Builder {
  private Product product;
  public Builder createProduct() {
    this.product = new Product();
    return this;
  }
  public Builder buildPart1(String part) {
    product.setPart1(part);
    return this;
  }
  public Builder buildPart2(String part) {
    product.setPart2(part);
    return this;
  }
  public Product getResult() {
    return product;
  }
}
