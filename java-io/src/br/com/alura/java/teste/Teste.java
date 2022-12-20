package br.com.alura.java.teste;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.name());
		//StandardCharsets.UTF_8.name() é um metodo para definir qual Encoding utilizar.
		
		
		while(sc.hasNext()) {
		String linha = sc.nextLine();
		//System.out.println(linha);
		
		Scanner linhaScanner = new Scanner(linha);
		linhaScanner.useLocale(Locale.US);
		linhaScanner.useDelimiter(",");
		
		String tipoConta = linhaScanner.next();
		int agencia = linhaScanner.nextInt();
		int numero = linhaScanner.nextInt();
		String titular = linhaScanner.next();
		double saldo = linhaScanner.nextDouble();
		
		System.out.format(new Locale("pt","BR"),"%s - %04d-%04d, %20s: R$ %08f %n", 
												tipoConta, agencia, numero, titular, saldo);
		linhaScanner.close();
		
//		String valores = linha.split(",");
//		System.out.println(valores[3]);
		
		}
		sc.close();
	} 

}
