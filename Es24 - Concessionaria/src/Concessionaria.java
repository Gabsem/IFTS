import java.util.ArrayList;

public class Concessionaria {
	private ArrayList <Auto> macchine;

	public Concessionaria() {
		macchine = new ArrayList<Auto>();
		
		macchine.add(new Auto("fiat", "panda",1000));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
		macchine.add(new Auto("audi", "a1", 1200));
	}

	public ArrayList<Auto> getMacchine() {
		return macchine;
	}

	public void setMacchine(ArrayList<Auto> macchine) {
		this.macchine = macchine;
	}

	@Override
	public String toString() {
		return "Concessionaria [macchine=" + macchine + "]";
	}
	
}

