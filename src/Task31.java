/*Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task31 {
    public static void main(String[] args) {
        int nStud = 15;
        int o=0;
        List<Integer> stud = new ArrayList<>();
        for (int i = 0; i < nStud; i++) {
            int r = (int) (Math.random() * 10 );
            stud.add(i, r);
        }
        System.out.println(stud);
//        Iterator<Integer> iter=new Iterator<Integer>()
//        for (int i = 0; i <nStud ; i++) {
//            int x=stud.get(i);
//            if(o<x){
//                o=x;
//            }
//        }
//        System.out.println("максимальную отметку "+o);
//    Integer i= Collections.max(stud);
//        System.out.println(i);


    }


}
