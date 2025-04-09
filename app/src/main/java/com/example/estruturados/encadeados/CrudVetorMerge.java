package com.example.estruturados.encadeados;

import java.util.Scanner;

public class CrudVetorMerge {
    public CrudVetorMerge() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Capacidade da Fila A: ");
        int capacidadeA = scanner.nextInt();
        Fila filaA = new Fila(capacidadeA);
        
        System.out.print("Capacidade da Fila B: ");
        int capacidadeB = scanner.nextInt();
        Fila filaB = new Fila(capacidadeB);

        System.out.println("Digite os valores para a Fila A:");
        while (!filaA.cheia()) {
            filaA.insere(scanner.nextInt());
        }

        System.out.println("Digite os valores para a Fila B:");
        while (!filaB.cheia()) {
            filaB.insere(scanner.nextInt());
        }

        MergeVetor mergeVetor = new MergeVetor();
        Fila resultado = mergeVetor.merge(filaA, filaB);
        
        System.out.println("Fila C:");
        resultado.imprime();

        scanner.close();
    }
}
