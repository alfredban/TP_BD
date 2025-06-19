package Clases;

public class FormaDePago {

	public int idFormaDePago;
	public String nombre;
	

	public FormaDePago(int idFormaDePago, String nombre) {
		super();
		this.idFormaDePago = idFormaDePago;
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "FormaaDePago [idFormaDePago=" + idFormaDePago + ", nombre=" + nombre + "]";
	}
	public int getIdFormaDePago() {
		return idFormaDePago;
	}
	public void setIdFormaDePago(int idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
