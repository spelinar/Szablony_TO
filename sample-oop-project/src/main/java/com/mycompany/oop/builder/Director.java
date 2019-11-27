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
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }
  public void construct() {
    builder.createProduct().buildPart1("part1").buildPart2("part2");
  }
}
