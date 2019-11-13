/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.factorymethod;

/**
 *
 * @author 4
 */
public class DecodedImage {
    private String image;
 
    public DecodedImage(String image) {
        this.image = image;
    }
 
    @Override
    public String toString() {
        return image + ": is decoded";
    }
    
}
