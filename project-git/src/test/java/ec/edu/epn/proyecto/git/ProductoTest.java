package ec.edu.epn.proyecto.git;

import junit.framework.TestCase;

public class ProductoTest extends TestCase {
	private Producto c;
	
	protected void setUp() throws Exception {
		 c = new Producto(234, 2, "Perro", "Animal", 12, 10, 23);
		 } 
	
	 protected void tearDown() throws Exception {
		 c = null;
		 } 

	public void testGetPeso() {
		float actual = c.getPeso();
		System.out.println("testGetPeso()");
		float expected = 234;
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}

	public void testGetCantidad() {
		int actual = c.getCantidad();
		System.out.println("testGetCantidad()");
		int expected = 2;
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}

	public void testGetNombre() {
		String actual = c.getNombre();
		System.out.println("testIngresoDatosTest()");
		String expected = "Perro";
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}

	public void testGetTipo() {
		String actual = c.getTipo();
		System.out.println("testGetTipo()");
		String expected = "Animal";
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}

	public void testGetAncho() {
		float actual = c.getAncho();
		System.out.println("testGetAncho()");
		float expected = 12;
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}

	public void testGetAlto() {
		float actual = c.getAlto();
		System.out.println("testGetAlto()");
		float expected = 10;
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}

	public void testGetLargo() {
		float actual = c.getLargo();
		System.out.println("testGetLargo()");
		float expected = 23;
		//System.out.println(actual);
		assertEquals(expected, actual);	
	}



}
