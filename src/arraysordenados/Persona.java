package arraysordenados;

public class Persona implements Comparable<Persona> {

	private int edad;
	private int altura;
	private String nombre;
	
	public Persona(String nombre, int altura, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "[" + edad + "#" + altura + "(" + nombre + ")]";
	}

	@Override
	public int compareTo(Persona o) {
		
		return o.nombre.compareTo(this.nombre);
	}
	
	
}
