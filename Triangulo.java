package formasGeometricas;

public class Triangulo
{
	private Punto pto1,pto2,pto3;
	private double cateto1, cateto2,hipotenusa,area;

	public Triangulo() {
		super();
		this.pto1 = new Punto(0,0);
		this.pto2 = new Punto(2,0);
		this.pto3 = new Punto(1,1);
	}

	public Triangulo(Punto pto1, Punto pto2, Punto pto3) {
		super();
		this.pto1 = pto1;
		this.pto2 = pto2;
		this.pto3 = pto3;
	}

	public Punto getPto1() {
		return pto1;
	}

	public void setPto1(Punto pto1) {
		this.pto1 = pto1;
	}

	public Punto getPto2() {
		return pto2;
	}

	public void setPto2(Punto pto2) {
		this.pto2 = pto2;
	}

	public Punto getPto3() {
		return pto3;
	}

	public void setPto3(Punto pto3) {
		this.pto3 = pto3;
	}
	
	public double Calculocateto1()
	{
		cateto1=Math.sqrt(Math.pow(pto2.getX()-pto1.getX(),2)+Math.pow(pto2.getY()-pto1.getY(),2));
		return cateto1;	
	}
	
	public double Calculocateto2()
	{
		cateto2=Math.sqrt(Math.pow(pto3.getX()-pto2.getX(),2)+Math.pow(pto3.getY()-pto2.getY(),2));
		return cateto2;	
	}
	
	public double Calculohipotenusa()
	{
		hipotenusa=Math.sqrt(Math.pow(pto3.getX()-pto1.getX(),2)+Math.pow(pto3.getY()-pto1.getY(),2));
		return hipotenusa;	
	}
	public double Calculararea()
	{
		double p=(cateto1+cateto2+hipotenusa)/2;
		area=Math.sqrt(p*(p-cateto1)*(p-cateto2)*(p-hipotenusa));
		return area;
	}

	@Override
	public String toString() {
		return "\nPunto 1:" + pto1 + "\nPunto 2:" + pto2 + "\nPunto 3:" + pto3+"\nArea:"+area;
	}
}
