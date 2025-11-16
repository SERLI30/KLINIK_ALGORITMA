
package Array3;

import java.util.Scanner;

public class soal6 {

    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int[] data = new int[a];

        for (int i = 0; i < data.length; i++) {
            data[i] = serli.nextInt();
        }
        int besar = Integer.MIN_VALUE;
        int besarKedua = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > besar) {
                besar = data[i];
            }
        }
            for (int i = 0; i < data.length; i++) {
                if (data[i] > besarKedua && data[i] < besar) {
                    besarKedua = data[i];
                }

            }
            System.out.println(besarKedua);
        }
    }

