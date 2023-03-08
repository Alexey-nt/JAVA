//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Arrays;
import java.util.Random;
public class DZ_1 {
    public static void main(String[] args) {

        //        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.printf("Случайное число i от 0 до 2000 равно: " + i);
        System.out.printf("\n");
        System.out.print("***********************************\n");

        //        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int num = random.nextInt(100);
        int n;
        System.out.println("Выпавшее число = " + num);
        System.out.println("Выпавшее чисдо в двоичном представлении: " + Integer.toBinaryString(num));
        n = Integer.toBinaryString(num).length();
        System.out.println("Номер старшего бита: " + n);
        System.out.println("Число n = " + n);

        System.out.print("***********************************\n");

        //        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int length = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                length++;
            }
        }
        System.out.println("Длина массива от " + i + " до " + Short.MAX_VALUE + " равна: " + length);

        int[] m1 = new int[length];
        int x = 0;
        for (int j = i; j < Short.MAX_VALUE; j++ ) {
            if (j % n == 0) {
                m1[x] = j;
                x++;
            }
        }
        System.out.println(Arrays.toString(m1));
        System.out.print("***********************************\n");

        //        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2



        int length2 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                length2++;
            }
        }
        System.out.println("Длина массива от " + Short.MIN_VALUE + " до " + i + " равна: " + length2);


        int[] m2 = new int[length2];
        int y = 0;
        for (int j = Short.MIN_VALUE; j < i; j++ ) {
            if (j % n != 0) {
                m2[y] = j;
                y++;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}
