package br.udemy.ex13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arrayDados = new String[3];
		List<Produto> listaProdutos = new ArrayList<>();

		// arrayDados = dados.split(",");

		String path = "C:\\Users\\mathe\\Downloads\\SourceFile.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				arrayDados = line.split(",");
				listaProdutos.add(
						new Produto(arrayDados[0], Double.parseDouble(arrayDados[1]), Integer.parseInt(arrayDados[2])));
		
				arrayDados = null;
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\mathe\\Downloads\\out\\summary.csv"))) {
			for(Produto produto : listaProdutos) {
				bw.write(produto.getNome() + "," + String.format("%.2f", produto.calcularPrecoTotal()));
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
