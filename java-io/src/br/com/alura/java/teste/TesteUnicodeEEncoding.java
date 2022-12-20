package br.com.alura.java.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String s = "A";
		System.out.println(s.codePointAt(0)); //s.codePointAt � para identificar o 
		Charset charset = Charset.defaultCharset();  //n�mero do Unicode.
		System.out.println(charset); //Esse mostra qual econding que est� sendo utlizado.
													
		byte[] bytes = s.getBytes("windows-1252");	//mostrar a quantidade de bytes.
		System.out.print(bytes.length + ", windows-1252 ");	// com length a gente vê a quantidade de Bytes.
		String sNovo = new String(bytes, "windows-1252");	//aqui você está fazendo o reverso, tranformando bytes em letras.				
		System.out.println(sNovo);
		
		
		bytes = s.getBytes("UTF-16");//mostra os bytes
		System.out.print(bytes.length + ", UTF-16 "); //mostra Encoding
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8 ");
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo); //Tranforma em letra
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo); //transforma em letra
		
		//Quando for definir no(new String(bytes, Encoding))
		//um Encoding e ele for diferente na hora de mostra com s.getBytes(),
		// ele pode não saber identificar a String que você definiu, dando "???".
		
//		//EXEMPLO:
//		bytes =  s.getBytes("windows-1252");
//		System.out.print(bytes.length + ", windows-1252 ");
//		sNovo = new String(bytes, "US_ASCII");
//		System.out.println(sNovo);
	}

}
