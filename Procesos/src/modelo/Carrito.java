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
			total = totalPrecio;
			cant = cantidadProductos;
			nom = nombreComprador;
			dir = direccionDestinatario;
			tel = telefonoCliente;
			
		}
		
		
		public int getTotalPrecio() {
			return totalPrecio;
		}


		public void setTotalPrecio(int totalPrecio) {
			this.totalPrecio = totalPrecio;
		}


		public int getCantidadProductos() {
			return cantidadProductos;
		}


		public void setCantidadProductos(int cantidadProductos) {
			this.cantidadProductos = cantidadProductos;
		}


		public String getNombreComprador() {
			return nombreComprador;
		}


		public void setNombreComprador(String nombreComprador) {
			this.nombreComprador = nombreComprador;
		}


		public String getDireccionDestinatario() {
			return direccionDestinatario;
		}


		public void setDireccionDestinatario(String direccionDestinatario) {
			this.direccionDestinatario = direccionDestinatario;
		}


		public String getTelefonoCliente() {
			return telefonoCliente;
		}


		public void setTelefonoCliente(String telefonoCliente) {
			this.telefonoCliente = telefonoCliente;
		}


		public ArrayList<Plato> darListaPlatos(){
			
			return listaPlatos;
		}
		
	
		
		public void agregarPlato(Plato plato){
			listaPlatos.add(plato);
			
	    }   
		
		public int calcularTotalPrecio(){
			int total=0;                                 
			for(int i=0; i<listaPlatos.size(); i++){
				Plato nuevoPlato = listaPlatos.get(i);
				total+= nuevoPlato.darPrecioVenta();
				
			}return total;
		}
		
		
	   
			
		public void eliminarPlato(int posicionPlato){
			listaPlatos.remove(posicionPlato);
		}
	}

		
		

