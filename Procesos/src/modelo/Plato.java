package modelo;

public class Plato {

	public Plato() {
		// TODO Auto-generated constructor stub
	}
	//Atributos
		private String nombre;
		private String identificador;
		private int precioVenta;
		private String foto;
		
		
		public Plato(String nombre, String identificador, int precioVenta, String foto){
			this.nombre = nombre;
			this.identificador = identificador;
			this.precioVenta = precioVenta;
			this.foto=foto;
		}
		
		//Metodos
	
		public String darNombre(){
			return nombre;
		}
		
		public String darIdentificador(){
			return identificador;
		}
		
		public int darPrecioVenta(){
			return precioVenta;
		}
		public String darFoto() {
			return foto;
		}
		
		public void modificarNombre(String nombre){
			this.nombre = nombre;
		}
		
		public void modificarCodigo(String identificador){
			this.identificador = identificador;
		}
		
		public void modificarPrecioVenta(int precioVenta){
			this.precioVenta = precioVenta;
		}
		
	}


