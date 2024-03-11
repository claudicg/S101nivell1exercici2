package n1exercici2.beans;

public class Coche {
	private static final String MARCA = "Seat";
	private static String modelo = "";
	private final int POTENCIA = 1000;
	
	
	//El valor de los atributos con la marca final no es modificable.
	//Por tanto, MARCA y POTENCIA no pueden reasignarse en el constructor.
//	public Coche(String marca, String modelo, int potencia) {
//		super();
//		this.MARCA = marca;
//		Coche.modelo = modelo;
//		this.POTENCIA = potencia;
//	}
	
	public Coche() {
		super();	
	}
	
	//Se puede inicializar modelo porque es el único atributo marcado únicamente como estático.
	//Aunque MARCA también es estático, está marcado como final y no es modificable.
	public Coche(String modelo) {
		super();
		Coche.modelo = modelo;
	}
//----- getters y setters -----------------------------------------
	
	//El valor de los atributos con la marca final no es modificable.
	//Por tanto, MARCA y POTENCIA no admiten métodos setters.
	
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
	
//	public final void setMarca(String marca) {
//		MARCA = marca;
//	}
//	
//	public final void setPOTENCIA(int potencia) {
//		POTENCIA = potencia;
//	}
//-----------------------------------------------------------------
	
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
