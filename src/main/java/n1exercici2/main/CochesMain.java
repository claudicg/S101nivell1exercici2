package n1exercici2.main;

import n1exercici2.beans.Coche;

public class CochesMain {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Ibiza");
		
		System.out.println(Coche.getMarca());
		
		System.out.println(coche1.getModelo());
		
		Coche.setModelo("Leon");
		
		System.out.println(Coche.getModelo());
		
		Coche coche2 = new Coche();
		
		System.out.println(coche2.getModelo());
		
		System.out.println(coche1.getPOTENCIA());
		
		Coche coche3 = new Coche();
		
		coche3.acelerar();
		
		Coche.frenar();
		
	}

}
