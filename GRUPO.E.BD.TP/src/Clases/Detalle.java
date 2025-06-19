package Clases;

public class Detalle {
	
	public int idDetalle;
	public int cantidad;
	public float subTotal;
	public float precioUnitario;
	public String ventaNroTicket; 
	public Producto producto;
	

	public Detalle(int idDetalle, int cantidad, float subTotal, float precioUnitario, String ventaNroTicket,
			Producto producto) {
		super();
		this.idDetalle = idDetalle;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
		this.precioUnitario = precioUnitario;
		this.ventaNroTicket = ventaNroTicket;
		this.producto = producto;
	}
	
	@Override
	public String toString() {
		return "Detalle [idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", subTotal=" + subTotal
				+ ", precioUnitario=" + precioUnitario + ", ventaNroTicket=" + ventaNroTicket + ", producto=" + producto
				+ "]";
	}
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
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getVentaNroTicket() {
		return ventaNroTicket;
	}
	public void setVentaNroTicket(String ventaNroTicket) {
		this.ventaNroTicket = ventaNroTicket;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

	

}
