package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
 		
 		ArrayList<Profesor> profesores = new ArrayList<>();
         
         profesores.add(new Profesor("Juan Pérez", 45, "Catedrático", 20));
         profesores.add(new Profesor("María López", 38, "Docente de Aula", 10));
         profesores.add(new Profesor("Carlos García", 50, "Director", 25));
         profesores.add(new Profesor("Ana Ruiz", 32, "Asistente de Profesor", 5));
         profesores.add(new Profesor("Luis Martínez", 60, "Catedrático", 35));
         
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
