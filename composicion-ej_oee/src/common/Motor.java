package common;

public class Motor {
	
	
//--ATRIBUTOS--
	String noSerie;
	String combustible;
	String tama�o;

//--CONSTRUCTOR VACIO--
	public Motor() {
		
	}

//--CONSTRUCTORES--
	public Motor(String noSerie, String combustible, String tama�o) {
		super();
		this.noSerie = noSerie;
		this.combustible = combustible;
		this.tama�o = tama�o;
	}
	
//--GETTERS Y SETTERS--
	public String getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	//----STRINGS--
	@Override
	public String toString() {
		return "Motor [noSerie=" + noSerie + ", combustible=" + combustible + ", tama�o=" + tama�o + "]";
	}
	
	
}
