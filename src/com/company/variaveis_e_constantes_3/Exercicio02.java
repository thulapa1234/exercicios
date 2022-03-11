package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu primeiro nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual é o seu sobrenome? ");
        String sobrenome = scanner.nextLine();

        System.out.println("Olá " + nome +" " + sobrenome + "!" );

        scanner.close();

    }

    }

