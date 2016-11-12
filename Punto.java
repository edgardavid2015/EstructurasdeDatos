package formasGeometricas;

public class Punto
{
	private double x, y;
	
	public Punto(int x1, int y1)
	{
		x= x1;
		y= y1;
	}
	public Punto()
	{
		x=y=0;
	}

	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "\n" +"x:" +x +"\n" + "y:" +y;
	}
	}
