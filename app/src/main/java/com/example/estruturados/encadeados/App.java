package com.example.estruturados.encadeados;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Gostaria de executar o CRUD ou os testes automatizados?");
        System.out.println("Enter - CRUD");
        System.out.println("T - testes automatizados");
        System.out.println("V - Crud para o Merge estático");
        System.out.print(">");
        String linha = scanner.nextLine().toLowerCase();
        
        if(!linha.equals("\n") && !linha.equals("")){
            if(linha.charAt(0) == 't'){
                new Testes();
            }
            if(linha.charAt(0) == 'v'){
                new CrudVetorMerge();
            }
        }
        else{
            while(true){
                Crud crud = new Crud();
                crud.operacoes(scanner);
            }
        }
    }
}
