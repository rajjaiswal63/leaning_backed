package javaBasics.challenges.Challenge04TheSmartGroceryCart;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String,Integer>productCatalog=new HashMap<>();
        //"Apple" (50), "Milk" (60), "Bread" (40), "Soda" (120).
        productCatalog.put("Apple",50);
        productCatalog.put("Milk",60);
        productCatalog.put("Bread",40);
        productCatalog.put("Soda",120);

//        Add: "Apple", "Milk", "Apple" (Duplicate allowed), and "Soda".
        List<String>shoppingCart = new ArrayList<>();
        shoppingCart.add("Apple");
        shoppingCart.add("Milk");
        shoppingCart.add("Apple");
        shoppingCart.add("Soda");

        System.out.println("Card before filter : " +shoppingCart);

        Set<String>uniqueCategories=new HashSet<>();
        uniqueCategories.add("Fruits");
        uniqueCategories.add("Dairy");
        uniqueCategories.add("Fruits"); // Duplicate, will be ignored
        System.out.println("Unique Categories: " + uniqueCategories);

        // 4. Iterator: Remove items too expensive (> 100)
        Iterator<String> itr= shoppingCart.iterator();
        while(itr.hasNext()){
            String item=itr.next();
            int price= productCatalog.get(item);
            if(price>100) {
                System.out.println("Removing " + item + " (Too expensive!)");
                itr.remove();
            }
        }
        System.out.println("Final Cart: " + shoppingCart);
    }
}
