package cursojava.executavel;

public class PrimeiraClasseJava {
	

	/*Main � um m�todo auto executavel em JAVA*/
	public static void main(String[] args) {
		
		/*Concatena��o = Unir ou juntar dados*/
		String nome = "Raul Maximiliano";
		String cpf = "364.231.418-00";
		String telefone = "(11) 910105262";
		String endereco = "S�o Paulo - SP";
		int idade = 28;
		
		String saida = "Meu nome � " + nome + "com o CPF: " + cpf + "meu contato �: " + telefone + "e moro em: " + endereco
				+ " e tenho: " + idade + " anos";
		
		System.out.println(saida);
		
	}
}
