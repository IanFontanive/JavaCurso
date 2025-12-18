package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//Não pula linha
		System.out.print("Combos de ryze");
		System.out.print("de ryze\n");
		
		//Pula linha após exibir a string
		System.out.println("Combos ");
		System.out.println("de ryze\n\n");
		
		System.out.printf("Horas: %.1f" , 1234.5678);
		
		var r = "Q";
		var y = "E";
		var z = "W";
		var e = "auto";
		
		System.out.printf("\nCombão de Ryze: %s + %s + %s + %s +"
				+ " %s + %s + %s + %s + %s + %s + %s + %s + %s %n" 
				, r, e, y, e, r, e, z, e, r, e, y, e, r);
		
		// tipo, variavel 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nick: ");
		String nick = entrada.nextLine();
		
		System.out.print("Digite o seu capeão: ");
		String campeao = entrada.nextLine();
		
		System.out.print("Digte seus anos de jogo: ");
		int anos = entrada.nextInt();
		
		System.out.printf("%s de %s, com %d anos de jogo!",
				nick, campeao, anos);
		
		entrada.close(); 
	}
}
