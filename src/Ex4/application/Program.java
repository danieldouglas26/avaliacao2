/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Ex4.application;

import java.util.ArrayList;
import java.util.Scanner;
import Ex4.entities.Pagamento;
import Ex4.entities.Produto;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Produto produto = new Produto("Cafe expresso", 0.75);
        Produto produto1 = new Produto("Cafe caputino", 1);
        Produto produto2 = new Produto("Leite com cafe", 1.25);
        Produto produto3 = new Produto("Chocolate quente", 3);
        Produto produto4 = new Produto("Leite com toddy", 2);
        Produto produto5 = new Produto("Cha", 2.6);
        
  
     

        int opcaoMenu;

        do {
            System.out.println("Forneca uma opcao: ");
            System.out.println("1 - Comprar produtos");
            System.out.println("2 - Pagar");
            System.out.println("3 - Sair");
            System.out.println();
            System.out.print("Digite uma opcao: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
              
                case 1:

                    // Lógica para remover produtos
                    System.out.println(); // Espaço entre o menu e a opcao
                    System.out.println("Escolha o número do produto que deseja adicionar à conta:");
                    System.out.println(" 1 - " + produto.exibirDados());
                    System.out.println(" 2 - " + produto1.exibirDados());
                    System.out.println(" 3 - " + produto2.exibirDados());
                    System.out.println(" 4 - " + produto3.exibirDados());
                    System.out.println(" 5 - " + produto4.exibirDados());
                    System.out.println(" 6 - " + produto5.exibirDados());
                    
                    System.out.println();
                    System.out.print("Escolha uma opcao: ");
                    int escolhaProduto = sc.nextInt();
                    String nomeProduto = "";
                    //escolhaProduto -= 1;
                    if (escolhaProduto >= 1 && escolhaProduto <= 6) {

                        if (escolhaProduto == 1) {
                            Pagamento.adicionarAoTotal(produto.getPreco());
                            nomeProduto = produto.getNome();
                        } else if (escolhaProduto == 2) {
                            Pagamento.adicionarAoTotal(produto1.getPreco());
                            nomeProduto = produto1.getNome();
                        }
                        if (escolhaProduto == 3) {
                            Pagamento.adicionarAoTotal(produto2.getPreco());
                            nomeProduto = produto2.getNome();
                        }
                        if (escolhaProduto == 4) {
                            Pagamento.adicionarAoTotal(produto3.getPreco());
                            nomeProduto = produto3.getNome();
                        }
                        if (escolhaProduto == 5) {
                            Pagamento.adicionarAoTotal(produto4.getPreco());
                            nomeProduto = produto4.getNome();
                        }
                        if (escolhaProduto == 6) {
                            Pagamento.adicionarAoTotal(produto5.getPreco());
                            nomeProduto = produto5.getNome();
                        }

                        System.out.println("Produto adicionado à conta: " + nomeProduto);
                    } else {
                        System.out.println("Escolha inválida!");
                    }

                    break;

                case 2:
                    System.out.println(); // Espaço entre o menu e a opcao

                    if (Pagamento.total != 0.0) {
                        System.out.println("Total a pagar: " + Pagamento.total + " R$");
                        System.out.println();
                        System.out.println("1 - Pagar parcialmente");
                        System.out.println("2 - Pagar total");
                        System.out.println("");
                        opcaoMenu = 0;

                        opcaoMenu = sc.nextInt();

                        if (opcaoMenu == 1) {
                            System.out.print("Digite a quantidade que deseje pagar: ");
                            double valor = sc.nextDouble();
                            Pagamento.Pagamento(valor);
                        } else if (opcaoMenu == 2) {
                            System.out.print("Digite o total a ser pago: ");
                            double valor = sc.nextDouble();
                            if (valor != Pagamento.total) {
                                System.out.println("Valor abaixo do valor da conta!");
                            } else {
                                Pagamento.Pagamento(valor);
                                System.out.println("Conta paga!");
                                System.out.println();
                            }
                        }

                    } else {
                        System.out.println("Conta já paga ou zerada!");
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            if (Pagamento.total != 0.0) {
                System.out.println("Alerta! Conta em aberto, Finalize antes de sair");
            }

        } while (opcaoMenu != 4 || Pagamento.total != 0.0);
    }
}
