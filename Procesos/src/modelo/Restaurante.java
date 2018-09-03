package modelo;

import java.util.ArrayList;

public class Restaurante {

	
	
	   private ArrayList<Plato> catalogoPlatos;
		private Carrito carroCompra;
		
		public Restaurante(){
			catalogoPlatos = new ArrayList<Plato>();
			carroCompra= new Carrito(0,0,"","","");
		}
		
		public ArrayList<Plato> darCatalogoPlatos(){
			return catalogoPlatos;
		}
		/**
		* Metodo que da la relacion con el pedido de la Tienda 
		* @return carro de compra con los pedidos de la Tienda 
		*/
		public Carrito darCarroCompra(){
			return carroCompra;
		}
	    
		
		public void agregarPlato(String nombre, String identificador, int precio, String foto){
			Plato unPlato = new Plato(nombre, identificador, precio,foto);
			catalogoPlatos.add(unPlato);
		}
		
		
		public String listaDePlatos(){
		      String lista = "";
			  for(int i=0; i<catalogoPlatos.size();i++){
				  Plato juego = (Plato)catalogoPlatos.get(i);
				  lista += (i+1)+". "+" Nombre:  "+juego.darNombre()+ "   \n    Codigo: "+ juego.darIdentificador()+"   Precio: "+ juego.darPrecioVenta()+ 
						  "  Foto: "+juego.darFoto()+"\n";
			  }return lista;
		}
		
	
		
		public void agregarACarroCompra(int posicionPlato){
			
			
			Plato platoPedido = (Plato)catalogoPlatos.get(posicionPlato-1);
			carroCompra.agregarPlatoAlPedido(platoPedido);
				
			}
		
		
		
		public void eliminarPlatoDelCarrito(int posicionJuego){
			carroCompra.QuitarPlatoDelPedido(posicionJuego-1);
		}
		
		
        public static void main(String[] args) {
			Restaurante miRestaurante = new Restaurante();
			miRestaurante.agregarPlato("Huertas a la Naranja", "20", 540, "NN");
			miRestaurante.agregarPlato("Huertas BURGUER", "21", 5350, "NN");
			miRestaurante.agregarPlato("Alitas a la huertas", "22", 400, "NN");
			
			miRestaurante.agregarACarroCompra(1);
			miRestaurante.agregarACarroCompra(2);
			for(int i=0;i<miRestaurante.darCarroCompra().darListaPlatos().size();i++) {
				System.out.println(miRestaurante.darCarroCompra().darListaPlatos().get(i).darNombre());
			}
			miRestaurante.eliminarPlatoDelCarrito(1);
			System.out.println("Despues de  eliminar");
			for(int i=0;i<miRestaurante.darCarroCompra().darListaPlatos().size();i++) {
				System.out.println(miRestaurante.darCarroCompra().darListaPlatos().get(i).darNombre());
			}
			
		}
			
	}











