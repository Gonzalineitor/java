package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        do {
            System.out.println("Bienvenidx.");
            System.out.println("1. Ver lista de alumnos");
            System.out.println("2. Cargar alumnos");
            System.out.println("3. Cargar notas");
            System.out.println("4. Ver notas alumno");
            System.out.println("5. Salir.");

            Scanner sc = new Scanner(System.in);
            System.out.println("Elige una opción: ");
            String option = sc.nextLine();


            switch (option) {
                case "1":
                    System.out.println("Datos de los alumnos");
                    break;
                case "2":
                    System.out.println("Archivo alumnos.csv");
                    try {
                        File alumnos = new File("alumnos.csv");
                        Scanner myReader = new Scanner(alumnos);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Ha ocurrido un error: archivo no encontrado.");
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    System.out.println("Archivo notas.csv");
                    try {
                        File notas = new File("notas.csv");
                        Scanner myReader = new Scanner(notas);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Ha ocurrido un error: archivo no encontrado.");
                        e.printStackTrace();
                    }
                    break;
                case "4":
                    System.out.println("Notas alumno determinado");
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Escribe el ID de un alumno: ");
                    String idalumno = sc.nextLine();
                    break;
                case "5":
                    System.out.println("Nos vemos pronto!");
                    break;
            }
        while (option>0) && (option<6);}
    }
}