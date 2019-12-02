/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opp.Prototype;

/**
 *
 * @author 4
 */
public abstract class Prototype implements Cloneable {
    
    abstract Prototype copyMe() throws CloneNotSupportedException;
}
