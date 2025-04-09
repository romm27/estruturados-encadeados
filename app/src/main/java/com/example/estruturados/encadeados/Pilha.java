package com.example.estruturados.encadeados;

public class Pilha {
    private final int capacidade;
    private int topo;
    private int[] dados;
    
    public Pilha(int capacidade){
        this.capacidade = capacidade;
        dados = new int[capacidade];
    }
    
    public boolean vazia(){
        return topo == -1;
    }
    
    public boolean cheia(){
        return topo == capacidade -1;
    }
    
    public boolean insere(int valor){
        if(cheia()){
            System.out.println("Tamanho da fila insuficiente!");
            return false; //<---- lidar com caso de tamanho insuficiente externamente
        }
        else{
            dados[topo] = valor;
            topo += 1;
            return true;
        }
    }
    
    public int remove(){
        if(vazia()){
            System.out.println("A pilha está vazia!");
            return 0;
        }
        else{
            topo -= 1;
            return dados[topo + 1];
        }
    }
    
    public void imprime(){
        for(int i = 0; i < topo; i++){
            System.out.println(dados[i]);
        }
    }
}