package org.lessons.java.word;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una parola: ");
        String parola = scanner.nextLine();

        // 2. Itera su ogni carattere della parola.
        Map<Character, Integer> conteggio = new HashMap<>();
        for (char carattere : parola.toCharArray()) {
            // 3. Per ogni carattere, verifica se la mappa contiene una chiave specifica.
            if (conteggio.containsKey(carattere)) {
                conteggio.put(carattere, conteggio.get(carattere) + 1);
            } else {
                conteggio.put(carattere, 1);
            }
        }

        // 4. Infine, stampa il numero di occorrenze per ogni carattere.
        for (Map.Entry<Character, Integer> entry : conteggio.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        scanner.close();
    }

}
