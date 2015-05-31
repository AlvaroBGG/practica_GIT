package tienda;

public class Ventas {

	private String fecha_hora="";
	
	//Constructor por defecto.
	public Ventas(){	
	}
	
	//Contructor por parametros.
	public Ventas(String fecha_hora){
		this.setFecha_hora(fecha_hora);
	}

	/**
	 * @return el fecha_hora
	 */
	String getFecha_hora() {
		return fecha_hora;
	}

	/**
	 * @param fecha_hora el fecha_hora a establecer
	 */
	void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
}
