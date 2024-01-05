package common;

public class Motor {
	
	
//--ATRIBUTOS--
	String noSerie;
	String combustible;
	String tamaño;

//--CONSTRUCTOR VACIO--
	public Motor() {
		
	}

//--CONSTRUCTORES--
	public Motor(String noSerie, String combustible, String tamaño) {
		super();
		this.noSerie = noSerie;
		this.combustible = combustible;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	//----STRINGS--
	@Override
	public String toString() {
		return "Motor [noSerie=" + noSerie + ", combustible=" + combustible + ", tamaño=" + tamaño + "]";
	}
	
	
}
