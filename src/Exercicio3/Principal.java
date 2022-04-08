package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList<>();

        System.out.println("Agenda de Contatos");
        System.out.println("1 - Inserir contato");
        System.out.println("2 - Remover um contato");
        System.out.println("3 - Editar um contato");
        System.out.println("4 - Listar contatos");
        System.out.println("5 - Sair");
        System.out.println("Informe sua opção: ");
        int opcao = sc.nextInt();
        while(opcao != 5){
            switch (opcao){
                case 1:
                    System.out.print("Informe o código do contato: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o número do telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Informe a idade do contato: ");
                    int idade = sc.nextInt();

                    listaContatos.add(new Contato(codigo, telefone, idade));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    for(Contato contato : listaContatos){
                        System.out.println(contato);
                    }
                    System.out.print("Informe o código do contato a ser excluído: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    for(Contato contato : listaContatos){
                        if(contato.getCodigo() == codigo){
                            listaContatos.remove(contato);
                        }
                    }
                    System.out.println("Contato excluído");
                    break;
                case 3:
                    for(Contato contato : listaContatos){
                        System.out.println(contato);
                    }
                    System.out.println("Informe o código do contato a ser editado: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Informe o novo número a ser atualizado: ");
                    String numero = sc.nextLine();
                    System.out.println("Informe a nova idade a ser atualizada: ");
                     idade = sc.nextInt();
                    for(Contato contato : listaContatos){
                        if(contato.getCodigo() == codigo){
                            contato.setIdade(idade);
                            contato.setTelefone(numero);
                        }
                    }
                    System.out.println("Contato atualizado com sucesso");
                    break;
                case 4:
                    for(Contato contato : listaContatos){
                        System.out.println(contato);
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Agenda de Contatos");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Remover um contato");
            System.out.println("3 - Editar um contato");
            System.out.println("4 - Listar contatos");
            System.out.println("4 - Sair");
            System.out.println("Informe sua opção: ");
            opcao = sc.nextInt();
        }
    }
}
