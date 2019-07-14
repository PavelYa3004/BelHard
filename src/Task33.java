/* Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов. */

import java.io.*;

public class Task33 {
    public static void main(String[] args) throws IOException {
String fileName="C:\\Users\\Paul\\IdeaProjects\\untitled\\BelHard\\src\\Task.txt";

        try {
        int n = 0;
        FileInputStream fIn = new FileInputStream(fileName);
        int res = fIn.read();
        while (res != -1) {
            System.out.print((char) res);
            res = fIn.read();
            char symbol = (char) res;
            if (symbol == ',' || symbol == '.' || symbol == '-' || symbol==':') {
                n++;
            }
        }
            System.out.println("\nКоличество знаков="+n);
            fIn.close();

//            InputStream in = new FileInputStream("C:\\Users\\Paul\\IdeaProjects\\untitled\\BelHard\\src\\Task33.txt");
//            int size = in.available();
//            for (int i = 0; i < size; i++) {
//                System.out.print((char) in.read());
//            }
//            in.close();


        }
        catch (IOException e){
            System.err.println("Я не нашел файл "+fileName);
        }
    }
}
