/*Найдите сумму первых n целых чисел, которые делятся на 3. */

public class Task12 {
    public static void main(String[] args) {
        int averageSum = 0;
        int sum = 0;
        int n = 0;
        int x = (int)(Math.random() * 100);
        for (int i = 1; i <100 ; i++) {
            if(x%3==0){
            sum += x;
            n ++;
            x = (int)(Math.random()*100);
            }
            else if (x%3!=0){
                x = (int)(Math.random()*100);
                continue;
            }
        }
        if(n != 0){
            averageSum = sum / n;
        } else {
            averageSum = 0;
        }
        System.out.println("Сумма:" + averageSum);

    }
}
