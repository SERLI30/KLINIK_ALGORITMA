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
public class soal9 {
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int [] A= new int [a];
        int [] B= new int [a];
        int []c= new int [a];
        
        for (int i = 0; i < a; i++) {
            A [i] = serli.nextInt();
            
        }
        for (int i = 0; i < a; i++) {
            B[i] = serli.nextInt();
        }
        for (int i = 0; i < a; i++) {
             c[i] = A[i]+B[i];
            System.out.print(c[i]+" ");
        }
    }
}
