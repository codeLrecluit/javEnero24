package common;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Herencia
		 * Encapsulamiento
		 * Abstraccion
		 * Polimorfismo
		 * 
		 * */
		
		Microondas m = new Microondas();
		System.out.println("Microondas: " + m);
		
		Microondas micro = new Microondas("Negro", 1300.5, false);
		System.out.println("Microondas con parametros: " +  micro);
		
		m.setFunciona(true);
		m.setPrecio(5000.0);
		m.setColor("Azul");
		
		System.out.println("Funcionamiento: " + m.isFunciona());
		
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
	}

}
