/*Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1 */



public class Task17 {
    public static void main(String[] args) {
        int x=(int)(Math.random()*30);
        int arr[][]=new int[x][x];
        for (int i = 0; i < arr.length/2+1; i++) {

            for (int j = 0; j < i+1; j++) {

                arr[i][j]= arr[i][arr.length-1-j]=arr[arr.length-1-i][j]=arr[arr.length-1-i][arr.length-1-j]=1;

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==1){
                System.out.print("*"+" ");}
                else if(arr[i][j]==0){
                    System.out.print(" "+" ");}
            }
            System.out.println();

        }
    }
}
// Я немного не понял как, но получилось)

