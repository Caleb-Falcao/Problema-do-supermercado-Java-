package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class main {

    //constante
    private static int SIZE = 3;

    public static void main(String[] args) {
        //ler entrada de dado com scanner
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        //opcao para selecionar algo no sistema
        int opcao;

        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item a ser inserido: ");
                    String item = scanner.next(); //only simple words
                    //adicionar item
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.print("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermarket.deletar(index);
                    break;
                case 4:
                    System.out.print("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");

            }
        } while(opcao != 4);
        //Fechar o scanner
        scanner.close();
    }
}
