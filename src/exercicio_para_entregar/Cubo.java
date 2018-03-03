package exercicio_para_entregar;

public class Cubo{
	double altura2;
	Quadrado base, altura;
	String nome;
	
	public Cubo(double altura2, Quadrado base, Quadrado altura) {
		this.altura2 = altura2;
		this.base = base;
		this.altura = altura;
		
		
	}

	public double volume() {
		return base.getBase()*altura.getAltura() * altura2;
	}
	public double area() {
		
		return 6*base.getBase()*altura.getAltura();
	}
	public double perimetro() {
		return 12*base.getBase();
	}
	public double getAltura2() {
		return altura2;
	}
	public void setAltura2(double altura2) {
		this.altura2 = altura2;
	}
	public String getName() {
		return nome = "Cubo";
	}
}
