/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BusquedaBinaria;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class MainEjercicio {

    static int[] arreglo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARREGLO:");
        int valor = entrada.nextInt();
        arreglo = new int[valor];

        for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = (int) (Math.random() * 10);
            push(aleatorio, i);
        }

    }

    public static void push(int dato, int indice) {

        System.out.println("VALOR= " + dato);
        if (indice == 0) {
            arreglo[indice] = dato;
        } else {
            for (int i = 0; i < indice; i++) {
                if (dato <= arreglo[i]) {
                    for (int j = i; j < indice; j++) {

                        arreglo[j + 1] = arreglo[j];

                    }
                    arreglo[0] = dato;
                    break;
                } else {

                }
            }
        }
        System.out.println(arreglo[indice]);
    }

}
