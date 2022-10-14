/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

/**
 *
 * @author dpadilla
 */
public class Product {
    private float price;
    private String name;
    private int cantidad;
    
    public Product(float price, String name, int cantidad) {
        this.price = price;
        this.name = name;
        this.cantidad = cantidad;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void substract() throws Exception{
        if(cantidad>0){
            cantidad--;
        }else{
            throw new IndexOutOfBoundsException("There is not product.");  
        }
    }
    
    
    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", name=" + name + '}';
    }
    
    
}
