/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

import java.util.ArrayList;

/**
 *
 * @author dpadilla
 */
public class Machine {
    private UserInterface ui;
    private ArrayList<Product> products;

    public Machine() {
        ui= new UserInterface();
        products=new ArrayList<>();
    }
    
    public void run(){
        boolean exit=false;
        int option;
        startProducts();
                
        while (!exit) {            
            
            option=ui.menu(products);
            
            switch (option) {
                case (-1):
                    exit=true;
                    break;
                default:
                    if(option<products.size() && option>=0){
                        buyProduct(option);
                    }else{
                        System.out.println("Please insert a valid option");
                    }
            }
            
        }
    }
    
    private void startProducts(){
        products.add(new Product(2.2f, "Plumbus"));
        products.add(new Product(0.89f, "Wumpas"));
        products.add(new Product(1.0f, "Fanta"));
        products.add(new Product(8.0f, "Agua"));
        products.add(new Product(53f, "Ron"));
    }

    private void buyProduct(int option) {
        float cost=products.get(option).getPrice();
        
        ui.getMoney(cost);
        
    }
    
    
}
