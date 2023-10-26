package org.lessons.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Regalo> listaRegali = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("insert new person y/n");
            exit = scanner.nextLine().equals("n");
            if (!exit) {
                System.out.println("descrizione regalo: ");
                String descrizione = scanner.nextLine();
                System.out.println("destinatario regalo");
                String destinatario = scanner.nextLine();
                listaRegali.add(new Regalo(descrizione, destinatario));


            }
            System.out.println("Lista Regali: " + listaRegali);


        }
            scanner.close();
    }
}
