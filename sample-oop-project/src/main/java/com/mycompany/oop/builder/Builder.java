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
 abstract class Builder {
   public abstract Builder createProduct();

  public abstract Builder buildPart1(String part);

  public abstract Builder buildPart2(String part);
}
