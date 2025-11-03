/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2.mudah;

/**
 *
 * @author Faiq
 */
import java.util.Scanner;
public class Soal2Mudah {


    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = input.nextInt();

       
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
}
