/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/
public class Task4 {
    public static void main(String[] args) {
        int n= (int)(Math.random()*10000-1);
        int a,b,c,d,x;
        x=((n%10)*1000)+((n%100)/10*100)+((n%1000)/100*10)+((n%10000)/1000);
        a=((n%10)*1000);
        b=((n%100)/10)*100;
        c=((n%1000)/100*10);
        d=((n%10000)/1000);
        System.out.println(n);
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    }