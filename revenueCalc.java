import java.util.*;

public class revenueCalc {
    public static void main(String[] args) {
        int price, quantity, revenue;
    int discount=0;

    Scanner console = new Scanner(System.in);
    System.out.println("Enter the price of the product: ");
    price = console.nextInt();

    System.out.println("Enter the quantity of the product: ");
    quantity = console.nextInt();

    revenue = price * quantity;

    if(revenue>5000){
        discount = revenue *10/100;
        revenue = revenue-discount;
    }

    System.out.println("The discount is: "+discount);
    System.out.println("The revenue is: "+revenue);
    
    }
    
}
