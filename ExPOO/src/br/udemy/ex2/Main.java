package br.udemy.ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.setName(teclado.nextLine());
		System.out.print("Gross Salary: ");
		employee.setGrossSalary(teclado.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(teclado.nextDouble());

		System.out.println("Employee: " + employee.getName() + ", $ " + String.format(("%.2f"), employee.NetSalary()));
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		employee.IncreaseSalary(teclado.nextDouble());
		System.out.println("");
		System.out.println(
				"Updated Data: " + employee.getName() + ", $ " + String.format(("%.2f"), employee.NetSalary()));
		
		teclado.close();
	}

}
