/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class soal7 {

    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int[] data = new int[a];

        for (int i = 0; i < data.length; i++) {
            data[i] = serli.nextInt();

        }
        boolean palindrom = true;

        for (int i = 0; i < a / 2; i++) {
            if (data[i] != data[a - 1 - i]) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("YA");
        } else {
            System.out.println("TIDAK");
        }
    }

}


