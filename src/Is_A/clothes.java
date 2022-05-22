/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import java.util.Scanner;

/**
 *
 * @author berker
 */
public class clothes extends Product implements Interface.FindShortageStatusInterface{
       
    private String type;
    private String gender;
    private String size;
    private String fabric;
    private static int numOfClothingProducts = 0;

    public clothes(String type, String gender, String size, String fabric, int numOfProducts, String nameOfProduct, double price, String company) {
        super(numOfProducts, nameOfProduct, price, company);
        this.type = type;
        this.gender = gender;
        this.size = size;
        this.fabric = fabric;
        numOfClothingProducts += numOfProducts;
    }

    public static int getNumOfClothingProducts() {
        return numOfClothingProducts;
    }

    public static void setNumOfClothingProducts(int numOfClothingProducts) {
        clothes.numOfClothingProducts = numOfClothingProducts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    public double calculatePrice(){
        double price = this.numOfProducts*this.price;
        return price;
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type: ");
        type = sc.nextLine();
        System.out.print("Enter the gender: ");
        gender = sc.nextLine();
        System.out.print("Enter the size: ");
        size = sc.nextLine();
        System.out.print("Enter the fabric: ");
        fabric = sc.nextLine();
        
    }
        
        
    @Override
    public String toString() {
        return "clothes{" + "type=" + type + ", gender=" + gender + ", size=" + size + ", fabric=" + fabric + '}';
    }

    public String displayShortageStatus() {
        if(numOfClothingProducts < 100)
            return "There is a shortage of Clothing Products!";
        return "There is enough number of clothing products available!";
    }
};

