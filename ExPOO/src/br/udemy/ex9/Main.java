package br.udemy.ex9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String dateString = sc.next();
		Date dateBirth = sdf.parse(dateString);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String statusString = sc.next();
		OrderStatus status = OrderStatus.valueOf(statusString);

		Order order = new Order(new Date(), status, new Client(name, email, dateBirth));

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			order.addItem(new OrderItem(quantity, new Product(productName, productPrice)));
		}

		System.out.println("");
		System.out.println(order);

		sc.close();
	}
}
