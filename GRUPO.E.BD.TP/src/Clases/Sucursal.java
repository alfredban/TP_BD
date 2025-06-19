package Clases;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Sucursal {
	
	
	public int idSucursal;
	public String puntoDeVenta;
	@JsonBackReference
	public Empleado gerente;
	public Domicilio domicilio;
	

	public Sucursal(int idSucursal, String puntoDeVenta, Empleado gerente, Domicilio domicilio) {
		super();
		this.idSucursal = idSucursal;
		this.puntoDeVenta = puntoDeVenta;
		this.gerente = gerente;
		this.domicilio = domicilio;
	}
	
	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", puntoDeVenta=" + puntoDeVenta + ", gerente=" + gerente
				+ ", domicilio=" + domicilio + "]";
	}
	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	public String getPuntoDeVenta() {
		return puntoDeVenta;
	}
	public void setPuntoDeVenta(String puntoDeVenta) {
		this.puntoDeVenta = puntoDeVenta;
	}
	public Empleado getGerente() {
		return gerente;
	}
	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}


	

	
	
}
