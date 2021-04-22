package onlineFoodShopping;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        Product Carrot = new Product("Carrot","Vegetables",5,20);
        Carrot.setDate("2020-03-15","2021-03-15");
        inventory.add(Carrot,10);

        Product Apple = new Product("Apple","Fruits",10,50);
        Carrot.setDate("2020-03-15","2021-03-15");
        inventory.add(Apple,50);

        Product Eggsx12 = new Product("Eggsx12","Egg",100,40);
        Carrot.setDate("2020-01-01","2020-06-01");
        inventory.add(Eggsx12,20);

        Product Oats = new Product("Oats","Grains",70,100);
        Carrot.setDate("2020-06-01","2021-01-01");
        inventory.add(Oats,45);

        Product Salmon = new Product("Salmon","Seafood",150,250);
        Carrot.setDate("2020-01-01","2020-02-01");
        inventory.add(Salmon,5);

        Product Stake = new Product("Stake","Meat",800,1000);
        Carrot.setDate("2020-03-01","2020-09-01");
        inventory.add(Stake,5);

        Product Milk = new Product("Milk","Dairy",100,20);
        Carrot.setDate("2020-01-10","2020-01-25");
        inventory.add(Milk,20);

        Product Cheese = new Product("Cheese","Dairy",150,10);
        Carrot.setDate("2020-02-01","2020-03-15");
        inventory.add(Cheese,50);

        inventory.products();
        Basket basket = new Basket(inventory);

        Scanner sc = new Scanner(System.in);
        String input;
        String[] splitString;
        while (true){
            input = sc.nextLine();
            splitString = input.split(" ");
            if (splitString[0].equals("add")){
                String check = splitString[1];
                basket.add(Integer.parseInt(check));
            }
            else if(splitString[0].equals("remove")){
                String check = splitString[1];
                basket.remove(Integer.parseInt(check));
            }
            else if(splitString[0].equals("cart")){
                basket.cart();
            }
            else if (splitString[0].equals("products\n\n")){
                inventory.products();
            }
            else if (splitString[0].equals("checkout")){
                System.out.println("It was a pleasure doing business with you.\n\n");
                break;
            }
            else {
                System.out.println("wrong input!!\n\n");
            }
        }



    }
}
