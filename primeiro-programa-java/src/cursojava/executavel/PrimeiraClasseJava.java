package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Variável Global é acessivel a todos e o seu valor é compartilhado*/
	
	static int maiorIdadeGlobal = 30;

	/*Main é um metodo auto executavel em JAVA*/
	public static void main(String[] args) {
		
		/*Escreve texto no console*/
		/*System.out.println("Meu primeiro programa em JAVA! - Curso Formação Java Web");
		System.out.println("Java é orientado a objetos!");*/
		
		/*O valor padrão sempre será Zero*/
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
		System.out.println("Maior idade é = " + maiorIdade);
		System.out.println("Idoso a idade é = " + idosoIdade);
		System.out.println("Jovem a idade é = " + jovemIdade);
		System.out.println("Criança a idade é = " + criancaIdade);
	*/
		
		/*Variável Local, pois, pertence somente a este método e o valor fica dentro do metodo*/
		int maiorIdade = 18;
		System.out.println("Valor da variável loca = " + maiorIdade);
		
		metodo2();
	}
	
	public static void metodo2() {
		int mediaAno = 50;
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal); 
		
	}
}
