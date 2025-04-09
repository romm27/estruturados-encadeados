package com.example.estruturados.encadeados;

public class MergeEncadeado {
    public ListaEncadeada mergeEncadeado(ListaEncadeada a, ListaEncadeada b){
        ListaEncadeada resultado = new ListaEncadeada();
        
        Node nodeA = a.lista;
        Node nodeB = b.lista;
        
        while(nodeA != null || nodeB != null){
           if(nodeA != null && nodeB != null){
                if(nodeA.dado < nodeB.dado){
                    resultado.insere(nodeA.dado);
                    nodeA = nodeA.proximo;
                }
                else{
                    resultado.insere(nodeB.dado);
                    nodeB = nodeB.proximo;
                }
           }
           else{
                Node nodeRestante = nodeA == null? nodeB : nodeA;
                nodeA = null;
                nodeB = null;

                while(nodeRestante != null){
                    resultado.insere(nodeRestante.dado);
                    nodeRestante = nodeRestante.proximo;
                }
            }
        }
        
        return resultado;
    }
}
