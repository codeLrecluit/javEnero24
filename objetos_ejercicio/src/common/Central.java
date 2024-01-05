package common;

public class Central {
	
	private String ciudadDestino;
	
	Camion camion;

	public Central() {
		
	}

	public Central(String ciudadDestino, Camion camion) {
		this.ciudadDestino = ciudadDestino;
		this.camion = camion;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Camion getCamion() {
		return camion;
	}

	public void setCamion(Camion camion) {
		this.camion = camion;
	}

	@Override
	public String toString() {
		return "Central [ciudadDestino=" + ciudadDestino + ", camion=" + camion + "]";
	}
	
}
