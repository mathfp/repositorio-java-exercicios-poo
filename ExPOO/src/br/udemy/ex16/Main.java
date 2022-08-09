package br.udemy.ex16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\mathe\\Downloads\\candidatos.txt";
		String listaCandidatos[] = new String[10]; 
		
		Map<String, Integer> candidato = new TreeMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				listaCandidatos = line.split(",");
				
				if(candidato.containsKey(listaCandidatos[0])) {
					candidato.put(listaCandidatos[0], candidato.get(listaCandidatos[0])+ Integer.parseInt(listaCandidatos[1]));
				}else {
					candidato.put(listaCandidatos[0], Integer.parseInt(listaCandidatos[1]));
				}
				
				line = br.readLine();
			}
			
			for(String chave : candidato.keySet()) {
				System.out.println(chave + ": " + candidato.get(chave));
			}
			
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
