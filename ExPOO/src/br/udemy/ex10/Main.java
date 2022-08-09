package br.udemy.ex10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> lista = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'c') {
				lista.add(new Product(name, price));
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				Date dt = sdf.parse(date);
				lista.add(new UsedProduct(name, price, dt));
			}else {
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, customFee));
			}
		}
		
		System.out.println("");
		System.out.println("PRICE TAGS");
		
		for(Product product : lista) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
	}

}
