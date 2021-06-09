package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class ProgramProject {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);

		System.out.print("Product data: ");
		System.out.println(product.toString());

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data " + product);

		System.out.println();
		System.out.print("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data " + product);
		
		sc.close();

	}

}
