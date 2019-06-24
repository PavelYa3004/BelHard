/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив). */

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        Random r = new Random();
        int ar[] = new int[r.nextInt(15) + 15];
        System.out.println(ar.length - 1);
        for (int i = 1; i < ar.length - 1; i++) {
        ar[i]=(int)(Math.random()*30);
            System.out.print(ar[i]+" ");
        }
        System.out.println(" ");
        for (int i = 1; i < ar.length-1; i++) {
            int x=ar[ar.length-1-i];
            System.out.print(x+" ");

        }
    }
}