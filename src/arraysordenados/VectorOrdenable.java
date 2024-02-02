package arraysordenados;

import java.util.Arrays;

public class VectorOrdenable {

	private Persona[] datos;
	
	public VectorOrdenable() {
		
		datos = new Persona[5];
		datos[0] = new Persona("Tom",170,30);
		datos[1] = new Persona("John",180,10);
		datos[2] = new Persona("Jimmy",160,20);
		datos[3] = new Persona("Mary",150,50);
		datos[4] = new Persona("Sam",140,40);
	}
	
	
	@Override
	public String toString() {
		return "VectorOrdenable [" + Arrays.toString(datos) + "]";
	}	
	
	public void ordenate() {
		Arrays.sort(datos);
	}
	
}
