package ejercicio2;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		Producto producto = new Producto("10/04/2025", 1);
		System.out.println("Producto = " + producto.toString());
		
		
		ProductosFrescos pFresco = new ProductosFrescos("15/05/2025", "05/04/2025", "Argentina", 2);
		System.out.println(pFresco.toString()); 
		
		
		ProductosRefrigerados pRefrigerado = new ProductosRefrigerados("30/05/2025", "A001", 3);
		System.out.println(pRefrigerado.toString());
		
		
		ProductosCongelados pCongelado = new ProductosCongelados("01/05/2025", 27, 4);	
		System.out.println(pCongelado.toString());
		
	}

}
