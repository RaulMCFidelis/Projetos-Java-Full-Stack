package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel em JAVA */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/*Condições Lógicas com IF e ELSE*/
		/*if (media >= 70) {
			System.out.println("Aluno Aprovado! Média: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em Recuperação! Média: " + media);
		} else {
			System.out.println("Aluno Reprovado! Média: " + media);
		}*/
		
		/* Operadores Ternários são para micro validações*/
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado!" : (media >= 40 && media <= 69) ? "Aluno em Recuperação!" : "Aluno Reprovado!";
		
		System.out.println(saidaResultado);

	}
}
