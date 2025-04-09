package com.example.estruturados.encadeados;

public class MergeVetor {
    public Fila merge(Fila a, Fila b) {
        Fila resultado = new Fila(a.capacidade + b.capacidade);

        if (a.vazia() && b.vazia()) {
            return resultado;
        }

        boolean temA = !a.vazia();
        boolean temB = !b.vazia();

        int valorA = temA ? a.remove() : 0;
        int valorB = temB ? b.remove() : 0;

        while (temA || temB) {
            if (temA && (!temB || valorA <= valorB)) {
                resultado.insere(valorA);
                if (!a.vazia()) {
                    valorA = a.remove();
                } else {
                    temA = false;
                }
            } else {
                resultado.insere(valorB);
                if (!b.vazia()) {
                    valorB = b.remove();
                } else {
                    temB = false;
                }
            }
        }

        return resultado;
    }
}
