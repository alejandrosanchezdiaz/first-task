/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.almacen;

/**
 *
 * @author alesandiphotography
 */
public class Product {

    Integer id;
    String name;
    float price;
    int number;
    String category;

    public Product() {
    }

    public Product(Integer id, String name, float price, int number, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void mostrar() {
        System.out.println("-------------------------");
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Price : " + this.price);
        System.out.println("Number : " + this.number);
        System.out.println("Category : " + this.category);
        System.out.println("-------------------------");
    }
}
