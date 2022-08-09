package br.udemy.ex11;
public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;

	public PessoaFisica() {
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calcularImposto() {
		
		if(super.getRendaAnual() < 20000) {
			return (super.getRendaAnual() * 0.15) - (gastosSaude * 0.5);
		}else if(super.getRendaAnual() >= 20000) {
			return (super.getRendaAnual() * 0.25) - (gastosSaude * 0.5);
		}
		return 0.0;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
}
