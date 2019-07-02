/*Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня. */

abstract class Appliances {
    private boolean isStarted;
    private String color;
    private String powr;
    private int weigth;

    Appliances(String color, String powr, int weigth) {
        this.color = color;
        this.powr = powr;
        this.weigth = weigth;
    }

    public void onStart(){
        this.isStarted=true;
        System.out.println("Включена");
    }
    public void offStart(){
        this.isStarted=false;
        System.out.println("Выключена");
    }


//    public void on220w(){
//        if (isStarted==true){
//            System.out.println("Да.");
//        }
//        else if(isStarted){
//            System.out.println("Нет.");
//        }
//    }

    public void setColor() {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    String getPowr() {
        return powr;
    }

    public void setPowr() {
        this.powr = powr;
    }
    public void setWeigth(){
        this.weigth=weigth;
    }
    int getWeigth() {
        return weigth;
    }

//    @Override
//    public String status(){
//        return "Мощность "+weigth;
//    }
}

class Washer extends Appliances {
    private final double worVolum = 3.2;
    private final boolean isStarted=false;


    public Washer(String color,String powr,int weigt) {
        super(color,powr,weigt);
    }
    @Override
    public String toString(){//почему если поменять toString на другое название выдает ошибку?
        return "У стеральной машины обьем бака "+worVolum+"(м3) а так же цвет "+getColor()+".\nМощьность "+getPowr()+
                " а вес "+getWeigth()+"кг.Работает ли через разетку 220w?";

    }
}

class Microwave extends Appliances{
    private int size;
    Microwave(int size,String color,String powr,int weigt){
        super(color,powr,weigt);
        this.size=size;
    }

    @Override
    public String toString(){
        return "Данная микровалновка размером "+size+"(см3) имеет цвет "+getColor()+".Мощьностью "+getPowr()+" а весит "+getWeigth()+"кг.";


}}

//class Brend {
//    private String brend;
//    Brend (String brend){
//        this.brend=brend;
//    }
//    String getBrend(){
//        return brend;
//    }
//    public void setBrend(){
//        this.brend=brend;
//    }
//    @Override
//    public String toString(){
//        return "Данная техника марки:"+getBrend();
//    }
//}

public class Task26 {
    public static void main(String[] args) {
        Appliances w=new Washer("Синий","800w",900);
        Microwave m=new Microwave(600,"черный","800w",10);
//        Brend philips=new Brend("Philips");
       // System.out.println(w+philips);//ошибка
        System.out.println(w);
        System.out.println(m);
w.onStart();
m.offStart();
    }
}
