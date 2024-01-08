package common;

public class SistemaOperativo {
	
	String nombre;
	String fabricante;
	String version;
	
	public SistemaOperativo() {
		
	}

	public SistemaOperativo(String nombre, String fabricante, String version) {
		super();
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.version = version;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SistemaOperativo [nombre=" + nombre + ", fabricante=" + fabricante + ", version=" + version + "]";
	}

	
	
}
