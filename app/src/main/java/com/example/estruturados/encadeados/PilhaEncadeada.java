package com.example.estruturados.encadeados;

public class PilhaEncadeada {
    public Integer dado;
    public Node pilha;
    
    public PilhaEncadeada(){
        dado = null;
        pilha = null;
    }
    
    public void insere(Integer dado){
        if(pilha != null){
        Node atual = pilha.pegarFimDaNode();
        atual.proximo = new Node(dado);
        }
        else{
            pilha = new Node(dado);
        }
    }
    
    public Integer remove(){
        if(pilha == null){
            return 0;
        }
        
        Node ultimaNode = null;
        Node atual = pilha;
        
        while(atual.proximo != null){
            ultimaNode = atual;
            atual = atual.proximo;
        }
        
        if(ultimaNode != null){
            ultimaNode.proximo = null; //Aviso do netbeans "Dereferencing possible null pointer" pesquisei mas não entendi direito o que significa.
        }
        else{
            pilha = null;
        }
        return atual.dado;
    }
    
    public void imprime(){
        Node atual = pilha;
        
        while(atual != null){
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
}
