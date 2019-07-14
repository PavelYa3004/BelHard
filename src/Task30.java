/*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа. */

import java.util.ArrayList;

public class Task30 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r=(int)(Math.random()*40);
            list.add(i,r);
        }
        System.out.println(list);
        ArrayList<Integer> badList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int x=list.get(i);
            for (int j = 0; j < 20; j++) {
                int x2 = list.get(j);
                if (x == x2) {
                    badList.add(i);
                }
            }
        }
        list.removeAll(badList);
        System.out.println(list);
    }
}
