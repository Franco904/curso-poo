package aula09;

public class Bolsista extends Aluno {

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + getNome());
	}
	
	@Override
	public void pagarMensalidade() { // Pagar mensalidade � diferente para aluno comum e para bolsista!!
		System.out.println(getNome() + " � bolsista! Pagamento facilitado!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return "Bolsista [bolsa=" + bolsa + "]";
	}
}
