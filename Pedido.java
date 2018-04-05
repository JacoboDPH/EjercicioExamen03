
public class Pedido  implements Comparable<Pedido>{

	// Atributos
	
	private int idCliente, idProducto;
	private double precio;
	private String direccionEntrega;
	
	// Constructor 
	
	public Pedido (int idCliente, int idProducto, double precio, String direccionEntrega) {
		
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.precio = precio;
		this.direccionEntrega = direccionEntrega;
		
		
	}
	
	
	// Métodos getter y setter
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	
	// Método toSting 
	
	public String toString() {

		String unString =  (""+idCliente+ ","+idProducto+","+precio+","+direccionEntrega);
		
		return unString;
		
	}



	public int compareTo(Pedido o) {
		
		
		return Double.compare(this.precio-o.precio, precio);
		
	}
}
