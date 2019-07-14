/* Задача 1:
Написать метод для конвертации массива строк/чисел в список.
Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray); */

package CollectionTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]=(int)(Math.random()*20);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String str[]=new String[]{"Test","LOL","nothing happens","Test2","miracle"};
        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }
        List<Object> obj=new ArrayList<>();
        for (int j = 0; j < arr.length-1; j++) {
                obj.add(j,arr[j]);
        }

        for (int i = 0; i <str.length ; i++) {
            obj.add(i,str[i]);
        }
        System.out.println(obj);
        }

    }

