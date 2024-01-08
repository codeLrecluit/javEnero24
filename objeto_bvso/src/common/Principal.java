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
		Camara cam1= new Camara();
		Camara cam2= new Camara();
		Camara cam3= new Camara();
		
		Camara[] camaras= {cam1,cam2,cam3};
		Celular c1= new Celular("s23","samsung",5000.0,6.8,pa2,camaras);
		System.out.println(c1);
		
		SistemaOperativo so= new SistemaOperativo("Symbian","nokia","symbian");
		SmartPhone sm1=new SmartPhone("N8","nokia",1200.9, 4.0, pa2, camaras,so);

		sm1.reproducirMusica();
		sm1.hacerLlamadas("5643398");
	}
}
