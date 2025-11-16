
package Array2;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int [] data = new int [a];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < data.length; i++) {
            data [i] = serli.nextInt();
            
            if(data [i] > max){
                max = data[i];
            }
            if(data [i] < min){
                min = data[i];
            }
        }
            int range = max-min;
            System.out.println("Maks= "+max+", "+"Min= "+min+" -> "+"Range= "+range);
    }
}
