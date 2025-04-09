package com.example.estruturados.encadeados;

public class App {
    public static void main(String[] args) {
        System.out.println("Teste: Fila Encadeada");
        FilaEncadeada filaEncadeada = new FilaEncadeada();
        filaEncadeada.insere(10);
        filaEncadeada.insere(20);
        filaEncadeada.insere(30);
        filaEncadeada.imprime();
        filaEncadeada.remove();
        filaEncadeada.imprime();

        System.out.println("Teste: Pilha Encadeada");
        PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
        pilhaEncadeada.insere(5);
        pilhaEncadeada.insere(15);
        pilhaEncadeada.insere(25);
        pilhaEncadeada.imprime();
        pilhaEncadeada.remove();
        pilhaEncadeada.imprime();

        System.out.println("Teste: Merge Encadeado");
        FilaEncadeada A = new FilaEncadeada();
        A.insere(10);
        A.insere(30);
        A.insere(50);
        System.out.println("Lista A");
        A.imprime();
        FilaEncadeada B = new FilaEncadeada();
        B.insere(20);
        B.insere(40);
        B.insere(60);
        System.out.println("Lista B");
        B.imprime();
        MergeEncadeado mergeEncadeado = new MergeEncadeado();
        System.out.println("Lista C");
        mergeEncadeado.mergeEncadeado(A, B).imprime();

        System.out.println("Teste: Merge com Vetor");
        Fila A2 = new Fila(5);
        A2.insere(5);
        A2.insere(15);
        A2.insere(25);
        System.out.println("Lista A");
        A2.imprime();
        Fila B2 = new Fila(5);
        B2.insere(10);
        B2.insere(20);
        B2.insere(30);
        System.out.println("Lista B");
        B2.imprime();
        MergeVetor mergeVetor = new MergeVetor();
        Fila filaMerge = mergeVetor.merge(A2, B2);
        System.out.println("Lista C");
        filaMerge.imprime();
    }
}
