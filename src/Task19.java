/* Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать. */

import java.util.List;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Task19 {
    public static void main(String[] args) {
    String text=" Восьмая джава это круто!\n" +
            "Она продвинута весьма\n" +
            "Аж даже final добавляет\n" +
            "Сама ";
    int n=0;
//    String []arr=text.split(" ");
//
//        for (String i : arr) {
//            n++;
//
//        }
//        System.out.println(n);
        StringTokenizer st = new StringTokenizer(text, " ,;\n!");  //Бред какой то, почему если не добавить \n и !
        // то значение int n равно 9??
        //Оно же должно разбивать на слова и делать равное количество прогонов в while но делает 9.

		List<String> wordsList = new ArrayList<>();

		while (st.hasMoreTokens()) {
			wordsList.add(st.nextToken());
			n++;
		}
//    		wordsList.forEach(System.out::println);
        System.out.println("Слов в строке="+n);

    }
}
