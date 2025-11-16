
package Array3;

import java.util.Scanner;


public class soal2 {
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        int a = serli.nextInt();
        int [] data = new int [a];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < data.length; i++) {
            data[i]= serli.nextInt();
            
        if(data[i] > max){
            max = data[i];
        }
          if(data[i]< min){
              min = data[i];
          }  
        }
        System.out.println(min +" "+ max);
    }
}
