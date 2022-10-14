/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.curso.vendingmachine;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dpadilla
 */
public class MachineTest {
    
    public MachineTest() {
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

    /**
     * Test of run method, of class Machine.
     */
    @Test
    public void testProductsList() {
        //where
        Machine machine=new Machine();
        ArrayList<Product> products;
        //do
        machine.startProducts();
        products=machine.getProducts();
        
        //then
        assertEquals(products.size(), 5);
        assertEquals(products.get(0).getName(),"Plumbus" );
        
    }
    
}
