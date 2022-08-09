package br.udemy.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("");
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			lista.add(new Employee(id, name, salary));
		}

		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase : ");
		int idIncrease = sc.nextInt();

		boolean haveId = false;

		for (Employee emp : lista) {
			int i = 0;
			i++;
			if (emp.getId() == idIncrease) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				lista.get(i).increaseSalary(percentage);
				System.out.println("");
				haveId = true;
			}
		}

		if (haveId == false) {
			System.out.println("This id does not exist!");
		}

		System.out.println("");
		System.out.println("List of employees:");

		for (Employee em : lista) {
			System.out.println(em);
		}

		sc.close();
	}
}
