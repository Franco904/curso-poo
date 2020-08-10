package aula07;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Franco", 16, "M");
		p[1] = new Pessoa("Sandra", 53, "F");
		
		l[0] = new Livro("Anjos e Demônios", "Dan Brown", 474, p[0]);
		l[1] = new Livro("Do Mil Ao Milhão", "Thiago Nigro", 221, p[1]);
		l[2] = new Livro("Código Da Vinci", "Dan Brown", 423, p[0]);
		
		l[0].abrir();
		l[0].folhear(36);
		
		System.out.println("Detalhes >>> " + l[0].detalhes());
		
 	}
}
