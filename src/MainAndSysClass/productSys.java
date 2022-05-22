/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAndSysClass;


import java.util.ArrayList;
import Is_A.*;
/**
 *
 * @author berker
 */
public class productSys {
    private static ArrayList<Product> arr = new ArrayList();
        
        public static boolean isProductExists(String name){
            int count = arr.size();
            for (int i = 0; i < count; i++) {
               if(arr.get(i).getNameOfProduct().equalsIgnoreCase(name))
                   return true;
           }
            return false;
        }
        
        public static boolean addCullinary(int numOfProducts, String name, double price, String company, String material, String shape, String size, String color){
            boolean bool = isProductExists(name);
            if(!bool){
                cullinary c = new cullinary(material, shape, size , color, numOfProducts, name, price, company);
                arr.add(c);
                return true;
            }
            return false;
            }
        
        
        public static boolean addEdibles(int numOfProducts, String name, double price, String company, String type, String expiry, double cal, String state){
            boolean bool = isProductExists(name);
            if(!bool){
                edibles e = new edibles(type, expiry, state , cal, numOfProducts, name, price, company);
                arr.add(e);
                return true;
            }
            return false;
            }
        
        public static boolean addToiletries(int numOfProducts, String name, double price, String company, String gender, String expiry, String state){
            boolean bool = isProductExists(name);
            if(!bool){
                toiletries t = new toiletries(gender, expiry, state, numOfProducts, name, price, company);
                arr.add(t);
                return true;
            }
            return false;
            }
        
        public static boolean addClothes(int numOfProducts, String name, double price, String company, String type, String gender, String size, String fabric){
            boolean bool = isProductExists(name);
            if(!bool){
                clothes c = new clothes(type, gender, size , fabric, numOfProducts, name, price, company);
                arr.add(c);
                return true;
            }
            return false;
            }
        
        
        public static boolean removeProduct(String name){
            int count = arr.size();
            for (int i = 0; i < count; i++) {
               if(arr.get(i).getNameOfProduct().equalsIgnoreCase(name)){
                   arr.remove(i);
                   return true;
               }   
           }
           return false;
        }
        
        public static String display(){
           String str = "";
           int count = arr.size();
            for (int i = 0; i < count; i++) {
                   str+= arr.get(i).toString();
        }
        return str;    
        }
        
        public static double calculateTotalPrice(){
            int count = arr.size();
            double price = 0;
            for (int i = 0; i < count; i++) {
               price += arr.get(i).calculatePrice();
        }
            return price;
        }     
        
        
        public static Product searchProduct(String name){
            int count = arr.size();
            Product p = null;
            for (int i = 0; i < count; i++) {
               if(arr.get(i).getNameOfProduct().equalsIgnoreCase(name)){
                   p = arr.get(i);
               return p;
               }
           }
            return null;
        }
        
        public static String addWholeSaler(String name, String address, String productName){
            Product p = null;
            p = searchProduct(productName);
            if(p!=null){
                p.addWholeSaler(name, address);
                return "Whole Saler Added";
            }
            else{
                return "Whole Saler could not be added";
            }
        }
    
}
