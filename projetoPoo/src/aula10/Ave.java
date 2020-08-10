package aula10;

public class Ave extends Animal {

	private String corPena;
	
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando..");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutinhas..");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave..");
		
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public String toString() {
		return "Ave [corPena=" + corPena + "]";
	}
	
	
}
