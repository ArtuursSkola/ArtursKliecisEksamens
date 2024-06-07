
import java.util.ArrayList;
import java.util.List;

public class Test {
	private Jautajums[] jautajums;
	private int jautIzv;
	private int rez;
	private List<Jautajums> nepareizasAtb;
	
	public Test(Jautajums[] jautajums) {
		this.jautajums = jautajums;
		this.jautIzv = 0;
		this.rez = 0;
		this.nepareizasAtb = new ArrayList<>();
	}
	public Jautajums getjautIzv() {
		return jautajums[jautIzv];
	}
	public void mainitRez(boolean pareizi) {
		if(pareizi) {
		rez++;
		}else {
			nepareizasAtb.add(jautajums[jautIzv]);
		}
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
	public List<Jautajums> getNepareizasAtb(){
		return nepareizasAtb;
	}
	public void addNepareizasAtb(Jautajums jautajums) {
		nepareizasAtb.add(jautajums);
	}
}
