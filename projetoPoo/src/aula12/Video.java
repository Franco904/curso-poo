package aula12;

public class Video implements AcoesVideo {

	private String titulo;
	private int avaliacao;
	private int visualizacoes;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		
		this.titulo = titulo;
		this.avaliacao = 1;
		this.visualizacoes = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(int avaliacao) {	
		int nova = (this.getAvaliacao() + avaliacao) / this.getVisualizacoes(); 
		
		this.avaliacao = avaliacao;
	}
	
	public int getVisualizacoes() {
		return visualizacoes;
	}
	
	public void setVisualizacoes(int vizualizacoes) {
		this.visualizacoes = vizualizacoes;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		System.out.println("Vídeo reproduzindo");
		this.setReproduzindo(true);
		
	}

	@Override
	public void pause() {
		System.out.println("Vídeo pausado");
		this.setReproduzindo(false);
	}

	@Override
	public void curtir() {
		System.out.println("Curtida adicionada");
		this.setCurtidas(this.getCurtidas() + 1);
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", visualizacoes=" + visualizacoes
				+ ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	
	
}
