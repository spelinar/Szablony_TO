/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4
 */
public class ThorFactoryTest {
    
    public ThorFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetWeapon() {
        System.out.println("getWeapon");
        ThorFactory instance = new ThorFactory();
        Weapon expResult = null;
        Weapon result = instance.getWeapon();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSuperPower() {
        System.out.println("getSuperPower");
        ThorFactory instance = new ThorFactory();
        SuperPower expResult = null;
        SuperPower result = instance.getSuperPower();
        assertEquals(expResult, result);
    }
    
}
