/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.iterator;

/**
 *
 * @author 4
 */
public interface Iterator {

  Object first();

  Object next();

  boolean isDone();

  Object currentItem();
}
