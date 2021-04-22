package onlineFoodShopping;

import java.util.*;

public class Basket {
    private HashMap<Product,Integer> basket;
    private Inventory store;
    private ArrayList<Product> basketKey;
    private double cost;

    public Basket(Inventory store) {
        basket = new HashMap<Product,Integer>();
        this.store = store;
    }

    public void add(int num){
        Product check = store.getProduct(num-1);
        boolean checkbool = store.remove(check);
        if (checkbool == true){
            if (basket.containsKey(check)){
                basket.put(check,basket.get(check)+1);
            }
            else {
                basket.put(check,1);
            }
            cost =cost + check.getPrice();
        }
    }

    public void remove(int num){
        if (num > store.getArrListSize() || num <= 0){
            System.out.println("wrong input\n\n");
        }
        else {
            Product check = store.getProduct(num-1);
            if (basket.get(check) > 0){
                basket.put(check, basket.get(check) - 1);
                store.add(check);
                if (basket.get(check) == 0){
                    basket.remove(check);
                }
            }
        }
    }

    public void cart(){
        int i =1;
        basketKey = new ArrayList<Product>(basket.keySet());
        System.out.println("Itemsincart:\n");
        for (Product product:basketKey){
            System.out.println(i + ")" + product.toString() + "number:" + basket.get(product));
            i++;
        }
    }
    @Override
    public String toString(){
        System.out.println(basket);
        return "null";
    }
}
