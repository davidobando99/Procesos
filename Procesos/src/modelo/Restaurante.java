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
		
		
		
		public void eliminarJuegoDelCarro(int posicionJuego){
			carroCompra.QuitarPlatoDelPedido(posicionJuego-1);
		}
		
			
	}


