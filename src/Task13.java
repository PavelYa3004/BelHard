/*  Создать последовательность случайных чисел, найти и вывести наибольшее из них.*/

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random r=new Random();
        int array [] = new int[(int)(Math.random()*100)];
        for (int i = 0; i <array.length ; i++) {
            array [i]=(int)(Math.random()*1000-1);
        }
        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                
                if (array [index] > array [index + 1]) {
                    int tmp = array [index];
                    array [index] = array [(index + 1)];
                    array [(index + 1)] = tmp;
                }
            }
        }
        //for (int i = 0; i < array.length; i++) {
            System.out.println("Max "+array[array.length-1]);
            }
        }


