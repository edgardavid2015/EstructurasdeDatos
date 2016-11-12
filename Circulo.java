package formasGeometricas;

public class Circulo extends Figura
{
	private Punto centro;
	private double radio, area;
	final double pi=3.14;
	
	public Circulo(Punto p, double r)
	{
		centro= p;
		radio= r;
	}
	
	public Circulo()
	{
		centro= new Punto();
		radio=10;	
	}
	
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double Calculararea()
	{
		area =pi*radio*radio;
		return area;
	}
	@Override
	public String toString()
	{
		return "\n" +"Centro:" +centro +"\n" + "Radio:" +radio +"\n" + "Area:" +area;
	}

}
