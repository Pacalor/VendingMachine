/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

/**
 *
 * @author dpadilla
 */
public class CokeMachine extends Machine{

    public CokeMachine() {
        super();
    }

    @Override
    public void startProducts() {
        addProduct(new Product(2.2f, "Coke",10));
        addProduct(new Product(0.89f, "Pepsi",5));
        addProduct(new Product(1.0f, "Fanta", 1));
        addProduct(new Product(8.0f, "Agua",0));
        addProduct(new Product(53f, "CokeWater",3));     
        addProduct(new Product(10f, "SuperCoke",3));     
        addProduct(new Product(3f, "RonCoke",3));     
    }
    
    
    
}
