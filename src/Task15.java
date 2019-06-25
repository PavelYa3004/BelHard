/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив). */

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        Random r = new Random();
        int ar[] = new int[r.nextInt(15) + 15];
        System.out.println(ar.length );
        for (int i = 0; i < ar.length ; i++) {
        ar[i]=(int)(Math.random()*30);
            System.out.print(ar[i]+" ");
        }

        System.out.println(" ");
        for (int i = 0; i < ar.length/2; i++) {
           int x=ar[i];
           ar[i]=ar[ar.length-1-i];
           ar[ar.length-i-1]=x;
        }
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");

        }
    }
}