package exercicio_para_entregar;

public class Esfera {
	Circulo raio;
	String nome;
	public Esfera(Circulo raio) {
		this.raio = raio;
	}
	public double area() {
		return 4*Math.PI*raio.getRaio();
	}
	public double perimetro() {
		return 2*Math.PI*raio.getRaio();
	}
	public double volume() {
		return (4/3)*Math.PI*Math.pow(raio.getRaio(), 3);
	}
	public String getName() {
		return nome = "Esfera";
	}
}
