package br.udemy.ex6;

public class Estudante {
	private String nome;
	private String email;
	private int nroQuarto;
	
	public Estudante(String nome, String email, int nroQuarto) {
		this.nome = nome;
		this.email = email;
		this.nroQuarto = nroQuarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNroQuarto() {
		return nroQuarto;
	}

	public void setNroQuarto(int nroQuarto) {
		this.nroQuarto = nroQuarto;
	}
}
