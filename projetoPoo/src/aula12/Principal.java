package aula12;

public class Principal {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1");
		v[1] = new Video("Aula 2");
		v[2] = new Video("Aula 3");
		
		Usuario u[] = new Usuario[2];
		
		u[0] = new Usuario("Jubileu", 22, "M", "jubi@gmail.com");
		u[1] = new Usuario("Creuza", 13, "F", "creuza123@gmail.com");
		
		Visualizacao vis[] = new Visualizacao[3];
		
		vis[0] = new Visualizacao(u[0], v[0]);
		vis[0].avaliar();
		vis[1] = new Visualizacao(u[0], v[1]);
		vis[0].avaliar(87.0f);
		vis[2] = new Visualizacao(u[1], v[2]);
		
		
//		System.out.println(v[0].toString());
//		System.out.println(u[0].toString());
//		System.out.println(vis[0].toString());
//		System.out.println(vis[1].toString());
//		System.out.println(vis[2].toString());
		
		
	}
}
