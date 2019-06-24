/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны? */
public class Task5 {
    public static void main(String[] args) {
        int n= (int)(Math.random()*10000-1);
        int a,b,c,d;
        a=((n%10));
        b=((n%100)/10);
        c=((n%1000)/100);
        d=((n%10000)/1000);
        System.out.println(n);
        if(a==b||a==c||a==d||b==c||b==d||d==c)
            System.out.println("Некоторе цифры совподают");
        else
            System.out.println("Все цыфры разные");
    }
}
