/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array3;

import java.util.Scanner;

public class soal8 {

    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);

        int N = serli.nextInt();
        int K = serli.nextInt();

        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = serli.nextInt();
        }

        K = K % N;

        int[] hasil = new int[N];

        for (int i = 0; i < N; i++) {
            hasil[i] = data[(i + K) % N];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
}