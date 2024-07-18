package com.mycompany.traintrack.client.app;

import java.util.Scanner;

public class TrainTrack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hola, este es el repo del proyecto de concurrente \n Escriba 1 para iniciar: ");
        int a = scanner.nextInt();


        while (a == 1) {
            System.out.println("se presionó la tecla 1");
            a++;
        }

        System.out.println(a);
        System.out.println("El programa ha terminado");

        //SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS

    }
}
