import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {
	public static void main(String[] args) {
		System.out.println("Ordenando uma string.");
		
		List<String> words = new ArrayList<>();
		words.add("editora casa do código");
		words.add("caelum");
		words.add("alura online");
		
		System.out.println("Normal: " + words);
		
		words.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println("Alfabetica: " + words);
		
		words.sort(Comparator.comparing(String::length));
		System.out.println("Tamanho: " + words);
		
		System.out.println("\nListando os items.");
		words.forEach(System.out::println);		
	}
}
