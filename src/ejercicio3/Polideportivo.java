package ejercicio3;

public class Polideportivo implements IInstalacionDeportiva {
	
	private String nombre;
    private double superficie;
    private int tipoDeInstalacion;
    
    public Polideportivo() {
        setNombre("sin nombre");
        setSuperficie(0);
        setTipoDeInstalacion(0);
    }
    
    public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
    	setNombre(nombre);
        setSuperficie(superficie);
        setTipoDeInstalacion(tipoDeInstalacion);
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
    
    public void setTipoDeInstalacion(int tipoDeInstalacion) {
	   this.tipoDeInstalacion = tipoDeInstalacion;
   }

	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}
}
