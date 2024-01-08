package common;

public class Smartphone extends Celular{
	
	//atributo extra (composicion)
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
	
	@Override  //A los metodos sobresscritos, se les agrega override
	public void reproducirMusica() {
		System.out.println("Abrir Spotify, Tidal, Deezer");
	}
	
	
}
