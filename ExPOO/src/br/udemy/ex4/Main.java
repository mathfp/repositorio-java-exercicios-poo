package br.udemy.ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.setDolarPrice(sc.nextDouble());
		System.out.print("How many dollars will be bought? ");
		double valueDollar = sc.nextDouble();
		System.out.println("Amount to be paid in reais = "+ String.format("%.2f", CurrencyConverter.converter(valueDollar)));
		
		sc.close();
	}

}
