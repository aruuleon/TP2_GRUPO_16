package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {
	
	public mainEjercicio1_b() {
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor("Juan Perez", 45, "Catedratico", 20);
		Profesor p2 = new Profesor("Maria Lopez", 38, "Docente de Aula", 10);
		Profesor p3 = new Profesor("Carlos Garcia", 50, "Director", 25);
		Profesor p4 = new Profesor("Ana Ruiz", 32, "Asistente de Profesor", 5);
		Profesor p5 = new Profesor("Luis Martinez", 60, "Catedratico", 35);
		
		listaProfesores.add(p1);
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		Iterator<Profesor> profesores = listaProfesores.iterator();
		while(profesores.hasNext()) {
			Profesor profesor = profesores.next();
        	System.out.println(profesor.toString());
		}
	}
}
