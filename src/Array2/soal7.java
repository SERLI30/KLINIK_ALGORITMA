
package Array2;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
 
    Scanner serli = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array (n): ");
        int n = serli.nextInt();

        int[] a = new int[n];
        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            a[i] = serli.nextInt();
        }

        boolean ascending = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                ascending = false;
                break;
            }
        }

        
        if (ascending) {
            System.out.println("Array sudah terurut naik.");
        } else {
            System.out.println("Array belum terurut naik.");
        }

       serli.close();
    }
}
