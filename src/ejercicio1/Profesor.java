package ejercicio1;

import java.util.Objects;

public class Profesor extends Empleado implements Comparable<Profesor>{
	
	// propiedades 
    private String cargo; 
	private int antiguedadDocente;
	
	// constructores
	public Profesor() {
		super(); // Llama al constructor de la clase padre (Empleado)
		cargo = " sin cargo";
		antiguedadDocente = 0;
	}
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
        super(nombre, edad); // Llama al constructor de Empleado con nombre y edad
       this.cargo = cargo;
       this.antiguedadDocente = antiguedadDocente;
    }
	
	
	@Override
	public String toString() { 
		return super.toString() + ", cargo: " + cargo + ", antiguedad docente: " + antiguedadDocente;
	}
	
	@Override
	public int compareTo(Profesor o) {
		return 1;
	}
	@Override
	public int hashCode() {
		return Objects.hash(antiguedadDocente, cargo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}
	
}
