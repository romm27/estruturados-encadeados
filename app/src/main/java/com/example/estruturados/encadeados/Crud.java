package com.example.estruturados.encadeados;

import java.util.Scanner;

/**
 *
 * @author giost
 */
public class Crud {
    FilaEncadeada filaEncadeadaA = new FilaEncadeada();
    FilaEncadeada filaEncadeadaB = new FilaEncadeada();
    PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
    boolean mostrarConteudo = true;
    char alvo;
    char operacao;
    int valor;
    
    public void operacoes(Scanner scanner){
        while(true){
            System.out.println("Gostaria de modificar a FilaA, FilaB ou a Pilha?");
            System.out.println("- Pilha(digite P):");
            if(mostrarConteudo){
                pilhaEncadeada.imprime();
            }
            System.out.println("- FilaA(digite A):");
            if(mostrarConteudo){
                filaEncadeadaA.imprime();
            }
            System.out.println("- FilaB(digite B):");
            if(mostrarConteudo){
                filaEncadeadaB.imprime();
            }
            System.out.println("- Digite m para mergear A com B");
            System.out.print("> ");
            String entrada = scanner.nextLine().trim().toLowerCase();
            
            boolean alvoInvalido = false;
            if(entrada.equals("\n") || entrada.equals("")){
                alvoInvalido = true;
            }
            else{
                alvo = entrada.charAt(0);
                
                if(!(alvo == 'f' || alvo == 'a' || alvo == 'b' || alvo == 'm')){
                    alvoInvalido = true;
                }
            }
            
            if(alvoInvalido){
                System.out.println("Alvo Invalido!");
                continue;
            }
            
            if(alvo == 'm'){
                System.out.println("Fazendo o merge entre A e B assumindo que ambas estão ordenadas...");
                new MergeEncadeado().mergeEncadeado(filaEncadeadaA, filaEncadeadaB).imprime();
                System.out.println("Digite enter para continuar...");
                scanner.nextLine();
                continue;
            }
            
            System.out.println("Qual operação gostaria de realizar?");
            System.out.println("I - Inserir");
            System.out.println("R - Remover");
            System.out.println("E - Exibir");
            System.out.print("> ");
            operacao = scanner.nextLine().toLowerCase().charAt(0);
            
            if(!(operacao == 'i' || operacao == 'r' || operacao == 'e' || operacao == 'm')){
                System.out.println("Operação invalida!");
                continue;
            }
            
            switch(operacao){
                case 'i':
                    System.out.println("Qual valor gostaria de inserir?");
                    System.out.print("> ");
                    if (scanner.hasNextInt()) {
                        valor = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Entrada inválida! Digite um número.");
                        scanner.nextLine();
                        continue;
                    }
                    
                    if(alvo == 'p'){
                        pilhaEncadeada.insere(valor);
                        System.out.println("O valor " + valor + " foi inserido com sucesso em Pilha!");
                    } else if(alvo == 'a') {
                        filaEncadeadaA.insere(valor);
                        System.out.println("O valor " + valor + " foi inserido com sucesso na FilaA!");
                    } else {
                        filaEncadeadaB.insere(valor);
                        System.out.println("O valor " + valor + " foi inserido com sucesso na FilaB!");
                    }
                    break;
                case 'r':
                    if(alvo == 'p'){
                        pilhaEncadeada.remove();
                    } else if(alvo == 'a') {
                        filaEncadeadaA.remove("A");
                    } else {
                        filaEncadeadaB.remove("B");
                    }
                    break;
                case 'e':
                    if(alvo == 'p'){
                        System.out.println("Pilha:");
                        pilhaEncadeada.imprime();
                    } else if(alvo == 'a') {
                        System.out.println("FilaA:");
                        filaEncadeadaA.imprime();
                    } else {
                        System.out.println("FilaB:");
                        filaEncadeadaB.imprime();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
