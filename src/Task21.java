/*Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения. */

public class Task21 {
    public static void main(String[] args) {
        String s1;
        s1 = "Test1=";
        int n=100;
        for (int i = 0; i <n ; i++) {
s1+="LOL"+i+" ";
        }
        System.out.println(s1);

        StringBuilder test2=new StringBuilder("Test2=");
        for (int i = 0; i <n ; i++) {
test2.append("Huh"+i+" ");
        }
        System.out.println(test2);
StringBuffer test3=new StringBuffer("Test3=");
        for (int i = 0; i < n; i++) {
test3.append("heh"+i+" ");
        }
        System.out.println(test3);
    }
}
//Я не знаю как сравнить их по скорости, если только запускать по очереди и смотреть на сикундомер.
//StringBuilder быстрее.