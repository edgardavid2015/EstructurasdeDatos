package formasGeometricas;

public class Cuadrado extends Figura
{
	private Punto Punto1,Punto2,Punto3,Punto4;
	private double lado,area;

	public Cuadrado() {
		super();
		this.Punto1 = new Punto(0,0);
		this.Punto2 = new Punto(1,0);
		this.Punto3 = new Punto(1,1);
		this.Punto4 = new Punto(0,1);
	}

	public Cuadrado(Punto pto1, Punto pto2, Punto pto3, Punto pto4) {
		super();
		this.Punto1 = pto1;
		this.Punto2 = pto2;
		this.Punto3 = pto3;
		this.Punto4 = pto4;
	}

	public Punto getPto1() {
		return Punto1;
	}

	public void setPto1(Punto pto1) {
		this.Punto1 = pto1;
	}

	public Punto getPto2() {
		return Punto2;
	}

	public void setPto2(Punto pto2) {
		this.Punto2 = pto2;
	}

	public Punto getPto3() {
		return Punto3;
	}

	public void setPto3(Punto pto3) {
		this.Punto3 = pto3;
	}

	public Punto getPto4() {
		return Punto4;
	}

	public void setPto4(Punto pto4) {
		this.Punto4 = pto4;
	}
	
	public double Calculolado()
	{
		lado=Math.sqrt(Math.pow(Punto3.getX()-Punto2.getX(),2)+Math.pow(Punto3.getY()-Punto2.getY(),2));
		return lado;	
	}
	
	public double Calculararea()
	{
		area=lado*lado;
		return area;
	}

	@Override
	public String toString()
	{
		return "\nPunto 1:" + Punto1 + "\nPunto 2:" + Punto2 + "\nPunto 3:" + Punto3 + "\nPunto 4:" + Punto4 +"\nArea:"+area;
	}


}
