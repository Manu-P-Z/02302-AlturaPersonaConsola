/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        double altura;

        try {

            System.out.print("Mi altura es ..........: ");

            altura = SCN.nextDouble();

            System.out.printf(Locale.ENGLISH, "%s%.2f%s%n", "Mi altura es ..........: ", altura, " metros");

        } catch (Exception e) {

            System.out.println("ERROR: Valor introducido no válido");

        } finally {

            SCN.nextLine();
        }
    }
}
