/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.*/
public class Task7 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 - 1);
        int b = (int) (Math.random() * 10 - 1);
        int d =(a*a)+(b*b);
        double Di=(double)(Math.sqrt(d));
        int r=(int) (Math.random() * 10 - 1)*2;

        System.out.println(Di);
        System.out.println("\u2300"+r);
if(r>=Di)
    System.out.println("Круглая картонка может закрыть отверстие");
else
    System.out.println("Круглая картонка не может закрыть отверстие");

    }
}
