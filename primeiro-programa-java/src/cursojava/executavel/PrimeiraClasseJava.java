package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto executavel em JAVA */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/*Condi��es L�gicas com IF e ELSE*/
		/*if (media >= 70) {
			System.out.println("Aluno Aprovado! M�dia: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em Recupera��o! M�dia: " + media);
		} else {
			System.out.println("Aluno Reprovado! M�dia: " + media);
		}*/
		
		/* Operadores Tern�rios s�o para micro valida��es*/
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado!" : (media >= 40 && media <= 69) ? "Aluno em Recupera��o!" : "Aluno Reprovado!";
		
		System.out.println(saidaResultado);

	}
}
