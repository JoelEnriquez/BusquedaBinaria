/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BusquedaBinaria;

/**
 *
 * @author joel
 */
public class NewMain {

    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;
        int totalPares = 0;
        //int i = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                totalPares = totalPares + 1;
                pares++;
            } else {
                impares = impares + 1;
            }
        }
        //System.out.println("total de numeros" + i);
        System.out.println("total de pares " + pares);
        System.out.println("sumatoria de pares " + totalPares);
        System.out.println("total de impares " + impares);
    }
}
