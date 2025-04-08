package ejercicio2;

public class Producto {

	private String fechaCaducidad;
	private int numeroLote;
	
	public Producto() {
		this.fechaCaducidad = "";
		this.numeroLote = 0;
	}
	public Producto(String fechaCaducidad, int numeroLote) {
		setFechaCaducidad(fechaCaducidad);
		setNumeroLote(numeroLote);
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	public String toString() {
		return "Fecha de caducidad: " + fechaCaducidad + ", número de lote: " + numeroLote;
	}
}
