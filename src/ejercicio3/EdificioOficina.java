package ejercicio3;

public class EdificioOficina implements IEdificio{
	
	
	// atributos
	private int numeroDeOficinas;
	private double superficieEdificioOficina;
	
	
	// constructor 
	public EdificioOficina(int numeroDeOficinas, double superficie) {
		this.numeroDeOficinas = numeroDeOficinas;
		this.superficieEdificioOficina = superficie;
	}


	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}


	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	public void setSuperficieEdificioOficina(double superficieEdificioOficina) {
		this.superficieEdificioOficina = superficieEdificioOficina;
	}


	@Override
	public String toString() {
		return "EdificioOficina [numeroDeOficinas=" + numeroDeOficinas + ", superficieEdificioOficina="
				+ superficieEdificioOficina + "]";
	}

	@Override
	public double getSuperficieEdificio() {
		return superficieEdificioOficina;
	}


	

	

	

	
	
	

	

}
