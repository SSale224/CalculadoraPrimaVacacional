/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.primavaca;

import javax.swing.JOptionPane;

/**
 *
 * @author alexg
 */

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int numPersonas = obtenerEntero("Ingrese el número de personas:");
        Persona[] personas = new Persona[numPersonas];
        boolean[] salarioIngresado = new boolean[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            String nombre;
            double salario = 0;

            do {
                nombre = obtenerCadena("Nombre de la persona " + (i + 1) + ":");
            } while (!Validador.esNombreValido(nombre));

            if (!salarioIngresado[i]) {
                salario = obtenerDouble("Salario mensual de " + nombre + ":");
                salarioIngresado[i] = true; // Marcar que el salario se ha ingresado para esta persona
            }

            personas[i] = new Persona(nombre, salario);
        }

        String output = "Prima vacacional para cada persona:\n";
        for (int i = 0; i < numPersonas; i++) {
            double primaVacacional = CalculadoraPrimaVacacional.calcularPrimaVacacional(personas[i].getSalario());
            output += personas[i].getNombre() + ": $" + primaVacacional + "\n";
        }

        mostrarMensaje(output);
    }

    public static int obtenerEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static String obtenerCadena(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static double obtenerDouble(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}