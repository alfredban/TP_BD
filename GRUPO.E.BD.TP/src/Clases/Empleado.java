package Clases;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Empleado {
	@JsonBackReference
	
	public int idEmpleado;
	public String nombre;
	public String apellido;
	public int dni;
	public int numeroAfiliado;
	public ObraSocial obraSocial;
	public Domicilio domicilio;
	@JsonManagedReference
	public Sucursal sucursal;
	
	
	
	
	
	
	public Empleado(int idEmpleado, String nombre, String apellido, int dni, int numeroAfiliado, ObraSocial obraSocial,
			Domicilio domicilio, Sucursal sucursal) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.numeroAfiliado = numeroAfiliado;
		this.obraSocial = obraSocial;
		this.domicilio = domicilio;
		this.sucursal = sucursal;
	}
	
	
	

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", numeroAfiliado=" + numeroAfiliado + ", obraSocial=" + obraSocial + ", domicilio=" + domicilio
				+ ", sucursal=" + sucursal + "]";
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getNumeroAfiliado() {
		return numeroAfiliado;
	}
	public void setNumeroAfiliado(int numeroAfiliado) {
		this.numeroAfiliado = numeroAfiliado;
	}
	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	
	
	
}
