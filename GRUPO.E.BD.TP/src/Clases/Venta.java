package Clases;

import java.time.LocalDate;
import java.util.List;

public class Venta {

	private int idVenta;
	private List<Detalle> detalles;
	private LocalDate fecha;
	private float totalVenta;
	private FormaDePago formaDePago;
	private Empleado empleadoAtiende;
	private Empleado empleadoCobra;
	private Cliente cliente;

	public Venta(int idVenta, List<Detalle> detalles, LocalDate fecha,
	             FormaDePago formaDePago, Empleado empleadoAtiende,
	             Empleado empleadoCobra, Cliente cliente) {

		this.idVenta = idVenta;
		this.detalles = detalles;
		this.fecha = fecha;
		this.formaDePago = formaDePago;
		this.empleadoAtiende = empleadoAtiende;
		this.empleadoCobra = empleadoCobra;
		this.cliente = cliente;
		this.totalVenta = calcularTotalVenta();
	}

	private float calcularTotalVenta() {
		float total = 0;
		for (Detalle d : detalles) {
			total += d.getSubTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", detalles=" + detalles + ", fecha=" + fecha + ", totalVenta="
				+ totalVenta + ", formaDePago=" + formaDePago + ", empleadoAtiende=" + empleadoAtiende
				+ ", empleadoCobra=" + empleadoCobra + ", cliente=" + cliente + "]";
	}

	// Getters y setters

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
		this.totalVenta = calcularTotalVenta(); // recalcular si cambian
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
