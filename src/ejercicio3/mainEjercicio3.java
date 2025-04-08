package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class mainEjercicio3 {
	public static void main(String[] args) {	
		
		//Punto 6.2 de LEO 
		
		ArrayList<Object> lista = new ArrayList<Object>();
		
		lista.add(new Polideportivo("Def1", 50, 1));
		lista.add(new Polideportivo("Def2", 150, 1));
		lista.add(new Polideportivo("Cai", 375, 1));
		lista.add(new EdificioOficina(7, 200));
		lista.add(new EdificioOficina(23, 500));
		
		ListIterator<Object> iterador = lista.listIterator();
		while (iterador.hasNext()) {
            Object elemento = iterador.next();
            System.out.println(elemento.toString());
        }
	}
}
