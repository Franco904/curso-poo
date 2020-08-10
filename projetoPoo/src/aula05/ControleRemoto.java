package aula05;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		setVolume(50);
		setLigado(true);
		setTocando(false);
	}

	// Getters e Setters
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// M�todos abstratos
	
	@Override
	public void ligar() {
		this.setLigado(true);
	}
	
	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("===== Menu =====");
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		
		for(int i = 0; i < this.getVolume(); i += 10) {
			System.out.println("|");
		}
	}
	
	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu..");
	}
	
	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume() + 5);
		}
		else {
			System.out.println("Imposs�vel diminuir o volume!");
		}
	}
	
	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume() - 5);
		}
		else {
			System.out.println("Imposs�vel diminuir o volume!");
		}
	}
	
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);;
		}
	}
	
	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	
	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		else {
			System.out.println("N�o foi poss�vel reproduzir!");
		}
	}
	
	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		else {
			System.out.println("N�o foi poss�vel pausar!");
		}
	}
}
