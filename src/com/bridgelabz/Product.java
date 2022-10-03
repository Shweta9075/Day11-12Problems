package com.bridgelabz;

import java.util.ArrayList;

public class Product {
    private String name;
    private int NumOfShare;
    private double price;

    private ArrayList<Integer> userRatings;


    public Product() {
        name = "";
        NumOfShare = 0;
        price = 0;

        userRatings = new ArrayList<Integer>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumOfShare(int numOfShare) {
        this.NumOfShare = numOfShare;
    }


    public int getNumOfShare() {
        return NumOfShare;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public void addUserRating(int rating) {
        userRatings.add(rating);
    }

    public int getUserRating(int index) {
        return userRatings.get(index);
    }

    public int getUserRatingCount() {
        return userRatings.size();
    }


    public int getAvgUserRating() {
        int sum = 0;
        if(userRatings.size() > 0){
            for (int i = 0; i < userRatings.size(); i++){
                sum += userRatings.get(i);
            }
            return sum / userRatings.size();
        }

        else return 0;
    }
}

