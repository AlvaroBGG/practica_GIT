package tienda;

public class Vendedores {

	private String id_Vendedor="";
	
	//Constructor por defecto.
	public Vendedores(){	
	}
	
	//Contructor por parametros.
	public Vendedores(String id_Vendedor){
		this.setId_Vendedor(id_Vendedor);
	}

	/**
	 * @return el id_Vendedor
	 */
	String getId_Vendedor() {
		return id_Vendedor;
	}

	/**
	 * @param id_Vendedor el id_Vendedor a establecer
	 */
	void setId_Vendedor(String id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}
}
