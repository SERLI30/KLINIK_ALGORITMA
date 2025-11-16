/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array2;

import java.util.*;

/**
 *
 * @author HP
 */
public class soal8 {

    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int[] A = new int[a];
        int[] B = new int[a];

        for (int i = 0; i < a; i++) {
            A[i] = serli.nextInt();
        }
        for (int j = 0; j < a; j++) {
            B[j] = serli.nextInt();

        }

        for (int i = 0; i < a; i++) {
            int c = A[i] + B[i];
            System.out.print(c + " ");
        }

    }
}
