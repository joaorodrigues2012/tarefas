package exercicio_para_entregar;

public class Quadrado extends Quadrilatero implements Diagonal{
	String nome;
	public Quadrado(double base, double altura) {
		super(base, altura);
		
	}
	@Override
	public double area() {
		base = altura;
		return base * altura;
	}
	@Override
	public double perimetro() {
		base = altura;
		return 4 * base;
	}
	@Override
	public double calculaDiagonal() {
		return base * Math.sqrt(2);
	}
	@Override
	public String getName() {
		return nome = "Quadrado";
	}

}
