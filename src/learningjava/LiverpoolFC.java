package learningjava;

public class LiverpoolFC {

	public LiverpoolFC() { // Non Parameterized
		this(4);
	}

	public LiverpoolFC(int a) { // Parameterized
		this("Liverpool Football Club");
		System.out.println("Player Number : " + a);
	}

	public LiverpoolFC(String str) { // Parameterized
		this("Virgil van", " Dijk");
		System.out.println("Club Name : " + str);
	}

	LiverpoolFC(String s, String t) { // Parameterized
		System.out.println("Player Name : " + s + t);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		LiverpoolFC LFC = new LiverpoolFC();
	}
}