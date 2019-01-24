package hibernate;

public class Grupo {

	private String nombre;
	private String estilo;
	private int numMiembros;
	
	public Grupo(String nombre, String estilo, int numMiembros) {
		super();
		this.nombre = nombre;
		this.estilo = estilo;
		this.numMiembros = numMiembros;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public int getNumMiembros() {
		return numMiembros;
	}
	
	public void setNumMiembros(int numMiembros) {
		this.numMiembros = numMiembros;
	}
	
	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", estilo=" + estilo + ", numMiembros=" + numMiembros + "]";
	}
}
