package com.driver;

public class Main {

    public static class Product{
     public int product( int x, int y){
        int pro = x*y;
        return pro;
     }
        public int product( int x, int y,int z){
            int pro = x*y*z;
            return pro;
        }

        public double product( double x, double y){
            double pro = x*y;
            return pro;
        }
    }

    public static void main(String[] args){

        Product p = new Product();
        p.product(10,5);
        p.product(10,5,2);
        p.product(5.02,3.01);
    }
}