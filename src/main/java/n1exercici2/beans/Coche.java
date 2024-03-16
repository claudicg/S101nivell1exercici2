package n1exercici2.beans;

public class Coche {
	private static final String MARCA = "Seat";
	private static String modelo = "";
	private final int POTENCIA = 1000;
	
	
	
	public Coche() {
		super();	
	}
	
	public Coche(String modelo) {
		super();
		Coche.modelo = modelo;
	}

	
	public static String getModelo() {
		return modelo;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}
	
	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
	

	
	public void acelerar() {
		
		System.out.println("El vehículo está acelerando");
	}
	
	public static void frenar() {
		
		System.out.println("El vehículo está frenando");	
	}
	

	@Override
	public String toString() {
		return "Coche [POTENCIA=" + POTENCIA + "]";
	}
	
}
