package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdClientes = 6;
        List<Cliente> clientes = new ArrayList<>();
        double somaFaturamento = 0, diferenca;

        for(int i = 0; i < qtdClientes; i++){
            System.out.print("Informe o faturamento do " + (i + 1) + "o cliente: ");
            double faturamento = sc.nextDouble();
            clientes.add(new Cliente(faturamento));

        }

        for(Cliente cliente: clientes){
            somaFaturamento += cliente.getFaturamento();
        }

        if(somaFaturamento > 54000.00){
            diferenca = somaFaturamento - 54000.00;
            System.out.println("O faturamento foi superado em: " + diferenca + " reais");
        }
        else{
            System.out.println("Não foi superado o faturamento.");
        }
    }
}
