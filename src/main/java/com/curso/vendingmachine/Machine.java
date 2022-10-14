/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                case (-1) -> exit=true;
                default -> {
                    if(option<products.size() && option>=0){
                        buyProduct(option);
                    }else{
                        System.out.println("Please insert a valid option");
                    }
                }
            }
            
        }
    }
    
    public void startProducts(){
        addProduct(new Product(2.2f, "Plumbus",10));
        addProduct(new Product(0.89f, "Wumpas",5));
        addProduct(new Product(1.0f, "Fanta", 1));
        addProduct(new Product(8.0f, "Agua",0));
        addProduct(new Product(53f, "Ron",3));
    }

    private void buyProduct(int option) {
        Product cost=products.get(option);
        
        if(ui.getMoney(cost))
            System.out.println("Product buy, enjoy your product");
   
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public void addProduct(Product p){
        products.add(p);
    }
    
    
    
}
