package exercicio_para_entregar;

public class Cilindro {
	Circulo raio;
	double altura;
	String nome;
	public Cilindro(Circulo raio,double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double area() {
		return 2*Math.PI*raio.getRaio()*(raio.getRaio()+altura);
	}
	public double volume() {
		return Math.PI*Math.pow(raio.getRaio(), 3)*altura;
	}
	public String getName() {
		return nome = "Cilindro";
	}
}
