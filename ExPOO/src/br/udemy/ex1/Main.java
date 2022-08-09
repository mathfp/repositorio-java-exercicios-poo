package br.udemy.ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Enter retangle width and height:");
		rectangle.setWidth(teclado.nextDouble());
		rectangle.setHeight(teclado.nextDouble());
		System.out.println("AREA = " + rectangle.Area());
		System.out.println("PERIMETER = " + rectangle.Perimeter());
		System.out.println("DIAGONAL = " + rectangle.Diagonal());
		
		teclado.close();
	}
}
