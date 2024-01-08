package common;

public class Smartphone extends Celular {
	
	//ATRIBUTO EXTRA (COMPOSICION)
	
	SistemaOperativo so;
	
	public Smartphone() {
		
	}

	public Smartphone(String modelo, String marca, double mAh, double tamaño, Pantalla pantalla, Camara[] cam,
			SistemaOperativo so) {
		super(modelo, marca, mAh, tamaño, pantalla, cam);
		this.so = so;
	}

	public SistemaOperativo getSo() {
		return so;
	}

	public void setSo(SistemaOperativo so) {
		this.so = so;
	}

	@Override
	public String toString() {
		return "Smartphone [so=" + so + "]";
	}
	
	@Override
	public void reproducirMusica() {
		System.out.println("ABRIR SPOTIFY, TIDAL, DEEZER");
	}
	

}
