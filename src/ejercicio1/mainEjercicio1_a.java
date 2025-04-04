package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
 		
 		ArrayList<Profesor> profesores = new ArrayList<>();
         
         profesores.add(new Profesor("Juan P�rez", 45, "Catedr�tico", 20));
         profesores.add(new Profesor("Mar�a L�pez", 38, "Docente de Aula", 10));
         profesores.add(new Profesor("Carlos Garc�a", 50, "Director", 25));
         profesores.add(new Profesor("Ana Ruiz", 32, "Asistente de Profesor", 5));
         profesores.add(new Profesor("Luis Mart�nez", 60, "Catedr�tico", 35));
         
         mostrarLista(profesores);
         
 	}
 	
 	public static void mostrarLista(ArrayList<Profesor> profesores) {
 		
         ListIterator <Profesor> profesoresIterator = profesores.listIterator();
 
         while(profesoresIterator.hasNext()) {
         	Profesor profesor = profesoresIterator.next();
         	profesoresIterator.remove();
         	System.out.println(profesor.toString());
         }
         
 	}
}
