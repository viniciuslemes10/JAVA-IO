package br.com.alura.java.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class TesteEscrita {

	public static void main(String[] args) throws IOException  {
			
				//fluxo de entrada com arquivo 
			OutputStream fos = new FileOutputStream("lorem2.txt");
			Writer osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
			//bw.newLine();
			bw.newLine();
			bw.write("hugreeçglh fgoor sojg	");
			
			bw.close();
			
			InputStream fis = new FileInputStream("lorem2.txt");
			Reader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			
			String linha = br.readLine();
			
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}	
			br.close();
	}

}
