package com.example.estruturados.encadeados;

public class ListaEncadeada { //Não entendi se podia usar a fila para implementar o merge, por isso fez essa classe de lista separada.
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
    
    //public void remove(int index){} <--- Sem implementação de remove para seguir exemplo do professor.
    
    public void imprime(){
        Node atual = lista;
        
        while(atual != null){
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
    
    public Integer pegar(int index){
        int contador = 0;
        Node atual = lista;
        while(atual != null){
            if(index == contador){
                return atual.dado;
            }
            atual = atual.proximo;
            contador++;
        }
        System.out.println("Erro: Index fora do tamanho da fila");
        return null;
    }
}
