package ejercicio2;

public class ProductosCongelados extends Producto{

	
	private static final String unidadTemperatura = "°C";
	private int temperaturaCongelado;
	
	public ProductosCongelados() {
		super();
		this.temperaturaCongelado = 0;
	}
	public ProductosCongelados(String fechaCaducidad, int numeroLote, int temperaturaCongelado) {
		super(fechaCaducidad, numeroLote);
		setTemperaturaCongelado(temperaturaCongelado);
	}
	
	public int getTemperaturaCongelado() {
		return temperaturaCongelado;
	}
	public void setTemperaturaCongelado(int temperaturaCongelado) {
		if (temperaturaCongelado <= 0 && temperaturaCongelado >= -20)
		    this.temperaturaCongelado = temperaturaCongelado;
		else {
		    System.out.println("Por favor,ingrese una temperatura valida");
		    this.temperaturaCongelado = 0;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " ,temperatura de congelado: " + temperaturaCongelado + unidadTemperatura;
	}
}
