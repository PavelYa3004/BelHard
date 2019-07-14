/*Напишите класс Student, предоставляющий информацию об имени студента методом getName() и о его курсе методом getCourse().
Напишите метод printStudents(List students, int course), который получает список студентов и номер курса и печатает в
консоль имена тех студентов из списка, которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор.

Протестируйте ваш метод (для этого предварительно придется создать десяток объектов класса Student и поместить их в список). */

package CollectionTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Student> studList=new ArrayList<>();
        Student s = null;
        for (int i = 0; i < 15; i++) {
            s=new Student(""+i,(int)((Math.random()*5)+1));
         studList.add(i,s);
        }
        System.out.println(studList);
        s.printStudents(studList,3);

    }
}




class Student{
    private String name;
    private int cours;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }
  void printStudents(List students, int course){
    Iterator<Student> it=students.iterator();
while (it.hasNext()) {
    Student s=it.next();
    if(s.getCours()!=course){
        it.remove();
          }
     }
      System.out.println(students);
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Student " + name +
                ", cours=" + cours +"\n";
    }
}