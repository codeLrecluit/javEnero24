package common;

public class SistemaOperativo {
	String nombre;
	String fabricantes;
	String version;
	
	public SistemaOperativo() {
		
	}

	public SistemaOperativo(String nombre, String fabricantes, String version) {
		super();
		this.nombre = nombre;
		this.fabricantes = fabricantes;
		this.version = version;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(String fabricantes) {
		this.fabricantes = fabricantes;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SistemaOperativo [nombre=" + nombre + ", fabricantes=" + fabricantes + ", version=" + version + "]";
	}
	

}
