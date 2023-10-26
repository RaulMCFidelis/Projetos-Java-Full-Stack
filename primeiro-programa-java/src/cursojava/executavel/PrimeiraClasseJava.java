package cursojava.executavel;

public class PrimeiraClasseJava {
	

	/*Main é um método auto executavel em JAVA*/
	public static void main(String[] args) {
		
		/*Concatenação = Unir ou juntar dados*/
		String nome = "Raul Maximiliano";
		String cpf = "364.231.418-00";
		String telefone = "(11) 910105262";
		String endereco = "São Paulo - SP";
		int idade = 28;
		
		String saida = "Meu nome é " + nome + "com o CPF: " + cpf + "meu contato é: " + telefone + "e moro em: " + endereco
				+ " e tenho: " + idade + " anos";
		
		System.out.println(saida);
		
	}
}
