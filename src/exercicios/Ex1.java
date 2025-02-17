package exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int numero;


        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();


        if(numero % 2 == 0 && numero > 10 && numero < 51){


            System.out.print("True");




        }
        else{


            System.out.print("False");


        }


    }

}
