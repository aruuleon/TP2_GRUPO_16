package ejercicio3;

public class EdificioOficina implements IEdificio{
	
	
	// atributos
	private int numeroDeOficinas;
	private double superficieEdificioOficina;
	
	
	// constructor 
	public EdificioOficina(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}


	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}


	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}


	public double getSuperficieEdificioOficina() {
		return superficieEdificioOficina;
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
		// TODO Auto-generated method stub
		return 0;
	}


	

	

	

	
	
	

	

}
