package com.example.estruturados.encadeados;

public class Fila {
    private int primeiro = -1;
    private int ultimo = -1;
    private int tamanho = 0;
    private int[] dados;
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
    }

    public boolean cheia() { 
        return tamanho == capacidade; 
    }
    
    public boolean vazia() {
        return tamanho == 0; 
    }

    public void insere(int valor) {
        if (cheia()){
            System.out.println("Pilha cheia!");
            return;
        }
        
        if (vazia()){
            primeiro = 0;
        }
        
        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = valor;
        tamanho++;
    }

    public int remove() {
        if (vazia()){
            System.out.println("Pilha vazia!");
            return -1;
        }
        int removido = dados[primeiro];
        
        if (primeiro == ultimo){
            primeiro = ultimo = -1;
        }
        else{
            primeiro = (primeiro + 1) % capacidade;
        }
        tamanho--;
        return removido;
    }

    public void imprime() {
        if(vazia()){
            System.out.println("Pilha vazia!");
            return;
        }
        
        for (int i = 0; i < tamanho; i++){
            System.out.println(dados[(primeiro + i) % capacidade]);
        }
    }
}