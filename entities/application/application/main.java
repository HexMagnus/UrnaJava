package application;

import java.util.Scanner;



public class main{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Bem vindo ao resultado da votação");
System.out.println("Gostaria de saber quantos votos foram contabilizados?");
System.out.println("100% das pessoas votaram");
System.out.println("Ou seja, para aprovação é necessária uma média de 66,66%");
System.out.println("O resultado é a somatória dos votos válidos");
System.out.println("O valor total é dividido por 3, sendo 1/3 para válidos, 1/3 para brancos e 1/3 para nulos");
System.out.println("Qual foi o resultado?");
scan.nextInt();
System.out.println("Valor é" );



scan.close();


 }
}