package common;

public class Principal {
	
	public static void main(String[] args) {
		
		Motor mo1 = new Motor("123456789A", "GASOLINA", "1.2L");
		
		Interiores inter1 = new Interiores("CAFE", "SALA DE PIEL", "TABLERO RIGIDO");
		
		Transmicion trans1 = new Transmicion("AUTOMATICA", "HIDRAULICA", "5V + REVERSA");
		
		Frenos frenoFrente = new Frenos("DISCO", "VENTILADOS", "ROJO");
		Frenos frenoTrase = new Frenos("TAMBOR", "BALATAS", "ROJO");
		
		Frenos [] frenosft = {frenoFrente, frenoTrase};
		
		Auto a1 = new Auto("WV12345666", "NISSAN", "ROJO", mo1, inter1, trans1, frenosft);
		System.out.println(a1);
		
		
		
		
		
	}

}
