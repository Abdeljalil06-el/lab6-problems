package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<Item>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            item=new Item(itemName, itemPrice, quantity);
            cart.add(item);

// *** create a new item and add it to the cart
            // *** print the contents of the cart object using println
            double total=0;
            for (int i=0; i<cart.size();i++){
                Item curr=cart.get(i);
                System.out.println(curr);
                total+=curr.getQuantity()*curr.getPrice();
            }
            System.out.println("Total : " + total);

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
