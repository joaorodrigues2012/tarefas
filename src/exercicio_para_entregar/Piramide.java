package exercicio_para_entregar;

public class Piramide {
	Quadrado base;
	Quadrado altura;
	double altura2;
	String nome;
	public Piramide(Quadrado base, Quadrado altura, double altura2) {
		this.base = base;
		this.altura = altura;
		this.altura2 = altura2;
	}
	public double calculaLado() {
		return Math.sqrt(Math.pow(base.getBase()/2,2)+Math.pow(calculaAltLado(), 2));
	}
	public double calculaAltLado() {
		return Math.sqrt(Math.pow(base.getBase()/2, 2)+Math.pow(altura.getAltura(), 2));
	}
	public double volume() {
		return (base.getBase()*altura.getAltura() * altura2)/3;
	}
	public double area() {
		
		return (base.getBase()*altura.getAltura())+4*((base.getBase()*calculaAltLado())/2);
	}
	public double perimetro() {
		return (2*(base.getBase()+altura.getAltura()))+(4*calculaLado());
	}
	public double getAltura2() {
		return altura2;
	}
	public void setAltura2(double altura2) {
		this.altura2 = altura2;
	}
	public String getName() {
		return nome = "Piramide";
	}
}
