package formasGeometricas;

public class Rectangulo extends Figura
{
	private Punto pto1,pto2,pto3,pto4;
	private double base, altura, area;

	public Rectangulo() {
		super();
		this.pto1 = new Punto(0,0);
		this.pto2 = new Punto(1,0);
		this.pto3 = new Punto(0,1);
		this.pto4 = new Punto(1,1);
	}

	public Rectangulo(Punto pto1, Punto pto2, Punto pto3, Punto pto4) {
		super();
		this.pto1 = pto1;
		this.pto2 = pto2;
		this.pto3 = pto3;
		this.pto4 = pto4;
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

	public Punto getPto4() {
		return pto4;
	}

	public void setPto4(Punto pto4) {
		this.pto4 = pto4;
	}
	
	public double VerificarFigura()
	{
		if(pto1.getY()!=pto2.getY())
		{
			System.exit(0);//Para que no calcule el area en vano
		}
		else if(pto4.getY()!=pto3.getY())
		{
			System.exit(0);//Para que no calcule el area en vano
		}
		return 0;
	}
	
	public double Calculobase()
	{
		base=Math.sqrt(Math.pow(pto2.getX()-pto1.getX(),2)+Math.pow(pto2.getY()-pto1.getY(),2));
		return base;	
	}
	
	public double Calculoaltura()
	{
		altura=Math.sqrt(Math.pow(pto4.getX()-pto2.getX(),2)+Math.pow(pto4.getY()-pto2.getY(),2));
		return altura;	
	}
	
	public double Calculararea()
	{
		area=base*altura;
		return area;
	}

	@Override
	public String toString() {
		return "\nPunto 1:" + pto1 + "\nPunto 2:" + pto2 + "\nPunto 3:" + pto3 + "\nPunto 4:" + pto4+"\nArea:"+area;
	}
}
