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
public class UserInterfaceTest {
    
    public UserInterfaceTest() {
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
    public void askMoneyTest(){
        //where
        float correctValue=2f;
        float incorrectValue=700f;
        UserInterface ui= new UserInterface();
        
        //do
        
        boolean correct=ui.askMoney(correctValue);
        boolean incorrect=ui.askMoney(incorrectValue);
        
        //then
        assertTrue(correct);
        assertFalse(incorrect);
        
    }
    
}
