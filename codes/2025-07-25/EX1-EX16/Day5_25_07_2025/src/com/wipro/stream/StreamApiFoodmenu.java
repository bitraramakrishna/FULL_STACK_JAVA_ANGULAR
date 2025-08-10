package com.wipro.stream;

import java.util.ArrayList;
import java.util.Comparator; 
import java.util.List;

import java.util.stream.Collectors;

class FoodItem {
    private String foodName;
    private String foodType; 
    private String cuisine; 
    private double price;

    public FoodItem(String foodName, String foodType, String cuisine, double price) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.cuisine = cuisine;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }
    public String getFoodType() {
        return foodType;
    }
    public String getCuisine() {
        return cuisine;
    }
    public double getPrice() {
        return price;
    }
   public String toString() {
        return "FoodItem Name=" + foodName + ", Type=" + foodType + ", Cuisine=" + cuisine + ", Price=" + price + "]";
    }
}


public class StreamApiFoodmenu {
	
	 public static void main(String[] args) {
	      
	        List<FoodItem> menu = new ArrayList<>();
	        menu.add(new FoodItem("chapthi Rolls", "Veg", "Chinese", 200));
	        menu.add(new FoodItem("chinese Chicken ", "Non Veg", "Chinese", 400)); 
	        menu.add(new FoodItem("Biryani", "Non Veg", "india", 250));
		   
	        List<FoodItem> chineseFoods = menu.stream()
                .filter(item -> item.getCuisine().equalsIgnoreCase("Chinese"))
	            .collect(Collectors.toList()); 

	        chineseFoods.forEach(System.out::println);
	        
                FoodItem maxPriceChineseFood = chineseFoods.stream()
                                                          .max(Comparator.comparing(FoodItem::getPrice))
                                                          .get(); 
                System.out.println(maxPriceChineseFood);
            
	    }
}