package com.ordem_de_servico;

import java.util.Scanner;



public class OrdemServico {
    Scanner sc = new Scanner(System.in);
    ListaEncadeada LE = new ListaEncadeada();
    Fila fl = new Fila();
    Pilha pi = new Pilha();
    Arvore ar = new Arvore();
    int id_servico;
    String nome_servico;
    int choice = 0;
    // Executa Programa 
    public void Executar() {
        OrdemServico os = new OrdemServico();
        Scanner sc = new Scanner(System.in);

        while (choice != 5) {
            System.out.println("Seja Bem vindo a ordem de serviço LTDA \n Qual Estrutura deseja utilizar? ");
            System.out.println("1-Lista Encadeada  2-Fila  3-Pilha  4-Árvore 5-Sair");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    os.Ordem_De_servico_LE();
                    break;
                case 2:
                    os.Ordem_De_servico_FL();
                    break;
                case 3:
                    os.Ordem_De_servico_Pi();
                    break;
                case 4:
                    os.Ordem_De_servico_Ar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    // Classe Para Lista encadeada 
    public void Ordem_De_servico_LE() {
        int condicao = 0;

        while (condicao != 6) {
            System.out.println("Seja Bem vindo a Ordem de Serviço - Lista Encadeada");
            System.out.println("1- Nova Ordem 2-Listar Ordem 3-Percorrer 4-Pesquisar 5-Excluir 6-Sair");
            condicao = sc.nextInt();

            if (condicao == 1) {
                // Insere Elemento
                System.out.println("Digite o nome da ordem ");
                sc.nextLine();
                String name = sc.nextLine();
                setNome_servico(name);

                LE.inserir(getNome_servico());
                System.out.println("Ordem Adicionada!");

            } else if (condicao == 2) {
                //Lista Elemento
                System.out.println("Lista é : \n");
                LE.listarTodos();

            } else if (condicao == 3) {
                //Pecorre Elemento
                System.out.println("Percorrendo..");
                LE.listarPausadamente();

            } else if (condicao == 4) {
                //Pesquisa Elemento 
                sc.nextLine(); 
                System.out.println("Digite o item para pesquisar");
                String elementoPesquisar = sc.nextLine();
                if (LE.pesquisar(elementoPesquisar)) {
                    System.out.println("Elemento encontrado: " + elementoPesquisar);
                } else {
                    System.out.println("Elemento não encontrado: " + elementoPesquisar);
                }
            } else if (condicao == 5) {
                //Exclui Elemento
                LE.listarTodos();
                System.out.println("Digite o item que você quer deletar.");
                sc.nextLine();
                String Apagar_selecao = sc.nextLine();
                LE.excluir(Apagar_selecao);
                LE.listarTodos();
            }
        }
    }
    //Classe Para Fila
    public void Ordem_De_servico_FL() {
        int condicao = 0;
        while (condicao != 6) {
            System.out.println("Seja Bem vindo a Ordem de Serviço - Fila");
            System.out.println("1- Nova Ordem 2-Listar Ordem 3-Percorrer 4-Pesquisar 5-Excluir 6-Sair");
            condicao = sc.nextInt();

            if (condicao == 1) {
                // Insere Elemento
                System.out.println("digite o nome da ordem ");
                sc.nextLine();
                String name = sc.nextLine();
                setNome_servico(name);

                fl.inserir(name);
                System.out.println("Ordem Adicionada!");

            } else if (condicao == 2) {
                // Lista Elemento
                System.out.println("Lista é : \n");
                fl.listarElementos();

            } else if (condicao == 3) {
                // Pecorre Elemento
                System.out.println("Percorrendo..");
                fl.percorrerPausadamente();

            } else if (condicao == 4) {
                // Pesquisa Elemento
                sc.nextLine();
                System.out.println("Digite o item para pesquisar");
                String elementoPesquisar = sc.nextLine();
                if (fl.pesquisar(elementoPesquisar)) {
                    System.out.println("Elemento encontrado: " + elementoPesquisar);
                } else {
                    System.out.println("Elemento não encontrado: " + elementoPesquisar);
                }

            } else if (condicao == 5) {
                // Exclui Elemento
                System.out.println("Digite a ordem  que voce quer deletar.");
                sc.nextLine();
                String Apagar_selecao = sc.nextLine();
                fl.excluir(Apagar_selecao);
                System.out.println("Ordem deletada");

            }
        }
    }
    //Classe para Pilha
    public void Ordem_De_servico_Pi() {
        
        int condicao = 0;
        while (condicao != 6) {

            System.out.println("Seja Bem vindo a Ordem de Serviço - Pilha");
            System.out.println("1- Nova Ordem 2-Listar Ordem 3-Percorrer 4-Pesquisar 5-Excluir 6-Sair");
            condicao = sc.nextInt();

            if (condicao == 1) {
                //Insere Elemento
                System.out.println("digite o nome da ordem ");
                sc.nextLine();
                String name = sc.nextLine();
                setNome_servico(name);
                pi.inserir(name);
                System.out.println("Ordem Adicionada!");
            } else if (condicao == 2) {
                // Lista Elementos 
                System.out.println("Lista é : \n");
                pi.listarElementos();
            } else if (condicao == 3) {
                //Pecorre Elemento
                System.out.println("Percorrendo..");
                pi.percorrerPausadamente();
            } else if (condicao == 4) {
                //Pesquisa Elementos
                sc.nextLine(); 
                System.out.println("Digite o item para pesquisar");
                String elementoPesquisar = sc.nextLine();
                if (pi.pesquisar(elementoPesquisar)) {
                    System.out.println("Elemento encontrado: " + elementoPesquisar);
                } else {
                    System.out.println("Elemento não encontrado: " + elementoPesquisar);
                
                }}  if (condicao == 5) {
                    //Exclui Elemento
                    System.out.println("Digite a ordem que você quer deletar:");
                    sc.nextLine();
                    String Apagar_selecao = sc.nextLine();
                    pi.excluir(Apagar_selecao);
                    System.out.println("Ordem deletada");
                }
            }
        }
    

    public void Ordem_De_servico_Ar() {
        int condicao = 0;
        while (condicao != 6) {
            System.out.println("Seja Bem vindo a Ordem de Serviço - Árvore");
            System.out.println("1- Nova Ordem 2-Listar Ordem 3-Percorrer 4-Pesquisar 5-Excluir 6-Sair");
            condicao = sc.nextInt();

            if (condicao == 1) {
                System.out.println("Digite o nome da ordem ");
                sc.nextLine();
                String name = sc.nextLine();
                setNome_servico(name);
                ar.inserir(name);
                System.out.println("Ordem Adicionada!");
            } else if (condicao == 2) {
                System.out.println("Lista é : \n");
                ar.listarEmOrdem();
            } else if (condicao == 3) {
                System.out.println("Percorrendo..");
                ar.percorrerComPausa();
            } else if (condicao == 4) {
                //Pesquisa ELementos 
                sc.nextLine(); // Consumir a quebra de linha pendente
                System.out.println("Digite o item para pesquisar");
                String elementoPesquisar = sc.nextLine();
                if (ar.pesquisar(elementoPesquisar)) {
                    System.out.println("Elemento encontrado: " + elementoPesquisar);
                } else {
                    System.out.println("Elemento não encontrado: " + elementoPesquisar);
                }} else if (condicao == 5) {
                    //Exclui Elementos
                    System.out.println("Digite a ordem que você quer deletar:");
                    sc.nextLine();
                    String Apagar_selecao = sc.nextLine();
                    ar.excluir(Apagar_selecao);
                    System.out.println("Ordem apagada com sucesso");
                }
            }
        }
    

    public int getId_servico() {
        return this.id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return this.nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

}
