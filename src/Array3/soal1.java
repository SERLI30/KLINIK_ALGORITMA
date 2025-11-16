
package Array3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int [] data = new int [a];
        
        int total=0;
        for (int i = 0; i < data.length; i++) {
            data [i] = serli.nextInt();
            if(data[i] > 0){
                total += data[i];
            }
        }
        System.out.println(total);
    }
}
