/* Написать клиент для работы порта. Корабли могут заходить в порт для разгрузки / загрузки контейнеров.
Количество контейнеров, находящихся в текущий момент в порту и на корабле, не должно превышать заданную грузоподъемность
 судна и емкость порта. В порту работает несколько причалов. В одном причале может стоять только один корабль.
  Корабль может загружаться у причала, разгружаться или выполнять оба действия.*/

package Thread;

import java.util.ArrayList;
import java.util.List;

public class Ship implements Runnable {
    Port port;
    String name ="Ship";
    int conteners=(int)(Math.random()*100);
    int spaseNow;
    Ship(Port port,int spaseNow,String name){
        if(spaseNow<50){
            this.spaseNow=50;
        }
        else if (spaseNow>200){
            this.spaseNow=200;
        }
        else {
            this.spaseNow=spaseNow;
        }
        this.port=port;

        this.name=name;
    }

    @Override
    public void run() {
        synchronized (port) {
            int c = 0;
            port.contNow = port.getContNow();
            System.out.println("В порту контейнеров " + port.contNow);
            System.out.println("Корабль " + name + " имеет вместимость " + spaseNow + " имеет контейнеров на борту в данный момент " + conteners);
            System.out.println("Корабль " + name + " вошол в порт ");
            if (conteners > 0) {
                System.out.println("\nКорабль " + name + " начинает разгрузку...");
                for (int i = 0; i < conteners; i++) {
                    if (port.contNow == port.space) {
                        break;
                    }
                    System.out.print(".");
                    port.contNow++;
                    c++;
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }
                }
                conteners = conteners - c;
                System.out.println("\nРазгружено " + c + " контейнеров");
            }
            System.out.println("\nКорабль " + name + " начинает загрузку...");
            for (int i = 0; i < spaseNow; i++) {
                if (port.contNow == 0) {
                    break;
                }
                System.out.print(".");
                port.contNow--;
                conteners++;
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
            System.out.println("\nКорабль " + name + " закончил загрузку и загрузил " + conteners + " контейнеров");
            System.out.println("В порту контейнеров " + port.contNow);

        }
    }
    }


class Port{
     int space=400;//Макс места для контейнера
     int contNow=(int)(Math.random()*200);//количество занятых мест.
    int freePlase=space-contNow;

    public int getContNow() {
        return contNow;
    }

    public void setContNow(int contNow) {
        this.contNow = contNow;
    }
}

class Run {
    public static void main(String[] args) {
        int r=(int)(Math.random()*200);
        Port port=new Port();
        for (int i = 0; i < 5; i++) {
            Thread t=new Thread(new Ship(port,r,""+i));
            t.start();
        }


        }
    }




