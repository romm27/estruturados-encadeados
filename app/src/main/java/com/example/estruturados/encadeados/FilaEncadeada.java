package com.example.estruturados.encadeados;

class FilaEncadeada {
    public Node lista;
    
    public FilaEncadeada(){
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
    
    public boolean vazia(){
        return lista == null;
    }
    
    public Integer remove(){
        return remove("");
    }
    
    public Integer remove(String nome){
        if(lista == null){
            return 0;
        }
        
        Node atual = lista;
        lista = atual.proximo; //<---- Li em todo lugar que apenas remover qualquer referencia a uma instancia automaticamente marca uma instancia para ser destruida pelo garbage collector, se puder confirmar isso em sala eu agradeço.
        System.out.println("Valor removido:" + atual.dado.toString() + " de Fila " + nome + "!");
        return atual.dado;
    }
    
    public void imprime(){
        if(lista == null){
            System.out.println("Fila vazia!");
            return;
        }
        
        Node atual = lista;
        
        while(atual != null){
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
}
