/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author dpadilla
 */
public class UserInterface {

    private Scanner keyboard;

    public UserInterface() {
        keyboard = new Scanner(System.in);
    }

    public int menu(ArrayList<Product> products) {

        int option = -90;
        System.out.println("Choose a product:");

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + "->" + products.get(i));
        }
        System.out.println("-1 ->Exit");

        try {
            option = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please introduce a correct number");
        }

        return option;
    }

    public boolean getMoney(Product product) {
        float money = 0;
        boolean buy = false;
        boolean exit = false;
        float paid = 0;
        float cost = product.getPrice();
        float roundOff=0;
        ArrayList<Float> coins = new ArrayList<>();

        while (paid < cost && !exit) {
            roundOff= round(cost-paid);
            System.out.println("You still need to pay: " + roundOff);
            System.out.println("Please insert coins or choose -1 to get your money back");
            try {
                money = Float.parseFloat(keyboard.nextLine());

                if (money == (-1f)) {
                    exit = true;
                } else if (askMoney(money)) {
                    paid += money;
                    coins.add(money);
                } else {
                    System.out.println("Coin unknow");
                }
                
            } catch (NumberFormatException e) {
                money = 0;
                System.out.println("Please introduce a correct value");
            }

        }

        if (paid >= cost) {
            roundOff= Math.round((paid - cost)*100)/100;
            System.out.println("Your change is: " + roundOff);
            buy = true;
            try {
                product.substract();
            } catch (Exception ex) {
                Logger.getLogger(UserInterface.class.getName()).info("Not enough products");
                returnMoney(coins);
                buy = false;
            }
        } else {
            returnMoney(coins);
        }

        return buy;
    }

    private void returnMoney(ArrayList<Float> coins) {
        System.out.println("Returning coins.");
        for (Float coin : coins) {
            System.out.print(coin + ",");
        }
        System.out.println("");
    }

    public boolean askMoney(float value) {
        boolean correctCoin = false;
        Money[] myCoins = Money.values();
        for (Money m : myCoins) {
            if (m.isEqual(value)) {
                correctCoin = true;
            }
        }

        return correctCoin;
    }
    
    private float round(float toRound){
        float rounded;
        int cut=(int) (toRound*100);
        rounded=(float)cut/100f;
        return rounded;
    }

}
