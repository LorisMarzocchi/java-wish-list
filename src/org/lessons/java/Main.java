package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Regalo> listaRegali = new ArrayList<>();



//              SCANNER (READ FILE)

        int numeroDiRegali = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(new File("./resources/regali.txt"));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
//                System.out.println(line);
                numeroDiRegali++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (reader != null) {
                reader.close();
            }
        };

        boolean exit = false;

        while (!exit) {
            System.out.println("Ci sono " + numeroDiRegali + " regali nella lista. Vuoi inserire un nuovo regalo y/n");
            exit = scanner.nextLine().equals("n");
            if (!exit) {
                System.out.println("descrizione regalo: ");
                String descrizione = scanner.nextLine();
                System.out.println("destinatario regalo");
                String destinatario = scanner.nextLine();
                listaRegali.add(new Regalo(descrizione, destinatario));
                numeroDiRegali++;
//                System.out.println("ci sono " + numeroDiRegali);
            }

        }

//            System.out.println("Lista Regali (ArrayList appena creata):\n" + listaRegali);

            for (Regalo regalo : listaRegali) {
                System.out.println("\n" + regalo);
            }


//      WRITE FILE
            FileWriter writer = null;
            try {
                writer = new FileWriter("./resources/regali.txt",true); //ultimo parametro append true aggiunge nuovi regali alla fine del file, lasciando intatti i regali esistenti
                for (Regalo regalo : listaRegali) {
                    writer.write(regalo.toString());
                }
            } catch (IOException e) {
                e.printStackTrace(); //Questo mostra lo stack trace completo dell'errore
                System.out.println("Unable to write to the file");
            } finally {
                try {
                    if (writer != null) {
                        System.out.println("File write.... Closing the file\n");
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            scanner.close();
    }
}
