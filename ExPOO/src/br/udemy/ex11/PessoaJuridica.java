package br.udemy.ex11;

public class PessoaJuridica extends Pessoa {
	
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String name, Double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		if(numeroFuncionarios > 10) {
			return super.getRendaAnual() * 0.14;
		}else {
			return super.getRendaAnual() * 0.16;
 		}
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
}
