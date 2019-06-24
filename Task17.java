/*Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1 */

import java.util.Random;

public class Task17 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = 5;
        String[][] symbols = new String[x][x];

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = new String[symbols.length];
int x=0;
            for (int i = 0; i < symbols.length; i++) {
                x++;
                for (int j = 0; j < symbols[i].length; j++) {
                    symbols[i][j] = " * ";
                    System.out.println(symbols[i][j]+" ");


                }
                System.out.println();
            }
        }
    }
}
