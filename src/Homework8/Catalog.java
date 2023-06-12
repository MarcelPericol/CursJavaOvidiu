package Homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {
        Map<String, Integer> listaNote = new HashMap<>();
        listaNote.put("Ovidiu", 5);
        listaNote.put("Marius", 8);
        listaNote.put("Gabriela", 10);
        listaNote.put("Anca", 9);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu nume elev : ");
        String nume = scanner.nextLine();

        System.out.print("Introdu nota : ");
        int nota = scanner.nextInt();

        if (!listaNote.containsKey(nume)) {
            listaNote.put(nume, nota);
            System.out.println("Nu aveai nota, ti-am trecut acum!");
        } else {
            int existingGrade = listaNote.get(nume);
            if (nota < existingGrade) {
                System.out.println("Nu ai nevoie de alta nota");
            } else {
            	System.out.println("Ti-am actualizat nota!");
                listaNote.put(nume, nota);
            }
        }
        System.out.println("-----------------------");
        System.out.println("Updated Grade List:");
        for (Map.Entry<String, Integer> entry : listaNote.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
