package java.Project01_Market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {

	public static List <String> products = new ArrayList<>();  // Global
	public static List <Double> prices = new ArrayList<>();

	public static List <String> basket_products = new ArrayList<>();
	public static List <Double> basketKG = new ArrayList<>();
	public static List <Double> basketprices = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		products.addAll(Arrays.asList("Tomato","Potato","Pepper","Onion","Carrot",
				"Apple","Cherry","Strawberry","Melon","Grape","Lemon"));

		prices.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));
		String continu ;
		double totalPrice = 0.0;

		do {
			urunListele();
			System.out.println("Select your product by number:");
			int productNo = scan.nextInt();
			System.out.println("Enter weight:");
			double kg = scan.nextDouble();
			addToBasket(productNo, kg);
			totalPrice = Math.round(PrintToCar());
			System.out.println("Would you like to continue shopping:");
			continu = scan.next();
		}while(continu.equalsIgnoreCase("e"));
		payment(totalPrice);
	}

	public static void urunListele() {
		System.out.println("No\t Products \tPrices");
		System.out.println("===\t ======== \t========");

		for (int i = 0; i< products.size(); i++) {
			System.out.println(" "+ i + "\t" + products.get(i) + "\t\t" + prices.get(i));
		}
	}

	public static void addToBasket(int urunNo, double kg) {
		basket_products.add(products.get(urunNo));
		basketKG.add(kg);
		basketprices.add(prices.get(urunNo) * kg);
	}

	public static double PrintToCar() {

		double priceTotal = 0.0;
		double KGTotal = 0.0;

		System.out.println("Product Name \tKG \t\tPrice");
		System.out.println("=================================");
		for(int i = 0; i < basket_products.size() ; i++ ) {
			System.out.println(basket_products.get(i) + "\t \t" + basketKG.get(i) + "\t\t" + basketprices.get(i));
			priceTotal +=  basketprices.get(i);
			KGTotal += basketKG.get(i);
		}
		System.out.println("=================================");
		System.out.println("\tTOTAL:" + KGTotal + "\t\t" + priceTotal);
		return priceTotal;
	}

	public static void payment(double totalPrice){
		Scanner scan  = new Scanner(System.in);

		System.out.println("***********************************");
		System.out.println("************* PAYMENT ***************");
		System.out.println("TOTAL PRICE TO BE PAID:" + totalPrice);

		double cash = 0.0;
		do {
			System.out.print("Please Enter Cash:");
			cash += scan.nextDouble();
			if(cash < totalPrice) {
				System.out.println("The Number entered is insufficient.");
				System.out.println((totalPrice - cash) + "You need to deposit more TL.");
			}
		}while(cash < totalPrice);

		double change = cash - totalPrice;
		if (change > 0) {
			System.out.println("ChANGE" + change);
		}
		System.out.println("we are waiting for you again");
	}
}
