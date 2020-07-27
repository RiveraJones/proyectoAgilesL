package ec.edu.epn.proyecto.git;

public class Producto {

	private float peso;
	private int cantidad;
	private String nombre;
	private String tipo;
	private float ancho;
	private float alto;
	private float largo;
	
	public Producto() {
		
	}
	public Producto(float peso, int cantidad, String nombre, String tipo, float ancho, float alto, float largo) {
		super();
		this.peso = peso;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
}