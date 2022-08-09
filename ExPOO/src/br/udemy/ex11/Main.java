package br.udemy.ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double salarioAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double dispesasMedicas = sc.nextDouble();
				lista.add(new PessoaFisica(name, salarioAnual, dispesasMedicas));	
			}else {
				System.out.print("Number of employees: ");
				int numeroEmpregados = sc.nextInt();
				lista.add(new PessoaJuridica(name, salarioAnual, numeroEmpregados));
			}
		}
		
		System.out.println("");
		System.out.println("TAXES PAID:");
		
		Double totalTaxes = 0.0;
		
		for(Pessoa pessoa : lista) {
			System.out.println(pessoa.getName()+": $ "+ String.format("%.2f", pessoa.calcularImposto()));
			totalTaxes += pessoa.calcularImposto();
		}
		
		System.out.println("");
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
