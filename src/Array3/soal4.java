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
public class soal4 {

    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int[] data = new int[a];

        for (int i = 0; i < data.length; i++) {
            data[i] = serli.nextInt();

        }
        int x = serli.nextInt();
        int frekuensi=0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == x) {
                frekuensi++;
            }
        }
        System.out.println(frekuensi);
    }
}
