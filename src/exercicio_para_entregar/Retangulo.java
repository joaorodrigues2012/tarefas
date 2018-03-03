package exercicio_para_entregar;

public class Retangulo extends Quadrilatero implements Diagonal{
	String nome;
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	@Override
	public double area() {
		return base * altura;
	}
	@Override
	public double perimetro() {
		return (2*base)+(2*altura);
	}
	@Override
	public double calculaDiagonal() {
		return Math.sqrt((base * base)+(altura * altura));
	}
	@Override
	public String getName() {
		return nome = "Retangulo";
	}

}
