package formasGeometricas;

public class Linea
{
	private Punto PuntoInicio,PuntoFinal;

	public Linea(Punto pto1, Punto pto2) {
		super();
		this.PuntoInicio = pto1;
		this.PuntoFinal = pto2;
	}

	public Linea() {
		super();
		this.PuntoInicio = new Punto();
		this.PuntoFinal = new Punto(1, 0);
	}

	public Punto getPto1() {
		return PuntoInicio;
	}

	public void setPto1(Punto pto1) {
		this.PuntoInicio = pto1;
	}

	public Punto getPto2() {
		return PuntoFinal;
	}

	public void setPto2(Punto pto2) {
		this.PuntoFinal = pto2;
	}

	@Override
	public String toString() {
		return "\nPunto inicial:" +PuntoInicio + "\nPunto final:" + PuntoFinal;
	}
	
}
