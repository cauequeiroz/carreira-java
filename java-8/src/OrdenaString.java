import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
	public static void main(String[] args) {
		System.out.println("Ordenando uma string.\n");
		
		List<String> words = new ArrayList<>();
		words.add("editora casa do código");
		words.add("caelum");
		words.add("alura online");
		
		System.out.println("Normal: " + words);
		
		Collections.sort(words);
		System.out.println("Alfabetica: " + words);
		
		
		Comparator<String> ordenaPorTamanho = new OrdenaPorTamanho();
		words.sort(ordenaPorTamanho);
		System.out.println("Tamanho: " + words);
		
		System.out.println("\nIterando por todos os itens.\n");
		
		Consumer<String> consumidor = new listaStrings();
		words.forEach(consumidor);		
	}
}

class listaStrings implements Consumer<String> {

	@Override
	public void accept(String string) {
		System.out.println("> " + string);
	}
	
}

class OrdenaPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		
		return 0;
	}
	
}
