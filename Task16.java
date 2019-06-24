/* Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/

import java.util.Random;

public class Task16 {
    public static void main(String[] args) {
        Random r = new Random();
        int ar[] = new int[r.nextInt(15) + 15];
        System.out.println(ar.length - 1);
        int x=0,sum=ar.length-1;
        double n=0;
        for (int i = 1; i < ar.length - 1; i++) {
            ar[i]=(int)(Math.random()*30);
            System.out.print(ar[i]+" ");
            x+=ar[i];
        }
        System.out.println("\n"+"Общее="+x);
        n=(double) x/sum;
        System.out.println("Сумма массива="+n);
    }
}
