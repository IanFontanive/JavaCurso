package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String g = "Good Lord";
		g = g.replace("Lord", "Night");
		g = g.toUpperCase();
		g = g.concat("!!!");
				
		System.out.println(g);
	}
}
