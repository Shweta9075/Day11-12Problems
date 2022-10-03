package com.bridgelabz;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;

public class StockManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an inventory Stock name: ");
        String name = sc.next();
        ArrayList<Product> products = loadProducts (name);
        displayProducts(products);

    }


    public static ArrayList<Product> loadProducts(String name) {
        ArrayList<Product> products = new ArrayList<Product>();
        String file = name;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Product pr = new Product();
            pr.setName(sc.next());
            pr.setNumOfShare(sc.nextInt());
            pr.setPrice(sc.nextDouble());
            while(sc.nextInt() != -1){
                pr.addUserRating(sc.nextInt());
            }
            products.add(pr);
        }
        sc.close();
        return products;
    }



    public static void displayProducts(ArrayList<Product> products) {
        for(int i = 0; i<products.size(); i++) {
            Product tmpProduct = products.get(i);
            System.out.println(tmpProduct.getName());
            System.out.println(tmpProduct.getNumOfShare());
            System.out.println(tmpProduct.getPrice());
            System.out.println(tmpProduct.getAvgUserRating());
            System.out.println();
        }

    }


}
