/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author 4
 */
public class BuilderTest {

  @Test
  public void testBuilder() {

    // creates object of type ConcreteBuilder
    ConcreteBuilder builder = new ConcreteBuilder();
    // creates object of type Director
    Director director = new Director(builder);
    // Director constructs a Product
    director.construct();
    // get Product from builder
    Product product = builder.getResult();

    assertEquals(product.getPart1(), "part1");
    assertEquals(product.getPart2(), "part2");
  }
}
