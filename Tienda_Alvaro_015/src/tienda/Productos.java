package tienda;

public class Productos {

	private String id_Producto="";
	
	//Constructor por defecto.
	public Productos(){	
	}
	
	//Contructor por parametros.
	public Productos(String id_Producto){
		this.setId_Producto(id_Producto);
	}

	/**
	 * @return el id_Producto
	 */
	String getId_Producto() {
		return id_Producto;
	}

	/**
	 * @param id_Producto el id_Producto a establecer
	 */
	void setId_Producto(String id_Producto) {
		this.id_Producto = id_Producto;
	}
}
