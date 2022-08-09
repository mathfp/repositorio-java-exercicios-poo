package br.udemy.ex5;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holderName  = sc.nextLine();
		
		ContaBancaria conta = null;
		
		System.out.print("Is there an initial deposit (y/n)? ");
		String resposta = sc.next();
		
		if (resposta.equals("y") || resposta.equals("Y")) {
			System.out.print("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			conta = new ContaBancaria(number, holderName, depositValue);
			
			
		} else if (resposta.equals("n") || resposta.equals("N")) {
			conta = new ContaBancaria(number, holderName);
			
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(conta);
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(conta);

		sc.close();
	}

}
