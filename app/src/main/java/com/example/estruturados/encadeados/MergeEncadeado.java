package com.example.estruturados.encadeados;

public class MergeEncadeado { 
    public FilaEncadeada mergeEncadeado(FilaEncadeada a, FilaEncadeada b) {
        FilaEncadeada resultado = new FilaEncadeada();
        
        if (a.vazia() && b.vazia()) {
            return resultado;
        }

        Integer valorA = null;
        Integer valorB = null;

        if (!a.vazia()) valorA = a.remove();
        if (!b.vazia()) valorB = b.remove();

        while (valorA != null || valorB != null) {
            if (valorA != null && (valorB == null || valorA <= valorB)) {
                resultado.insere(valorA);
                valorA = a.vazia() ? null : a.remove();
            } else {
                resultado.insere(valorB);
                valorB = b.vazia() ? null : b.remove();
            }
        }

        return resultado;
    }
}
