package aula06;

public class Lutador {

	// Atributos
	private String nome, nacionalidade, categoria;
	private double altura, peso;
	private int idade, vitorias, derrotas, empates;

	//Construtor
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		
	}
	
	// Métodos principais
	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Altura: " + getAltura() + " m");
		System.out.println("Pesando: " + getPeso() + " kg");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates() + "\n");
		
	}
	public void status() {
		System.out.println(getNome() + " é um peso " + getCategoria());
		System.out.println(getVitorias() + " vitórias");		
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates \n");

	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}
	
	// Getters e Setters
	public String getNome() {
		return nome;
		
	}
	public void setNome(String no) {
		this.nome = no;
	
	}
	public String getNacionalidade() {
		return nacionalidade;
		
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
		
	}
	public int getIdade() {
		return idade;
		
	}
	public void setIdade(int id) {
		this.idade = id;
		
	}
	public double getAltura() {
		return altura;
		
	}
	public void setAltura(double al) {
		this.altura = al;
		
	}
	public double getPeso() {
		return peso;
		
	}
	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
		
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if (peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if (peso <= 70.3) {
			this.categoria = "Leve";
		}
		else if (peso <= 83.9) {
			this.categoria = "Médio";
		}
		else if (peso <= 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inválido";
		}		
	}
	public int getVitorias() {
		return vitorias;
		
	}
	public void setVitorias(int vi) {
		this.vitorias = vi;
		
	}
	public int getDerrotas() {
		return derrotas;
		
	}
	public void setDerrotas(int de) {
		this.derrotas = de;
		
	}
	public int getEmpates() {
		return empates;
		
	}
	public void setEmpates(int em) {
		this.empates = em;
		
	}
}
