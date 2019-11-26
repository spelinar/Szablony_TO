/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.singleton;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4
 */
public class singletonTest {
    

    @Test
    public void testGetInstance() {
        singleton Singleton1 = singleton.getInstance();
        singleton Singleton2 = singleton.getInstance();
        
        assertEquals(Singleton2, Singleton1);
    }
    
}
