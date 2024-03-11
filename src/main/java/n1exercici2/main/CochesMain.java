package n1exercici2.main;

import n1exercici2.beans.Coche;

public class CochesMain {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Ibiza");
		
		//Valor esperado. 
		//Accede de forma estática, pero no a través de instancia coche1.
		System.out.println(Coche.getMarca());
		
		//Valor esperado. Modificado por el parámetro del constructor.
		//Al ser estático se comparte una única posición de memoria para el valor del modelo.
		//Accede a través de instancia coche1 aunque debería acceder de forma estática con Coche.getModelo()
		System.out.println(coche1.getModelo());
		
		Coche.setModelo("Leon");
		
		//Valor esperado. Modificado por el método setModelo().
		//Al ser estático se comparte una única posición de memoria para el valor del modelo.
		//Accede de forma estática, pero no a través de instancia coche1.
		System.out.println(Coche.getModelo());
		
		Coche coche2 = new Coche();
		
		//Al crear la instancia coche2 podríamos pensar que el valor de modelo debería
		//ser vacío.
		//Al compartir una única posición de memoria, devuelve el valor seteado anteriormente.
		//Accede a través de instancia coche2 aunque debería acceder de forma estática con Coche.getModelo()
		System.out.println(coche2.getModelo());
		
		//Valor esperado.
		System.out.println(coche1.getPOTENCIA());
		
		Coche coche3 = new Coche();
		
		//Mensaje esperado. Acceso a través de la instancia coche3.
		coche3.acelerar();
		
		//Mensaje esperado. Acceso estático.
		Coche.frenar();
		
	}

}
