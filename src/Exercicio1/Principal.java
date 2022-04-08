package Exercicio1;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b , c;
        List<Integer> valores = new ArrayList<>();

        System.out.print("Informe o primeiro valor: ");
        a = sc.nextInt();
        valores.add(a);
        System.out.print("Informe o segundo valor: ");
        b = sc.nextInt();
        valores.add(b);
        System.out.print("Informe o terceiro valor: ");
        c = sc.nextInt();
        valores.add(c);

        System.out.println("Ordem lida");
        for(Integer i : valores){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Ordem crescente");
        Collections.sort(valores);
        for(Integer i : valores){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Ordem decrescente");
        Collections.sort(valores, Collections.reverseOrder());
        for(Integer i : valores){
            System.out.print(i + " ");
        }






    }
}
