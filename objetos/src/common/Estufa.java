package common;

public class Estufa extends Microondas {
	
	private String mechas = "";

	public Estufa(String color, double precio, boolean funciona, String mechas) {
		super(color, precio, funciona);
		this.mechas = mechas;
	}
	
	
}
