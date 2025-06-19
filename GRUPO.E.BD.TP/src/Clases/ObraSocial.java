package Clases;

public class ObraSocial {

	public int idObrasocial;
	public String nombre;
	
	
	
	
	
	
	
	
	public ObraSocial(int idObrasocial, String nombre) {
		super();
		this.idObrasocial = idObrasocial;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "ObraSocial [idObrasocial=" + idObrasocial + ", nombre=" + nombre + "]";
	}
	public int getIdObrasocial() {
		return idObrasocial;
	}
	public void setIdObrasocial(int idObrasocial) {
		this.idObrasocial = idObrasocial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
