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
public class toiletries extends Product implements Interface.FindShortageStatusInterface{
    
    private String gender;
    private String expiryDate;
    private String state;
    private static int numOfToiletryProducts = 0;

    public toiletries(String gender, String expiryDate, String state, int numOfProducts, String nameOfProduct, double price, String company) {
        super(numOfProducts, nameOfProduct, price, company);
        this.gender = gender;
        this.expiryDate = expiryDate;
        this.state = state;
        numOfToiletryProducts += numOfProducts;
    }

    public static int getNumOfToiletryProducts() {
        return numOfToiletryProducts;
    }

    public static void setNumOfToiletryProducts(int numOfToiletryProducts) {
        toiletries.numOfToiletryProducts = numOfToiletryProducts;
    }

    

    
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public double calculatePrice(){
        double price = this.numOfProducts*this.price;
        return price;
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the gender: ");
        gender = sc.nextLine();
        System.out.print("Enter the expiry date (dd/mm/yyyy): ");
        expiryDate = sc.nextLine();
        System.out.print("Enter the state: ");
        state = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return "toiletries{" + "gender=" + gender + ", expiryDate=" + expiryDate + ", state=" + state + '}';
    }

    public String displayShortageStatus() {
        if(numOfToiletryProducts < 100)
            return "There is a shortage of toiletry products!";
        return "There is enough number of toiletry products available!";
    }
}

