package Clases;

import java.time.LocalDate;

public class Venta {
	
	public int idVenta;
	public Detalle detalle;
	public LocalDate fecha;
	public float totalVenta;
	public FormaDePago formaDePago;
	public Empleado empleadoAtiende;
	public Empleado empleadoCobra;
	public Cliente cliente;
	

	public Venta(int idVenta, Detalle detalle, LocalDate fecha, float totalVenta, FormaDePago formaDePago,
			Empleado empleadoAtiende, Empleado empleadoCobra, Cliente cliente) {
		super();
		this.idVenta = idVenta;
		this.detalle = detalle;
		this.fecha = fecha;
		this.totalVenta = totalVenta;
		this.formaDePago = formaDePago;
		this.empleadoAtiende = empleadoAtiende;
		this.empleadoCobra = empleadoCobra;
		this.cliente = cliente;
	}
	
	
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", detalle=" + detalle + ", fecha=" + fecha + ", totalVenta=" + totalVenta
				+ ", formaDePago=" + formaDePago + ", empleadoAtiende=" + empleadoAtiende + ", empleadoCobra="
				+ empleadoCobra + ", cliente=" + cliente + "]";
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public Detalle getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public float getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Empleado getEmpleadoAtiende() {
		return empleadoAtiende;
	}
	public void setEmpleadoAtiende(Empleado empleadoAtiende) {
		this.empleadoAtiende = empleadoAtiende;
	}
	public Empleado getEmpleadoCobra() {
		return empleadoCobra;
	}
	public void setEmpleadoCobra(Empleado empleadoCobra) {
		this.empleadoCobra = empleadoCobra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	

	
}
