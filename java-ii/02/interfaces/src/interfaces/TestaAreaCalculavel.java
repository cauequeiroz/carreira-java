package interfaces;

public class TestaAreaCalculavel {
	public static void main(String[] args) {
		AreaCalculavel circulo = new Circulo(5);
		System.out.println(circulo.calculaArea());
	}
}
