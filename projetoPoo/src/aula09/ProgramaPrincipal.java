package aula09;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Visitante v1 = new Visitante();
		
		v1.setNome("Franco");	
		v1.setIdade(16);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Cl�udio");
		a1.setMatricula(11111);
		a1.setCurso("Inform�tica");
		a1.setIdade(21);
		a1.setSexo("M");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
	}
}
