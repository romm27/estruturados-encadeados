package com.example.estruturados.encadeados;

public class ListaEncadeada { //Não entendi se podia usar a fila para implementar o merge, por isso fez essa classe de fila separada.
    public Node lista;
    
    public ListaEncadeada(){
        lista = null;
    }
    
    public void insere(Integer elemento){
        if(lista != null){
        Node atual = lista.pegarFimDaNode();
        atual.proximo = new Node(elemento);
        }
        else{
            lista = new Node(elemento);
        }
    }
    
    public void remove(int index){
        
    }
    
    public void imprime(){
        Node atual = lista;
        
        while(atual != null){
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
}
