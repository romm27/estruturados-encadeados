package com.example.estruturados.encadeados;

public class App {
    public static void main(String[] args) {
        Fila A = new Fila(10);
        A.insere(0);
        A.insere(2);
        A.insere(4);
        A.insere(6);
        A.insere(8);
        A.insere(9);
        A.insere(10);
        System.out.println("A:");
        A.imprime();

        Fila B = new Fila(10);
        B.insere(1);
        B.insere(3);
        B.insere(5);
        B.insere(7);
        B.insere(9);
        B.insere(11);
        B.insere(13);
        System.out.println("B:");
        B.imprime();

        System.out.println("C:");
        new MergeVetor().merge(A, B).imprime();
    }
}
