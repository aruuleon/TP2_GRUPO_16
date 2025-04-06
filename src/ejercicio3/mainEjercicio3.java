package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {
	public static void main(String[] args) {
		
		
		
		
		//Punto 6.2 de LEO 
		ArrayList<Object> lista = new ArrayList<>();
		
		lista.add();
		lista.add();
		lista.add();
		lista.add();
		lista.add();
		
		Iterator<Object> iterador = lista.iterator();
		while (iterador.hasNext()) {
            Object elemento = iterador.next();
            System.out.println(elemento.toString());
        }
	}
}
