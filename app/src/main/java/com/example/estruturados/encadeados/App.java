/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.estruturados.encadeados;

public class App {

    public static void main(String[] args) {
        ListaEncadeada A = new ListaEncadeada();
        A.insere(10);
        A.insere(30);
        A.insere(50);
        A.insere(70);
        A.insere(90);
        A.insere(110);
        A.insere(120);
        A.insere(120);
        
        ListaEncadeada B = new ListaEncadeada();
        B.insere(20);
        B.insere(40);
        B.insere(100);
        B.insere(133);
        
        new MergeEncadeado().mergeEncadeado(A, B).imprime();
    }
}
