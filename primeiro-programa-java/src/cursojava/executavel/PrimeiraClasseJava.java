package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto executavel em JAVA */
	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Fabio";

		if (mediaAluno >= 70 && nome.equals("Raul")) {
			System.out.println("Parab�ns, voc� foi aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Voc� foi reprovado!");
		} else {
			System.out.println("Aluno n�o encontrado!");
		}

	}
}
