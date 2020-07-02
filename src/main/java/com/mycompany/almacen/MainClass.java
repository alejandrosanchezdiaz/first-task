/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.almacen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesandiphotography
 */
public class MainClass {
    
    public void listarTodosLosProoductos (){
        
    }
    
    public static void main(String[] args) {
        
        // inserción de datos
        List<Product> productList = new ArrayList<>();
        
        Product p1 = new Product();
        p1.setId(001);
        p1.setName("Silla");
        p1.setPrice(10);
        p1.setNumber(6);
        p1.setCategory("Mueble");
        productList.add(p1);
        //p1.mostrar();
        
        Product p2 = new Product(002, "Camara", 100, 20, "Electronica");
        productList.add(p2);
        
        Product p3 = new Product(003, "Reloj", 30, 50, "Accesorio");
        productList.add(p3);
        
        System.out.println("Size " + productList.size());
        
        /*
        L:     0    1    2
              p1   p2   p3
        */
        
        // Mostrar todos los datos
        for(int i=0; i< productList.size(); i++){
            System.out.println("Producto " + i);
            productList.get(i).mostrar();
        }
        
        /*
        1. Listar todos los productos
        2. Hacer una rebaja a un producto concreto segun ID
        3. Añadir más productos (para ello hay que dar todos los datos del nuevo producto)
        4. Añadir más cantidades de productos
        5. Borrar productos
        */
        
        System.out.println("Alex");
        
        }
                
    }
    

