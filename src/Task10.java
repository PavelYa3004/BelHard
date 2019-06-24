/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию). */

public class Task10 {
    public static void main(String[] args) {
        long d=1;
        for (int i = 1; i <=15; i++) {
            long a,b,c;
            a=i-1;
            b=i;
            c=d*b;
            d=c;

if(i>=10)
            System.out.println(i+"-"+c);
        }
        }

    }

