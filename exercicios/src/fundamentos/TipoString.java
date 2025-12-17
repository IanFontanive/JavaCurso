package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		IO.println("Hello There".charAt(10));
		
		//O valor inicial de uma String imutavel,
		//apenas substiuível 
		String a = "Ryze Blue";
		
		IO.print(a.concat(" !!!"));
		
		IO.println(a.startsWith("Ryze"));
		IO.println(a.startsWith("ryze"));
		IO.println(a.endsWith("Blue"));
		IO.println(a.length());
		System.out.println(a.equals("ryze blue"));
		System.out.println(a.equalsIgnoreCase("ryze blue"));
		
		var nome = "Noah";
		var sobrenome = "Baker";
		var idade = 26;
		var salario = 15360.86;
		
		String fichaDeDados = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + 
				"\nSalário: " + salario + "\n\n";
		System.out.println(fichaDeDados);
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		//Outros métodos de println
		
		System.out.println("Frase qualquer".contains("qual"));
		IO.println("Frase qualquer".indexOf("qual"));
		IO.println("Frase qualquer".substring(6));
		IO.println("Frase qualquer".substring(6, 10));
	}
}
