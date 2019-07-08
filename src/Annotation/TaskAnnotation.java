/*Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
 (поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
 а кодовое название версии = Nougat).
Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
 get и set методы, переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo),
 который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.

 Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она
 присутствует - создавать экземпляр этого класса, задавать значения его полям и вызывать метод
 thisClassInfo (использовать возможности пакета reflection).

 */

import java.lang.annotation.*;
import java.util.Objects;


public class TaskAnnotation extends MyService{
    public static void main(String[] args) {
        MyService my=new MyService();
       Class <?> c=my.getClass();
        Version v=c.getAnnotation(Version.class);
        System.out.println("Version="+v.version()+"\n Кодовое название="+v.nameVersion());


my.setX(25);
        my.thisClassInfo();

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Version{
    String version() default "0.1";
    String nameVersion () default "";
}

@Version(version = "0.1.1",nameVersion = "Alpha")
class MyService{
    private int x=0;
    void thisClassInfo(){
        System.out.println("x="+x+";");
    }

    private int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return x == myService.x;
    }

    @Override
    public String toString() {
        return "x="+x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}

