package br.com.alura.java.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException  {
			
//    	//fluxo de entrada com arquivo 
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
			
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Olá Victor, Tudo bem?");
		bw.newLine();
		bw.write("Eu estou bem e você?");
		
		bw.close();
			
		
	}
}
