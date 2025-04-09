package com.example.estruturados.encadeados;

public class Node {
    public Integer dado;
    public Node proximo;
    
    public Node(Integer dado){
        this.dado = dado;
        proximo = null;
    }
    
    public Node pegarFimDaNode(){
        Node atual = this;
        
        while(atual.proximo != null){
            atual = atual.proximo;
        }
        
        return atual;
    }
    
    public int pegarTamanhoRestanteEstrutura(){
        int contador = 0;
        Node atual = this;
        
        while(atual.proximo != null){
            atual = atual.proximo;
            contador++;
        }
        return contador;
    }
}
