package SUPERMARKET;

import java.util.Scanner;

public class SuperMarket {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of items bought: ");
	        int n = sc.nextInt();

	        String[] itemName = new String[n];
	        int[] quantity = new int[n];
	        double[] price = new double[n];
	        double[] subtotal = new double[n];

	        double total = 0;

	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nItem " + (i + 1) + ":");

	            System.out.print("Enter item name: ");
	            itemName[i] = sc.next();

	            System.out.print("Enter price per unit: ");
	            price[i] = sc.nextDouble();

	            System.out.print("Enter quantity: ");
	            quantity[i] = sc.nextInt();

	            subtotal[i] = price[i] * quantity[i];
	            total += subtotal[i];
	        }

	        //  DISPLAY DISCOUNT
	        double discount = 0;
	        if (total > 50000) {
	            discount = total * 0.05;
	        }
	        double finalAmount = total - discount;

	        //  PRINT RECEIPT
	        System.out.println("\n--- Receipt ---");
	        System.out.println("Item  Qty  Price  Subtotal");
	        for (int i = 0; i < n; i++) {
	            System.out.println(itemName[i] + "  " + quantity[i] + "  " + price[i] + "  " + subtotal[i]);
	        }
	        System.out.println("-----------------------------");
	        System.out.println("Grand Total: " + total);
	        System.out.println("Discount: " + discount);
	        System.out.println("Final Amount: " + finalAmount);

	        sc.close();
	    }
	}
	