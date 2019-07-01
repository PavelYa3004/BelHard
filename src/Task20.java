import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Task20 {
    public static void main(String[] args) {
        String text=" Восьмая джава это круто!\n" +
                "Она продвинута весьма\n" +
                "Аж даже final добавляет\n" +
                "Сама ";
int n=0;
       char sym;
        text=text.trim();
        for(int i = 0;i < text.length(); i++){
            sym=text.charAt(i);
            if (sym == ' ' || sym=='!' || sym=='\n'){
                System.out.print(sym=text.charAt(i-1));
                n++;

            }

        }
        System.out.println("\n"+n);
        // отстойный вариант
    }
}
