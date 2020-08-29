package com.Bolha;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 ArrayList<Integer> lista = new ArrayList<>();
	 Scanner scanner = new Scanner(System.in);

	 System.out.println("Digite o tamanho do Array: ");
	 int array = scanner.nextInt();

	 for(int i = 0; i < array; i++) {
         System.out.println("Digite um numero: ");
         int valor =  scanner.nextInt();
         lista.add(valor);
     }
	 System.out.println(lista);

	 for(int i = 0; i < lista.size(); i++) {
	     for(int j = 0; j < lista.size() - 1; j++) {
	         if (lista.get(j) > lista.get(j + 1)){
	             Integer memory = lista.get(j);
	             lista.set(j, lista.get(j + 1));
	             lista.set(j + 1, memory);
             }
         }
     }
        System.out.println(lista);
    }
}
