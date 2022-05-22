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
public class edibles extends Product implements Interface.FindShortageStatusInterface{
    private String type;
    private String ExpiryDate;
    private String state;
    private double calories;
    private static int numOfEdibleProducts = 0;

    public edibles(String type, String ExpiryDate, String state, double calories, int numOfProducts, String nameOfProduct, double price, String company) {
        super(numOfProducts, nameOfProduct, price, company);
        this.type = type;
        this.ExpiryDate = ExpiryDate;
        this.state = state;
        this.calories = calories;
        numOfEdibleProducts += numOfProducts;
    }

    

    public boolean isCooked(){
        if(this.getState() == "cooked")
            return true;
        return false;
    };

    public static int getNumOfEdibleProducts() {
        return numOfEdibleProducts;
    }

    public static void setNumOfEdibleProducts(int numOfEdibleProducts) {
        edibles.numOfEdibleProducts = numOfEdibleProducts;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    public double calculatePrice(){
        double price = this.numOfProducts*this.price;
        return price;
    }
    
    
    
      public void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type: ");
        type = sc.nextLine();
        System.out.print("Enter the expiry date (dd/mm/yyyy): ");
        ExpiryDate = sc.nextLine();
        System.out.print("Enter the state: ");
        state = sc.nextLine();
        System.out.print("Enter the calories: ");
        calories = sc.nextDouble();
        
    }

    @Override
    public String toString() {
        
        return super.toString() + "edibles{" + "type=" + type + ", ExpiryDate=" + ExpiryDate + ", state=" + state + ", calories=" + calories + '}';
    }

    public String displayShortageStatus() {
        if(numOfEdibleProducts < 100)
            return "There is a shortage of edible products!";
        return "There is enough number of edible products available!";
    }
}

