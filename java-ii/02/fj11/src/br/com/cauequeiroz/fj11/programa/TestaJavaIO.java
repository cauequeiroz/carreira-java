package br.com.cauequeiroz.fj11.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaJavaIO {
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("leitura.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bf = new BufferedWriter(osw);
		
		String line = br.readLine();
		while(line != null) {
			bf.append(line);
			bf.newLine();
			line = br.readLine();
		}
		
		br.close();
		bf.close();
	}
}
