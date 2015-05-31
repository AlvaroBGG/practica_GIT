package tienda;

public class Clientes {

	private String id_cliente="";
	
	//Constructor por defecto.
	public Clientes(){	
	}
	
	//Contructor por parametros.
	public Clientes(String id_cliente){
		this.setId_cliente(id_cliente);
	}

	/**
	 * @return el id_cliente
	 */
	String getId_cliente() {
		return id_cliente;
	}

	/**
	 * @param id_cliente el id_cliente a establecer
	 */
	void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	
}
