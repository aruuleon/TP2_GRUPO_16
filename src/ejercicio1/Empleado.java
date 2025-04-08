package ejercicio1;

public class Empleado {

	//Attributes
	private final int ID; // ID Constante
	private String nombre;
	private int edad;
	private static int cont = 1000; 
	

	public Empleado() {
		this.ID = cont++;
		this.nombre = "";
		this.edad = 21;
	}
	public Empleado(String nombre,int edad) {
		this.ID = cont++;
		setNombre(nombre);
		setEdad(edad);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int getId() {
		return ID;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.isEmpty() ? "sin nombre" : nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad < 0 ? 21 : edad;
	}
	
	
	
    public static int devuelveProximoID() {
        return cont;
    }	
  
    
    
	public String toString() { 
		return "nombre: " + nombre + ", edad: " + edad + ", legajo: " + ID;
	}
	
	
	
}

