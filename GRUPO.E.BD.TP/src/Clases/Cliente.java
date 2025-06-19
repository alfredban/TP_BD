package Clases;

public class Cliente {
    public int id_cliente;
    public String nombre;
    public String apellido;
    public int dni;
    public String numero_afiliado;
    public ObraSocial obraSocial;
    public Domicilio domicilio;
    
    
	public Cliente(int id_cliente, String nombre, String apellido, int dni, String numero_afiliado,
			ObraSocial obraSocial, Domicilio domicilio) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.numero_afiliado = numero_afiliado;
		this.obraSocial = obraSocial;
		this.domicilio = domicilio;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", numero_afiliado=" + numero_afiliado + ", obraSocial=" + obraSocial + ", domicilio=" + domicilio
				+ "]";
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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
	public String getNumero_afiliado() {
		return numero_afiliado;
	}
	public void setNumero_afiliado(String numero_afiliado) {
		this.numero_afiliado = numero_afiliado;
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

    
}