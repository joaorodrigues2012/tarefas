package exercicio_para_entregar;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Quadrado(5,5));
		figuras.add(new Retangulo(12,4));
		figuras.add(new Losango(8,6));
		figuras.add(new Trapezio(4,4,8));
		figuras.add(new Circulo(4));
		figuras.add(new Triangulo(12,8));
		for(Figura fig:figuras) {
			System.out.println(fig.getName());
			System.out.println("Area: "+fig.area());
			System.out.println("Perimetro: "+fig.perimetro()+"\n");
			if(fig instanceof Diagonal) {
				System.out.println("Diagonal: "+((Diagonal)fig).calculaDiagonal()+"\n");
			}
		}
		
		
		Cubo cubo = new Cubo(0, null, null);
		Quadrado quadrado = new Quadrado(0,0);
		quadrado.setAltura(2);
		quadrado.setBase(2);
		cubo.base = quadrado;
		cubo.altura = quadrado;
		cubo.setAltura2(2);
		System.out.println(cubo.getName());
		System.out.println("Area: "+cubo.area());
		System.out.println("Perimetro: "+cubo.perimetro());
		System.out.println("Volume: "+cubo.volume()+"\n");
		
		Esfera esfera = new Esfera(null);
		Circulo circulo = new Circulo(0);
		circulo.setRaio(2);
		esfera.raio = circulo;
		System.out.println(esfera.getName());
		System.out.println("Area: "+esfera.area());
		System.out.println("Perimetro: "+esfera.perimetro());
		System.out.println("Volume: "+esfera.volume()+"\n");
		
		Cilindro cilindro = new Cilindro(null,0);
		Circulo circulo2 = new Circulo(0);
		circulo2.setRaio(2);
		cilindro.setAltura(4);
		cilindro.raio = circulo2;
		System.out.println(cilindro.getName());
		System.out.println("Area: "+cilindro.area());
		System.out.println("Volume: "+cilindro.volume()+"\n");
		
		Piramide piramide = new Piramide(null,null,0);
		Quadrado quadrado2 = new Quadrado(0,0);
		quadrado2.setBase(4);
		quadrado2.setAltura(4);
		piramide.base = quadrado2;
		piramide.altura = quadrado2;
		piramide.setAltura2(8);
		System.out.println(piramide.getName());
		System.out.println("Area: "+piramide.area());
		System.out.println("Perimetro: "+piramide.perimetro());
		System.out.println("Volume: "+piramide.volume()+"\n");
	}
}
