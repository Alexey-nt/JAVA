//1. Реализовать алгоритм сортировки списков компаратором.
//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
//5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
//6. Повторить пятый пункт но с LinkedList.
//7. Сравнить время работы пятого и шестого пунктов.

import java.util.*;
import java.util.stream.IntStream;

public  class DZ_3 {
    public static void main(String[] args) {

    //1. Реализовать алгоритм сортировки списков компаратором.

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Random().nextInt(5));
        }
        System.out.println(list.toString());
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o2 - o1) < 0) return 1;
                else if ((o2 - o1) > 0) return -1;
                return 0;
            }
        });
        list.forEach(n -> System.out.print(n + ", "));
        System.out.println();
        System.out.println("*".repeat(30));

    //2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        System.out.println(list1.toString());
        for (int j = 0; j < list1.size(); j++) {
            if ((list1.get(j) % 2) == 0) list1.remove(list1.get(j));
        }
        System.out.print(list1);
        System.out.println();
        System.out.println("*".repeat(30));

        //3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(new Random().nextInt(10));
        }
        System.out.println(list2);
        System.out.println("Min value -> " + Collections.min(list2));
        System.out.println("Max value -> " + Collections.max(list2));
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o2 - o1) < 0) return 1;
                else if ((o2 - o1) > 0) return -1;
                return 0;
            }
        });
        list2.forEach(n -> System.out.print(n + ", "));
        System.out.println();
        double midValue = 0;
        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
            midValue = sum / list2.size();
        }
        //System.out.println(sum);
        System.out.println("Mid value -> " + midValue);
        System.out.println("*".repeat(30));

        //4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.

        System.out.println(list1);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println("*".repeat(30));

        //5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.

        long begin = System.currentTimeMillis();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(new Random().nextInt(10));
        }
        for (int i = 0; i < 10000; i++) {
            list3.add(0, 0);
        }
        System.out.println(list3);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - begin));
        System.out.println("*".repeat(30));

        //6. Повторить пятый пункт но с LinkedList.

        begin = System.currentTimeMillis();
        LinkedList<Integer> list4 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(new Random().nextInt(10));
        }
        for (int i = 0; i < 10000; i++) {
            list4.addFirst(0);
        }
        System.out.println(list4);
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - begin) );
        System.out.println("*".repeat(30));

        //7. Сравнить время работы пятого и шестого пунктов.

    }
}


