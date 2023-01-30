import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
    }
    public static void task1() {
        ArrayList<Integer> list = getList();
        System.out.println("Введённый Вами список имеет вид: " + list + "\nУдаляю чётные элементы............");
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Конечный вид списка: " + list);
    }

    public static void task2() {
        ArrayList<Integer> list = getList();
        System.out.println("Введённый Вами список имеет вид: " + list);
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
//        Вариант 1:
//        for (int i = 0; i <= list.size() - 1; i++) {
//            if (list.get(i) > max) max = list.get(i);
//            if (list.get(i) < min) min = list.get(i);
//            sum += list.get(i);
//        }
//        Вариант 2:
        max = max(list);
        min = min(list);
        for (int i = 0; i <= list.size() - 1; i++) sum += list.get(i);
        System.out.println("Минимальный элемент массива: " + min + ". Максимальный: " + max + ". Среднее арифметическое = " + (double) sum / (double) list.size());
    }

    public static ArrayList<Integer> getList() {
        ArrayList<Integer> list = new ArrayList<>();
        String str = "";
        while (true) {
            System.out.println("\nВведите целое число для занесения его в массив или нажмите Enter для окончания ввода: ");
            Scanner scanner = new Scanner(System.in);
            try {
                str = scanner.nextLine();
                list.add(Integer.parseInt(str));
            } catch (Exception e) {
                if (str == "") break;
                else System.out.println("Вы ввели неправильный формат числа!!!");
            }
        }
        return list;
    }
}