package aula06;

import java.util.Random;

public class Luta {

	private Lutador desafiado; // instância de Lutador
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1 != l2 && l1.getCategoria() == l2.getCategoria()) {
			aprovada = true;
			desafiado = l1;
			desafiante = l2;
		}
		else {
			aprovada = false;
			desafiado = null;
			desafiante = null;
		}
		
	}
	public void lutar() {
		if (this.aprovada) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3); // Número randômico: 0, 1 ou 2
			
			switch (vencedor) {
			case 0: // Empate
				System.out.println("Resultado: " + "Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			
			case 1: // Desafiado ganhou
				System.out.println("Resultado: " + this.desafiado.getNome() + " ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: // Desafiante ganhou
				System.out.println("Resultado: " + this.desafiante.getNome() + " ganhou!");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
				
			default:
				break;
			}
		}
		else {
			System.out.println("A luta não pode acontecer!");
		}
		
	}

	public Lutador getDesafiado() {
		return desafiado;
		
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
		
	}

	public Lutador getDesafiante() {
		return desafiante;
		
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
		
	}

	public int getRounds() {
		return rounds;
		
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
		
	}

	public boolean getAprovada() {
		return aprovada;
		
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
		
	}
}
