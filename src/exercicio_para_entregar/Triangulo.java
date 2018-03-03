package exercicio_para_entregar;

public class Triangulo extends Poligono{
	String nome;
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	public double calculaLado() {
		return Math.sqrt(((base/2) * (base/2))+(altura*altura));
	}
	@Override
	public double area() {
		return (base * altura)/2;
	
	}
	@Override
	public double perimetro() {
		return base + altura + calculaLado();
	}
	@Override
	public String getName() {
		
		return nome = "Triangulo";
	}
}