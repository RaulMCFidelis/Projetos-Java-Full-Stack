package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel em JAVA */
	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Fabio";

		if (mediaAluno >= 70 && nome.equals("Raul")) {
			System.out.println("Parabéns, você foi aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Você foi reprovado!");
		} else {
			System.out.println("Aluno não encontrado!");
		}

	}
}
