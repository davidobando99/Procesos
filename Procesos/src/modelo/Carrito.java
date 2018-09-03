package modelo;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Plato> listaPlatos;
	private int totalPrecio;
	private int cantidadProductos;
	private String nombreComprador;
	private String direccionDestinatario;
	private String telefonoCliente;

	
		
		
	
		public Carrito(int total, int cant, String nom, String dir, String tel){
			listaPlatos = new ArrayList<Plato>();
		}
		
		public ArrayList<Plato> darListaPlatos(){
			
			return listaPlatos;
		}
		
	
		
		public void agregarPlatoAlPedido(Plato plato){
			listaPlatos.add(plato);
			
	    }   
		
		public double calcularTotal(){
			double total=0;                                 
			for(int i=0; i<listaPlatos.size(); i++){
				Plato nuevoPlato = listaPlatos.get(i);
				total+= nuevoPlato.darPrecioVenta();
				
			}return total;
		}
		
		
	   
			
		public void QuitarPlatoDelPedido(int posicionPlato){
			listaPlatos.remove(posicionPlato);
		}
	}

		
		

