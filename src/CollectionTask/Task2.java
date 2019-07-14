/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
 */

package CollectionTask;

public class Task2 {
    public static void main(String[] args) {
Index<Object> arr=new Index<>(30);
        for (int i = 0; i < arr.gLength(); i++) {
            if(i%2==0) {
                arr.setArray(i, "Test " + i);
            }
            else if(i%3==0){
                arr.setArray(i, (int) (Math.random() * 200));
            }
            else {
                arr.setArray(i, (double) (Math.random() * 20));
            }
            System.out.println(arr.get(i));
        }

    }
}

class Index<T extends Object>{//Найдено и списано
    private Object[] array;

    Index(int длинна_массива){
        array=new Object[длинна_массива];
    }
    public int gLength(){
        return array.length;
    }
public T get(int id){
        return (T)array[id];
}
void setArray(int id,T значение){
        array[id]=значение;
}
}
