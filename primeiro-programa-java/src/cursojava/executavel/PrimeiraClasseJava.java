package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Vari�vel Global � acessivel a todos e o seu valor � compartilhado*/
	
	static int maiorIdadeGlobal = 30;

	/*Main � um metodo auto executavel em JAVA*/
	public static void main(String[] args) {
		
		/*Escreve texto no console*/
		/*System.out.println("Meu primeiro programa em JAVA! - Curso Forma��o Java Web");
		System.out.println("Java � orientado a objetos!");*/
		
		/*O valor padr�o sempre ser� Zero*/
		/*int numero;		
		int numero2 = 0;
		System.out.println(numero2);*/
		/*boolean logica;
		boolean logica2;
		int numero;
		int numero2;
		short numero4;*/
		/*
		int maiorIdade = 18;
	 	int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		String cpf = "227.830.678-20";
		System.out.println("Maior idade � = " + maiorIdade);
		System.out.println("Idoso a idade � = " + idosoIdade);
		System.out.println("Jovem a idade � = " + jovemIdade);
		System.out.println("Crian�a a idade � = " + criancaIdade);
	*/
		
		/*Vari�vel Local, pois, pertence somente a este m�todo e o valor fica dentro do metodo*/
		int maiorIdade = 18;
		System.out.println("Valor da vari�vel loca = " + maiorIdade);
		
		metodo2();
	}
	
	public static void metodo2() {
		int mediaAno = 50;
		System.out.println("Valor da vari�vel Global = " + maiorIdadeGlobal); 
		
	}
}
