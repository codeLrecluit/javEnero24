package common;

public class Principal {
	
	public static void main(String[] args) {
		
		//Crear instancias u objetos de una clase
		
		Pantalla pa1 = new Pantalla();
		System.out.println(pa1);
		
		Pantalla pa2 = new Pantalla(32.5, "Sony", 2550.80, "1080 HD", "LED");
		System.out.println(pa2);
		
//		pa1.setMarca("Samsung");
//		pa1.setPrecio(7343.60);
//		pa1.setResolucion("2K");
//		pa1.setTamaño(42.8);
//		pa1.setTipoPanel("IPS");
//		
		System.out.println(pa2.getTamaño());
		
		SmartTv stv1 = new SmartTv();
		
		SmartTv stv2 = new SmartTv(55.6, "LG", 3578.99, "4K", "LED", "ROKU TV");

		Camara cam1 = new Camara();
		Camara cam2 = new Camara();
		Camara cam3 = new Camara();
		
		Camara [] camaras = {cam1, cam2, cam3};
		
		Celular c1 = new Celular("s23 Ultra", "Samsung", 5000.00, 6.8, pa2, camaras);
		System.out.println(c1);
		
		SistemaOperativo so = new SistemaOperativo("Android", "Android", "Version 11");
		Smartphone sm1 = new Smartphone("NOTE 9", "SAMSUNG", 1200.00, 4.0, pa2, camaras, so);
		
		sm1.reproducirMusica();
		sm1.hacerLlamadas("4567777882");
	}
	

}
