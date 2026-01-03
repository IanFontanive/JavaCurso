package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		
		double numero1 = Double.parseDouble(valor1);
			
		System.out.println(" A soma é: " +
				(Double.parseDouble(valor2) + numero1));
	}
}
