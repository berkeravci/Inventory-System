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
public class cullinary extends Product implements Interface.FindShortageStatusInterface{

    private String material;
    private String shape;
    private String size;
    private String color;
    private static int numOfCullinaryProducts = 0;

    public cullinary(String material, String shape, String size, String color, int numOfProducts, String nameOfProduct, double price, String company) {
        super(numOfProducts, nameOfProduct, price, company);
        this.material = material;
        this.shape = shape;
        this.size = size;
        this.color = color;
        numOfCullinaryProducts += numOfProducts;
    }

    public static int getNumOfCullinaryProducts() {
        return numOfCullinaryProducts;
    }

    public static void setNumOfCullinaryProducts(int numOfCullinaryProducts) {
        cullinary.numOfCullinaryProducts = numOfCullinaryProducts;
    }

    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double calculatePrice(){
        double price = this.numOfProducts*this.price;
        return price;
    }
    
     public void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the material: ");
        material = sc.nextLine();
        System.out.print("Enter the shape: ");
        shape = sc.nextLine();
        System.out.print("Enter the size: ");
        size = sc.nextLine();
        System.out.print("Enter the color: ");
        color = sc.nextLine();
    }

    @Override
    public String toString() {
        super.toString();
        return "cullinary{" + "material=" + material + ", shape=" + shape + ", size=" + size + ", color=" + color + '}';
    }

    @Override
    public String displayShortageStatus() {
        if(numOfCullinaryProducts < 100)
            return "There is a shortage of cullinary Products!";
        return "There is enough number of cullinary products available!";
    }
};


