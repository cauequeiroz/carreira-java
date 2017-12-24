package br.com.cauequeiroz.fj11.programa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream(new FileOutputStream("saida.txt"));
		
		while(sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}
		
		sc.close();
		ps.close();
		
	}
}
