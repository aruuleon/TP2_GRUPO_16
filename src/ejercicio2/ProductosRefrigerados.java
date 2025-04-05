package ejercicio2;

public class ProductosRefrigerados extends Producto{

	 private String codigoSupAlimentaria;
	
	public ProductosRefrigerados() {
		super();
		this.codigoSupAlimentaria = "";
	}
	public ProductosRefrigerados(String fechaCaducidad, String codigoSupAlimentaria, int numeroLote) {
		super(fechaCaducidad, numeroLote);
		setCodigoSupAlimentaria(codigoSupAlimentaria);
	}
	
	public String getCodigoSupAlimentaria() {
		return codigoSupAlimentaria;
	}
	public void setCodigoSupAlimentaria(String codigoSupAlimentaria) {
		this.codigoSupAlimentaria = codigoSupAlimentaria;
	}
	
	public String toString() {
		return super.toString() + ", codigo de supervisión alimentaria: " + codigoSupAlimentaria;
	}
}
