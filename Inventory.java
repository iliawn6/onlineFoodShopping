package onlineFoodShopping;

import java.util.*;

public class Inventory {
    private HashMap<Product,Integer> list;
    private ArrayList<Product> arrListKey;

    public Inventory() {
        list = new HashMap<Product,Integer>();
    }

    public void add(Product product){
        if (list.containsKey(product)){
            list.put(product,list.get(product)+1);
        }
        else {
            list.put(product,1);
        }
    }

    public void add(Product product,int stock){
        if (list.containsKey(product)){
            list.put(product,list.get(product)+stock);
        }
        else {
            list.put(product,stock);
        }
    }

    public boolean remove(Product product){
        if (list.containsKey(product)){
            if (list.get(product) > 0){
                list.put(product,list.get(product)-1);
                return true;
            }
            else {
                System.out.println("this product doesn't exist in store!!\n\n");
                return false;
            }
        }
        else {
            System.out.println("wrong input!!\n\n");
            return false;
        }

    }
    @Override
    public String toString(){
        System.out.println(list);
        return "null";
    }

    public Product getProduct(int index){
        return arrListKey.get(index);
    }

    public int getArrListSize(){
        return arrListKey.size();
    }

    public void products(){
        int i=1;
        arrListKey = new ArrayList<Product>(list.keySet());
        if (arrListKey.size() == 0){
            System.out.println("We are out of stock.");
        }
        else {
            for (Product product: arrListKey){
                System.out.println(i + ")" + product.toString() + "instock:" + list.get(product));
                i = i + 1;
            }
        }
    }
}
