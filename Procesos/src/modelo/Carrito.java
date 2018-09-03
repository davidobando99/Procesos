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
		
	
		
		public void agregarJuegoAlPedido(Plato plato){
			listaPlatos.add(new Plato(plato));
			
	    }   
		
		public double calcularTotal(){
			double total=0;                                 
			for(int i=0; i<listaPlatos.size(); i++){
				ItemPedido nuevoItem = (ItemPedido) listaPedidos.get(i);
				total+= nuevoItem.darCantidad() * nuevoItem.darVideoJuego().darPrecioVenta();
				
			}return total;
		}
		
		/**
		* Metodo que muestra la lista de todos los videojuegos pedidos por el usuario <br>
		* <b>pre:</b> El ArrayList listaPedidos esta inicializado <br>
		* <b>post:</b> Se ha listado todos los videojuegos pedidos <br>
		* @return lista de los videojuegos pedidos
		*/
	    public String listarPedidos(){
			String lista="";
			double subtotal=0;
			
			for(int i=0; i<listaPedidos.size(); i++){
				ItemPedido nuevoItem = (ItemPedido) listaPedidos.get(i);
				subtotal = nuevoItem.darCantidad() * nuevoItem.darVideoJuego().darPrecioVenta();
				
				lista += (i+1)+". "+" Nombre:  "+nuevoItem.darVideoJuego().darNombre()+ "  Codigo: "+ nuevoItem.darVideoJuego().darCodigo()+"     \n   Precio: "
			+ nuevoItem.darVideoJuego().darPrecioVenta()+ "  Unidades:   "+ nuevoItem.darCantidad()+ "  Subtotal:  "+subtotal+"\n";
			  }return lista;
		}
		
		 /**
		 * Metodo que elimina un videojuego de la lista videojuegos <br>
		 * <b>pre:</b> El objeto carroCompra esta inicializado <br>
		 * <b>post:</b> Se ha eliminado un videojuego del ArrayList <br>
		 * @param posicionJuego - Posicion que tiene el videojuego en el arreglo. posicionJuego!=null, posicionJuego!="" <br>
		 */
			
		public void QuitarItemDelPedido(int posicionJuego){
			listaPedidos.remove(posicionJuego);
		}
	}

		
		

}
