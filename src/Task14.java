/* Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера. */

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random r = new Random();
        int array[] = new int[r.nextInt(15) + 15];
        System.out.println(array.length - 1);
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        int max=0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i]>max)
                max=array[i];
        }
        int min=max;
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]<min)
                min=array[i];
        }
        System.out.println("\nMin:"+min+"\n"+"Max:"+max+"\n");
        System.out.println("Минимальное отметка");
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == min) {
                System.out.println("ind[" + i + "]=" + min);
            }
        }
        System.out.println("Максимальное отметка");
            for (int i = 0; i < array.length-1; i++){
            if(array[i]==max)
                System.out.println("ind["+i+"]="+max);

        }
            }

        }





