/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

class Time {
    private int hour, min, sec;

    Time(int часы, int минуты, int секунды) {
        this.hour = часы;
        this.min = минуты;
        this.sec = секунды;
    }

    Time(int секунд) {
        this(секунд / 60 / 60, секунд / 60 % 60, секунд % 60);
    }

    public void setTime(int часы, int минуты, int секунды) {
        this.hour = часы;
        this.min = минуты;
        this.sec = секунды;
    }

    public void setTime(int секунд) {
        setTime(секунд / 60 / 60, секунд / 60 % 60, секунд % 60);
    }

    int getTime() {// изначально это была string
        return (hour * 60 * 60) + (min * 60) + sec;
        //return (hour * 60 * 60) + (min * 60) + sec+" секунд"
    }

    int compare(Time Test) {// подсмотрел

        if (this.getTime() > Test.getTime()) {
            return -1;//System.out.println("Первое значение меньше второго");
        } else if (this.getTime() == Test.getTime()) {
            return 0;//System.out.println("Значения равны");
        } else {
            return 1;//System.out.println("Первое значение больше второго");
        }// Я пытался сравнить int и string но потерпел неудачу
    }//а если сделать то и то string то выдает ошибку что оператор < неправелен

    @Override
    public String toString(){
        return "Часы "+hour+" минуты "+min+" секунды "+sec;
    }
}

public class Task24 {
    public static void main(String[] args) {
        Time t=new Time(38156);
        System.out.println(t);
       Time t1=new Time(10,35,56);
        System.out.println(t1.getTime());
        switch (t.compare(t1)){
            case -1:
                System.out.println(t.getTime()+" Больше "+t1.getTime());
                break;
            case 0:
                System.out.println(t.getTime()+" Равно "+t1.getTime());
                break;
            case 1:
                System.out.println(t.getTime()+" Меньше "+t1.getTime());
        }

    }
}
