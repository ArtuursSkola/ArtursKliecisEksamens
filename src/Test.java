
public class Test {
	private Jautajums[] jautajums;
	private int jautIzv;
	private int rez;
	
	public Test(Jautajums[] jautajums) {
		this.jautajums = jautajums;
		this.jautIzv = 0;
		this.rez = 0;
	}
	public Jautajums getjautIzv() {
		return jautajums[jautIzv];
	}
	public void mainitRez() {
		rez++;
	}
	public boolean irnakosaisJaut() {
		return jautIzv < jautajums.length;
	}
	public void nakosaisJaut() {
		jautIzv++;
	}
	public int getJautDaudzums() {
		return jautajums.length;
	}
	public int getRez() {
		return rez;
	}
}
