package br.com.alura.java.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

        // fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//
//        FileWriter fw = new FileWriter("lorem2.txt");
//        BufferedWriter bws = new BufferedWriter(fw);

        PrintStream ps = new PrintStream("lorem2.txt");
//        PrintWriter psm = new PrintWriter("lorem2.txt", "UTF-8");
        ps.println("Vinicius");
        ps.println();
        ps.println();
        ps.println("Eu estou bem e você?");

        ps.close();
        
        

    }
}
