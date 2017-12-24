package testeIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(new FileOutputStream("saida.txt"));
		
		while(sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}
		
		sc.close();
		ps.close();
	}
}
