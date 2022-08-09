package br.udemy.ex15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int codigo = sc.nextInt();
			set.add(new Student(codigo));
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			int codigo = sc.nextInt();
			set.add(new Student(codigo));
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			int codigo = sc.nextInt();
			set.add(new Student(codigo));
		}
		
		System.out.println("Total Students: " + set.size());
		
		sc.close();
	}

}
