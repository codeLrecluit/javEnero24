package common;

public class Principal {
	
	public static void main(String[] args) {
		
		//Crear instancias u objetos de una clase		
		Pantalla pa1 = new Pantalla();		
		System.out.println(pa1);
				
		Pantalla pa2 = new Pantalla(32.5, "Sony", 2550.80, "1080", "LED");
		System.out.println(pa2);
		
//		pa1.setMarca("Samsung");
//		pa1.setPrecio(7343.60);
//		pa1.setResolucion("2K");
//		pa1.setTamaño(42.8);
//		pa1.setTipoPanel("IPS");
//		
		System.out.println(pa2.getTamaño());
		
		SmartTv stv1 = new SmartTv();		
		SmartTv stv2 = new SmartTv(55.6, "SAMSUNG", 20000.00, "4k", "OLED", "Tizen");
		
		
		
	}

}
