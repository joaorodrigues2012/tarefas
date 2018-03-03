package exercicio_para_entregar;

public class Trapezio extends Quadrilatero{
	double base2;
	String nome;
	public Trapezio(double base, double altura, double base2) {
		super(base, altura);
		this.base2 = base2;
	}
	public double getBase2() {
		return base2;
	}
	public void setBase2(double base2) {
		this.base2 = base2;
	}
	public double calculaLado() {
		return Math.sqrt((altura*altura)+(Math.abs(base-base2)*Math.abs(base-base2)));
	}
	@Override
	public double area() {
		return ((base + base2)*altura)/2;
	}
	@Override
	public double perimetro() {
		return (base+base2)+(2 * calculaLado());
	}
	@Override
	public String getName() {
		return nome = "Trapezio";
	}
}
