package aula05;

public class Principal {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.play();
		c.ligarMudo(); 
		c.abrirMenu();
		c.fecharMenu();
	
	}
}
