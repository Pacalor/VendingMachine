/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dpadilla
 */
public class UserInterface {
    private Scanner keyboard;

    public UserInterface() {
        keyboard=new Scanner(System.in);
    }
    
    public int menu(ArrayList<Product> products){
        int option=-90;
        System.out.println("Choose a product:");
        
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+"->"+products.get(i));
        }
        System.out.println("-1 ->Exit");
        
        try {
            option=Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please introduce a correct number");
        }
        
        
        return option;
    }

    public void getMoney(float cost) {
        float money=0;
        float paid=0;
        ArrayList<Float> coins=new ArrayList<>();      
        
        while(paid<cost){
            System.out.println("You still need to pay: " +(cost-paid));
            System.out.println("Please insert coins ");
            try {
                money=keyboard.nextFloat();
                paid+=money;
            } catch (InputMismatchException e) {
                money=0;
                System.out.println("Please introduce a correct value");              
            }     
        }
        
        if(paid != cost){
            System.out.println("Your change is: " + (paid-cost));
        }

        

        
        
    }
    
    
    
}
