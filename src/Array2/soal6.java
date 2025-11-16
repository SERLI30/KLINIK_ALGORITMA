/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class soal6 {

    public static void main(String[] args) {
       Scanner serli = new Scanner(System.in);

        int n = serli.nextInt(); 
        int[] A = new int[n];
        int[] B = new int[n];

        
        for (int i = 0; i < n; i++) {
            A[i] = serli.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            B[i] = serli.nextInt();
        }

        
        boolean identik = true;
        for (int i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                identik = false;
                break;
            }
        }

        
        System.out.print("A: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        
        System.out.print("B: ");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }

        
        if (identik) {
            System.out.println("→ identik");
        } else {
            System.out.println("→ tidak identik");
        }
    }
}