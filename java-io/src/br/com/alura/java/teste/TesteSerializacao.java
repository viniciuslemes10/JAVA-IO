package br.com.alura.java.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Vinicius Lemes de Olveira");
//		cliente.setCpf("13454846310");
//		cliente.setProfissao("Dev");
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNomeCpf());
		
		
	}

}
