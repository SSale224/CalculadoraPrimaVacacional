/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primavaca;

/**
 *
 * @author alexg
 */
class Validador {
    public static boolean esNombreValido(String nombre) {
        //nom vacio?
            if (nombre == null || nombre.length() == 0) {
            return false;
        }

        // solo letras
        
            boolean contieneLetras = false;
        for (char c : nombre.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') {
                contieneLetras = true;
                } else {
                    return false; // encontrar  carácter que no sea una letra, retorna falso
            }
        }

        return contieneLetras; 
    }
// si el número  esta vacio
        public static boolean esNumeroPositivo(String numero) {
            if (numero == null || numero.length() == 0) {
            return false; 
            }

            boolean contieneDigitos = false;
        for (char c : numero.toCharArray()) {
            if (c >= '0' && c <= '9') {
                contieneDigitos = true;
                } else {
                    return false; 
            }
        }

            if (!contieneDigitos) {
                 return false; 
                }

        // convierte el numero a double y verificar si es mayor que 0
        
        try {
            double valor = Double.parseDouble(numero);
            return valor > 0;
         } catch (NumberFormatException e) {
            return false; 
            }
        }
    }
