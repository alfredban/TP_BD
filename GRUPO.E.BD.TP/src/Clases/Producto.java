package Clases;

public class Producto {

	public int codigo; //seria el PK
	public float precio;
	public String tipo;
	public String descripcion;
	public Laboratorio laboratorio;
	
	
	public Producto(int codigo, float precio, String tipo, String descripcion,Laboratorio laboratorio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precio=" + precio + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ ", laboratorio=" + laboratorio + "]";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Laboratorio getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	
	
	
	
	
}
