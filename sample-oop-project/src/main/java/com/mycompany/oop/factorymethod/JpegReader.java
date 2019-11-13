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
public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;
 
    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }
 
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
    
