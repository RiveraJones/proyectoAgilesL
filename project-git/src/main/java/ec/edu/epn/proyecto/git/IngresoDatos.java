package ec.edu.epn.proyecto.git;

import java.util.Scanner;

public class IngresoDatos {
	
	Producto p = new Producto();
	Scanner sc = new Scanner(System.in);
		
	public String nombrePro() {
		String obo = "";
		System.out.println("Por favor ingrese el nombre del producto: ");
		p.setNombre(obo = sc.nextLine());
		return obo;
	}
	
	public float pesoPro() {
		float peso;
		System.out.println("Por favor ingrese el peso del producto: ");
		p.setPeso(peso = sc.nextFloat());
		return peso;
	}
	
	public int cantidadPro() {
		int cantidad;
		System.out.println("Por favor ingrese la cantidad de productos: \n");
		p.setCantidad(cantidad = sc.nextInt());
		return cantidad;
	}
	
	public String tipoPro() {
		String tipo;
		System.out.println("Por favor ingrese el tipo de producto: ");
		p.setTipo(tipo = sc.next());
		return tipo;
	}
	
	public float anchoPro() {
		float ancho;
		System.out.println("Por favor ingrese el ancho del producto: ");
		p.setAncho(ancho = sc.nextFloat());
		return ancho;
	}
	
	public float largoPro() {
		float largo;
		System.out.println("Por favor ingrese el alto del producto: ");
		p.setAlto(largo = sc.nextFloat());
		return largo;
	}
	
	public float altoPro() {
		float alto;
		System.out.println("Por favor ingrese el largo del producto: ");
		p.setLargo(alto = sc.nextFloat());
		return alto;
	}
	
	public void datos() {
		System.out.println("Ud. desea enviar "+p.getCantidad()+" "+p.getNombre()+"(s)");
		System.out.println("Peso: "+p.getPeso());
		System.out.println("Tipo: "+p.getTipo());
		System.out.println("Dimensiones:\nlargo: "+p.getLargo()+" ancho: "+p.getAncho()+" alto: "+p.getAlto());	
	}
	
}