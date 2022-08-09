package br.udemy.ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudante [] vetorQuartos = new Estudante[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("");
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vetorQuartos[room] = new Estudante(name, email, room);
		}
		
		System.out.println("");
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < 10; i++) {
			if(vetorQuartos[i] != null) {
				System.out.println(vetorQuartos[i].getNroQuarto()+": "+vetorQuartos[i].getNome()+", "+vetorQuartos[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}
