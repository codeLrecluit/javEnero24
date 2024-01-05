package common;

public class Principal {
	public static void main (String[] args) {
		//pilares de la poo
		/*
		 * herencia
		 * encapsulamiento
		 * polimorfismo
		 * abstraccion:ermite sintetizar 
		 * */
		//instancias u objetos de la clase

		Pantalla pa1= new Pantalla();
		System.out.println(pa1);
		Pantalla pa2= new Pantalla(32.5,"sony",250.8,"1000","LED");
		System.out.println(pa2);
		
		pa1.setMarca("samsung");
		pa1.setPrecio(8782.2);
		pa1.setResolucion("2k");
		pa1.setTamaño(42.8);
		pa1.setTipoPanel("IS");
		System.out.println(pa2.getPrecio());
		
		SmartTv stv1= new SmartTv();
		SmartTv stv2= new SmartTv(55.6,"samsung",2999,"4k","oled","tizen");
		
	}
}
