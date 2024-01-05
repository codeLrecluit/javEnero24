package common;

public class Principal {
	public static void main(String[] args) {
		//Instanciamos los boletos
		Boleto boleto0 = new Boleto(200.00, "Angel Bustamante", "Merida");
		Boleto boleto1 = new Boleto(200.00, "Javier Bustamante", "Merida");
		Boleto boleto2 = new Boleto(200.00, "Jorge Bustamante", "Merida");
		Boleto boleto3 = new Boleto(200.00, "Luis Bustamante", "Merida");
		Boleto boleto4 = new Boleto(200.00, "Maria Bustamante", "Merida");
		
		Boleto[] boletos = {boleto0, boleto1, boleto2, boleto3, boleto4};
		
		//Instanciamos EL camion
		Camion camionMerida = new Camion(40, "Negro", 100000.00, "Mercedes Benz", boletos);
		
		//Instanciamos Central
		Central central = new Central("Merida", camionMerida);
		
		System.out.println("Central de autobuses: " + central);
	}
}
