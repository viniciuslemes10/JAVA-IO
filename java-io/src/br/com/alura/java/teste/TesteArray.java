
package br.com.alura.java.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteArray {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> postosDeGasolina = new ArrayList<>();
        postosDeGasolina.add(2);
        postosDeGasolina.add(10);
        postosDeGasolina.add(15);
        postosDeGasolina.add(22);
        
        Scanner posto = new Scanner(System.in);
        int combustivel, consumo;
        
        System.out.printf("Combustivel (em litros): ");
        combustivel = posto.nextInt();
        
        System.out.printf("Consumo médio (km/l): ");
        consumo = posto.nextInt();

        int total = combustivel * consumo;
        
        if(total >= 2.0 && total < 10.2) {
            System.out.println("Postos de Gasolina (km): [2, 15, 22, 10.2] " + 
                    "Primeiro posto: " + postosDeGasolina.get(0)); 
        }
        
        if(total >= 10.2 && total <= 14.0) {
            System.out.println("Postos de Gasolina (km): [2, 15, 22, 10.2] " + 
                    "Segundo posto: " + postosDeGasolina.get(1)); 
        }
        
        if(total >= 15 && total < 22) {
            System.out.println("Postos de Gasolina (km): [2, 15, 22, 10.2] " + 
                    "Terceiro posto: " + postosDeGasolina.get(2));
        }
        
        if(total == 22) {
            System.out.println("Postos de Gasolina (km): [2, 15, 22, 10.2] " + 
                    "Quarto posto: " + postosDeGasolina.get(3));
        }    
        
        else {
            System.out.println("Nenhum posto próximo a sua localização!");
        }
    } 

}
