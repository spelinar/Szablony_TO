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
public class HulkFactoryTest {
    
    public HulkFactoryTest() {
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
        HulkFactory instance = new HulkFactory();
        Weapon expResult = null;
        Weapon result = instance.getWeapon();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSuperPower() {
        System.out.println("getSuperPower");
        HulkFactory instance = new HulkFactory();
        SuperPower expResult = null;
        SuperPower result = instance.getSuperPower();
        assertEquals(expResult, result);
    }
    
}
