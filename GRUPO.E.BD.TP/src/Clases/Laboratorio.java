package Clases;

public class Laboratorio {

	public int codigo; //pk
	public String nombre;
	
	
	public Laboratorio(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Laboratorio [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
