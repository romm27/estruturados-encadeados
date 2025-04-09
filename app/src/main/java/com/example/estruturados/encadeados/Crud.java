package com.example.estruturados.encadeados;

import java.util.Scanner;

/**
 *
 * @author giost
 */
public class Crud {
    FilaEncadeada filaEncadeada = new FilaEncadeada();
    PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
    boolean mostrarConteudo = true;
    char alvo;
    char operacao;
    int valor;
    public void operacoes(Scanner scanner){
        while(true){
            System.out.println("Gostaria de modificar a Fila ou a Pilha?");
            System.out.println("Pilha(digite P):");
            if(mostrarConteudo){
                pilhaEncadeada.imprime();
            }
            System.out.println("Fila(digite F):");
            if(mostrarConteudo){
                filaEncadeada.imprime();
            }
            System.out.print(">");
            alvo = scanner.nextLine().toLowerCase().charAt(0);
            
            if(!(alvo == 'p' || alvo == 'f')){
                System.out.println("Alvo invalido!");
                continue;
            }
            
            System.out.println("Qual operação gostaria de realizar?");
            System.out.println("I - Inserir");
            System.out.println("R - Remover");
            System.out.println("E - Exibir");
            System.out.print(">");
            operacao = scanner.nextLine().toLowerCase().charAt(0);
            
            if(!(operacao == 'i' || operacao == 'r' || operacao == 'e')){
                System.out.println("Operação invalida!");
                continue;
            }
            
            switch(operacao){
                case 'i':
                    System.out.println("Qual valor gostaria de inserir?");
                    System.out.print(">");
                    valor = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(alvo == 'p'){
                        pilhaEncadeada.insere(valor);
                        System.out.println("O valor " + valor + " foi inserido com sucesso em Pilha!");
                    }
                    else{
                        filaEncadeada.insere(valor);
                        System.out.println("O valor " + valor + " foi inserido com sucesso em Fila!");
                    }
                    break;
                case 'r':
                    if(alvo == 'p'){
                        pilhaEncadeada.remove();
                    }
                    else{
                        filaEncadeada.remove();
                    }
                    break;
                case 'e':
                    if(alvo == 'p'){
                        System.out.println("Pilha:");
                        pilhaEncadeada.imprime();
                    }
                    else{
                        System.out.println("Fila:");
                        filaEncadeada.imprime();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
