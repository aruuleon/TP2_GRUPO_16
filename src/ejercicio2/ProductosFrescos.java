package ejercicio2;

public class ProductosFrescos extends Producto{

	private String fechaEnvasado;
	private String paisOrigen;

	
	public ProductosFrescos() {
		super();
		this.fechaEnvasado = "";
		this.paisOrigen = "";
	}
	public ProductosFrescos(String fechaCaducidad, String fechaEnvasado, String paisOrigen, int numeroLote) {
		super(fechaCaducidad, numeroLote);
		setFechaEnvasado(fechaEnvasado);
		setPaisOrigen(paisOrigen);
	}
	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado; 
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", fecha de envasado: " + fechaEnvasado + " ,pais de origen: " + paisOrigen;
	}
}
