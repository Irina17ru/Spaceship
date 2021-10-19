import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n, temp, sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i ++) {
            temp = in.nextInt();
            sum += temp;                //получаем сумму всех элементов
            list.add(temp);
        }

        sum = sum/2;                    //ищем значение, которое нам нужно - оно равно половине суммы всех элементов
        temp = list.indexOf(sum);       //находим индекс такого элемента А в массиве
        int element = list.get(n - 1);  //вводим временную переменную, в которую посылаем последний элемент массива В
        list.set(n - 1, sum);           //меняем последний элемент массива на найденный нами А
        list.set(temp, element);        //вставляем элемент В на предыдущее место элемента А
        System.out.println(list);
        in.close();
    }
}
