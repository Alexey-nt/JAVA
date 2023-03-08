//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
public class DZ_1 {
    public static void main(String[] args) {

        //        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.printf("Случайное число i от 0 до 2000 равно: " + random.nextInt(i));
        System.out.printf("\n");
        System.out.print("***********************************\n");

        //        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n = random.nextInt(100);
        System.out.println("Выпавшее число n = " + n);
        System.out.println("Выпавшее чисдо в двоичном представлении: " + Integer.toBinaryString(n));
        System.out.println("Номер старшего бита: " + Integer.toBinaryString(n).length());
        n = Integer.toBinaryString(n).length();
        System.out.println("Число n = " + n);

        System.out.print("***********************************\n");

        //        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int[] m1 = new int[Short.MAX_VALUE];
        System.out.println(m1);


    }
}
