package Clases;

public class Detalle {

	private int idDetalle;
	private int cantidad;
	private float subTotal;
	private float precioUnitario;
	private Producto producto;

	public Detalle(int idDetalle, int cantidad, float precioUnitario, Producto producto) {
		this.idDetalle = idDetalle;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.producto = producto;
		this.subTotal = calcularSubTotal();
	}

	private float calcularSubTotal() {
		return cantidad * precioUnitario;
	}

	@Override
	public String toString() {
		return "Detalle [idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", subTotal=" + subTotal
				+ ", precioUnitario=" + precioUnitario + ", producto=" + producto + "]";
	}

	// Getters y setters

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
		this.subTotal = calcularSubTotal();
	}

	public float getSubTotal() {
		return subTotal;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
		this.subTotal = calcularSubTotal();
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}