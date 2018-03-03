package exercicio_para_entregar;

public class Circulo extends Figura{
	String nome;
	double raio;
	public Circulo(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double area() {
		return Math.PI*(raio*raio);
	}
	@Override
	public double perimetro() {
		return 2*Math.PI*raio;
	}
	@Override
	public String getName() {
		
		return nome = "Circulo";
	}
}
