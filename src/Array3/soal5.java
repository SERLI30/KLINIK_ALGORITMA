
package Array3;

import java.util.Arrays;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);

        int n = serli.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = serli.nextInt();
        }
        Arrays.sort(a);
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
