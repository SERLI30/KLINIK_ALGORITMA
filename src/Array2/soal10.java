package Array2;

import java.util.Scanner;

public class soal10 {

    public static void main(String[] args) {

        Scanner serli = new Scanner(System.in);

        int a = serli.nextInt();

        int[] data = new int[a];
        System.out.println(a );
        for (int i = 0; i < a; i++) {
            data[i] = serli.nextInt();
        }

        int[] geser = new int[a];

        int pertama = data[0];

        for (int i = 0; i < a - 1; i++) {
            geser[i] = data[i + 1];
        }

        geser[a - 1] = pertama;

        System.out.print("Array awal: ");
        for (int x : data) {
            System.out.print(x + " ");
        }

        System.out.print("\nHasil: ");
        for (int x : geser) {
            System.out.print(x + " ");
        }
    }
}
