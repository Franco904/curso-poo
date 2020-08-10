package aula10;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero();
		
		m1.setCorPelo("Marrom");
		m1.setPeso(5.70f);
		m1.setIdade(8);
		m1.setMembros(4);
		m1.locomover();
		m1.alimentar();
		m1.emitirSom();
		
		Canguru c1 = new Canguru();
		
		c1.setPeso(55.38f);
		c1.setIdade(3);
		c1.setMembros(4);
		c1.locomover();
		c1.alimentar();
		c1.emitirSom();
		c1.usarBolsa();
		
		Cachorro k1 = new Cachorro();
		
		k1.setPeso(3.94f);
		k1.setIdade(5);
		k1.setMembros(4);
		k1.locomover();
		k1.alimentar();
		k1.emitirSom();
		k1.abanarRabo();
	}
}
