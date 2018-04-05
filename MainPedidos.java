import java.util.Scanner;

public class MainPedidos {

	static Scanner teclado = new Scanner(System.in);
	static Byte opcion;
	static Listado listado = new Listado();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iniciaMenu();
		
	}

	public static void iniciaMenu() {
		
		do {
			
			imprime("\n1 - Carga una lista");
			imprime("2 - Inserta un pedido al final de la filav");
			imprime("3 - Listar lo que hay cargado");
			imprime("4 - Ordena precio de mayor a menor");
			imprime("5 - El cliente más caro");
			imprime("6 - Guarda la lista en un CSV");
			imprime("\nElige una opción");
			
			opcion = teclado.nextByte();
			
			switch (opcion) {
			case 1:
				listado.cargarCSV();
				break;
				
			case 2:
				
				insertarPedido();
				break;
			
			case 3:
				
				listado.listar();
				break;
				
			case 4:
				
				listado.ordenaPrecio();
				break;
					
			case 5:
				listado.pedidoCaro();
				break;
			case 6 :
				
				listado.guardarCSV();
				break;
				
			default:
				break;
			}
			
		} while (opcion!=0);
		
	}
	
	// Métodos útiles 
	
	public static void imprime(String mensaje) {

		System.out.println(mensaje);

	}
	
	public static void insertarPedido () {
		
		imprime("IdCliente:");
		int idCliente = teclado.nextInt();
		
		imprime("IdProducto:");
		int idProducto = teclado.nextInt();
		
		imprime("precio:");
		double precio = teclado.nextDouble();
		
		imprime("Dirección de entrega:");
		String direccion = teclado.next();
		
		listado.insertarCliente(new Pedido(idCliente,
				idProducto,precio,direccion));
	
	}
}
