/*Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/
public class Task8 {
    public static void main(String[] args) {
        int R = 231;//(int) ((Math.random()) * (Math.random() * 3) * 1000 - 1);
        String Rub;
        System.out.println("\u20BD"+R);
        if (R%10==1&R%100<10)
            Rub="Рубль";

        else if(R%10!=1&R%10<5)
            Rub="Рубля";
        else
            Rub="Рублей";
        System.out.println(R+" "+Rub);
    }
}
