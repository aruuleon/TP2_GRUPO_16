package ejercicio3;

public class Polideportivo {
	
	private String nombre;
    private double superficie;
    
    public Polideportivo() {
        setNombre("sin nombre");
        setSuperficie(0);
    }
    
    public Polideportivo(String nombre, double superficie) {
    	setNombre(nombre);
        setSuperficie(superficie);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public void setSuperficie(double superficie) {
    	this.superficie = superficie;
    }

}
