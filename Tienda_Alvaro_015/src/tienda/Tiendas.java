package tienda;

public class Tiendas {

	private String id_Tienda="";
	
	//Constructor por defecto.
	public Tiendas(){	
	}
	
	//Contructor por parametros.
	public Tiendas(String id_Tienda){
		this.setId_Tienda(id_Tienda);
	}

	/**
	 * @return el id_Tienda
	 */
	String getId_Tienda() {
		return id_Tienda;
	}

	/**
	 * @param id_Tienda el id_Tienda a establecer
	 */
	void setId_Tienda(String id_Tienda) {
		this.id_Tienda = id_Tienda;
	}
}
