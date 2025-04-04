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
        setCargo(cargo);
        setAntiguedadDocente(antiguedadDocente);
    }
	
	  //  LOS SETTS Y LOS GETTS 
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
}
