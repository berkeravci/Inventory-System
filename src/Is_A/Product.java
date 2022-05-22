/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Has_A.wholeSaler;
import java.util.ArrayList;

/**
 *
 * @author berker
 */
public abstract class Product {
    protected int numOfProducts;
    protected String nameOfProduct;
    protected double price;
    protected String company;
    protected static ArrayList<wholeSaler> wholeSalers = new ArrayList();

    public Product(int numOfProducts, String nameOfProduct, double price, String company) {
        this.numOfProducts = numOfProducts;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.company = company;
    }
    
    public void addWholeSaler(String name, String address){
        wholeSaler w = new wholeSaler(name, address);
        System.out.println("I am here");
        wholeSalers.add(w);
    }
    
    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    public abstract double calculatePrice();
    
    public abstract void getInput();
//    
public abstract String displayShortageStatus(); //{
//        if(this instanceof edibles)
//            if(edibles.getNumOfEdibleProducts() < 100)
//                return "There is a shortage of Clothing Products!";
//            else return "There is enough number of clothing products available!";
//        else if(this instanceof clothes)
//            if(clothes.getNumOfClothingProducts() < 100)
//                return "There is a shortage of Clothing Products!";
//            else return "There is enough number of clothing products available!";
//        else if(this instanceof toiletries)
//            if(toiletries.getNumOfToiletryProducts() < 100)
//                return "There is a shortage of Clothing Products!";
//            else return "There is enough number of clothing products available!";        
//        else //(this instanceof cullinary)
//            if(cullinary.getNumOfCullinaryProducts() < 100)
//                return "There is a shortage of Clothing Products!";
//            else return "There is enough number of clothing products available!";
//    }

    @Override
    public String toString() {
        return "Product{" + "numOfProducts=" + numOfProducts + ", nameOfProduct=" + nameOfProduct + ", price=" + price + ", company=" + company + '}';
    }
    
}

