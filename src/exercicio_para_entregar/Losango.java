package exercicio_para_entregar;

public class Losango extends Quadrilatero{
	String nome;
	public Losango(double base, double altura) {
		super(base, altura);
		
	}
	@Override
	public double area() {
		return base * altura;
	}
	@Override
	public double perimetro() {
		return 4 * base;
	}
	@Override
	public String getName() {
		return nome = "Losango";
	}

}
