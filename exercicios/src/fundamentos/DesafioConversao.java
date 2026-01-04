package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Primeiro Salário: ");
		String primeiroSalario = teclado.nextLine();
		
		System.out.print("Segundo Salário: ");
		String segundoSalario = teclado.nextLine();
		
		System.out.print("Teceiro Salário: ");
		String teceiroSalario = teclado.nextLine();
		
		System.out.println("A média desses valores é:" +
				(Double.parseDouble(primeiroSalario) +
				 Double.parseDouble(segundoSalario) +
				 Double.parseDouble(teceiroSalario)) / 3); 	
	}
}
