import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.KeyStore.PasswordProtection;
import java.util.*;



public class Listado {

	public static ArrayList<Pedido> listado = new ArrayList<>();
	
	public Listado() {
		
		
	}
	
	public void guardarCSV () {
		
	try {
		
		BufferedWriter escritura = new BufferedWriter(new FileWriter("pedidos.csv"));
		
		for (Pedido muestra:listado) {
			
		 escritura.write(muestra+"\n");
			
		}
		
		escritura.close();
		
	} catch (Exception e) {
		
		System.out.println("Ha habido un error");

	}	
		
	}
	
	public void insertarCliente (Pedido p) {
		
		listado.add(p);
		
	}
	public void listar () {
		
	for (Pedido muestra:listado) {
		
		System.out.println(muestra);
	}
		
	}
	
	public void cargarCSV() {
		
		String csvFichero = "pedidos.csv";
		BufferedReader bufferedReader = null;
		String line = "";
		String csvSplit = ",";
		
		try {
			bufferedReader = new BufferedReader(new FileReader(csvFichero));
			
			while ((line = bufferedReader.readLine()) !=null) {
				
				String [] camposPedidos  = line.split(csvSplit);
				
				listado.add(new Pedido(Integer.parseInt(camposPedidos[0]),
						Integer.parseInt(camposPedidos[1]),
						Double.parseDouble(camposPedidos[2]),
						camposPedidos[3]));
				}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Ha habído algún problema");
			
		}
		
		
	}
	
	public void ordenaPrecio() {
		
		Collections.sort(listado);
		
	}
	public void pedidoCaro() {
		
		ArrayList<Double> busqueda = new ArrayList<>();
		
		double precioAlto = 0;
	
		
		for (Pedido precios : listado) {
		
			busqueda.add(precios.getPrecio());
			
			if (precios.getPrecio()>=precioAlto) {
				
				precioAlto = precios.getPrecio();
				
					
			}
		
		}
	
		System.out.println("Cliente:"+listado.get(busqueda.indexOf(precioAlto)).toString());
		
	//	System.out.println("\n"+listado.get(busqueda.indexOf(precioAlto)).toString());
		
	}
}
