package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//Java não analisa valores e sim tipos!
		
		double a = 1;
		System.out.println(a);//Implícita
			  
		float b = (float) 1.0;//Explícito (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //Explícita (CAST)
		System.out.println(d);
		
		double e = 1; //Implícita
		int f = (int) e; //Explícita (CAST)
		System.out.println(f);
	}
}
