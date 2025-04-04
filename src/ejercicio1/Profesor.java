package ejercicio1;

public class Profesor  extends Empleado{
	
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
}
