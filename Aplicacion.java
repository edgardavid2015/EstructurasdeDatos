package formasGeometricas;

public class Aplicacion
{
public static void main(String args[]){
		
		Punto p = new Punto();
		Circulo c = new Circulo();
		Linea lin = new Linea();
		Cuadrado cua = new Cuadrado();
		Triangulo tri= new Triangulo();
		Rectangulo rec= new Rectangulo();
		
		p.setX(3);
		p.setY(2);
		
		c.setCentro(new Punto(5,2));
		c.setRadio(10);
		c.Calculararea();
		
		cua.setPto1(new Punto(2,1));
		cua.setPto2(new Punto(2,7));
		cua.setPto3(new Punto(8,7));
		cua.setPto4(new Punto(8,1));
		cua.Calculolado();
		cua.Calculararea();
		
		tri.setPto1(new Punto(6,1));
		tri.setPto2(new Punto(10,1));
		tri.setPto3(new Punto(8,5));
		tri.Calculocateto1();
		tri.Calculocateto2();
		tri.Calculohipotenusa();
		tri.Calculararea();
		
		rec.setPto1(new Punto(1,0));
		rec.setPto2(new Punto(4,0));
		rec.setPto3(new Punto(1,3));
		rec.setPto4(new Punto(4,3));
		rec.Calculobase();
		rec.Calculoaltura();
		rec.Calculararea();
		
		System.out.println("Datos del punto: "+p);
		System.out.println("Datos de la linea: "+lin);
		System.out.println("Datos del circulo: "+c);
		System.out.println("Datos del cuadrado: "+cua);
		System.out.println("Datos del triangulo: "+tri);
		System.out.println("Datos del rectangulo: "+rec);
		
	}

}
