package hibernate;

public class Actuacion {

	private String hora;
	private int escenario;
	
	public Actuacion(String hora, int escenario) {
		super();
		this.hora = hora;
		this.escenario = escenario;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getEscenario() {
		return escenario;
	}

	public void setEscenario(int escenario) {
		this.escenario = escenario;
	}

	@Override
	public String toString() {
		return "Actuacion [hora=" + hora + ", escenario=" + escenario + "]";
	}
}
