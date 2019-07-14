/*Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task29  {
    public static void main(String[] args) {
        int r;
        int n=3;//негативные отметки
        List<Integer> stud=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            r=(int)(Math.random()*10+1);
//            Studeent s=new Studeent(i,r);
//            stud.add(s);
            stud.add(i,r);
        }

        System.out.println(stud);
        ArrayList<Integer> nList=new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            int x=stud.get(i);
            if(x<=n){
                nList.add(x);
            }
            
        }
        stud.removeAll(nList);
        System.out.println(stud);


    }
}

class Studeent{
    private String stude="Студент";
    int n;// номер студента
    int o;// отметка студента

    Studeent(int n,int o){
        this.n=n;
        this.o=o;
    }

    public int getO() {
        return o;
    }

    @Override
    public String toString() {
        return stude+"."+n+" Отметка="+o+".\n";
    }
}
