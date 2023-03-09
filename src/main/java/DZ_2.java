// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
//    Используем метод StringBuilder.append().
// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


public class DZ_2 {
    public static void main(String[] args) {

        // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

        String text = "Hello world";
        String text2 = "l";

        int index = 0;
        int count = 0;
        while (true)
        {
            index = text.indexOf(text2, index);
            if (index != -1)
            {
                count ++;
                index += text2.length();
            }
            else {
                break;
            }
        }
        System.out.println("Кол-во вхождений строки 2 в строку 1 равно: " + count);
        System.out.print("*".repeat(40));
        System.out.printf("\n");

        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        String text3 = "Hello Anna";//.toLowerCase();
        String text4 = "Anna";//.toLowerCase();

        System.out.println(new StringBuilder(text4).reverse());
        //System.out.println(text4);
        int index1 = 0;
        int count1 = 0;
        while (true)
        {
            index1 = text3.indexOf(text4, index1);
            if (index1 != -1)
            {
                count1 ++;
                index1 += text4.length();
            }
            else {
                break;
            }
        }
        System.out.println("Кол-во вхождений перевернутой строки 2 в строку 1 равно: " + count1);
        System.out.print("*".repeat(40));
        System.out.printf("\n");

        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168

        int num1 = 3;
        int num2 = 56;
        StringBuilder builder = new StringBuilder();

        System.out.println(builder
                .append(3)
                .append(" + ")
                .append(56)
                .append(" = ")
                .append(3 + 56)
                .append(" ")
                .append(3)
                .append(" - ")
                .append(56)
                .append(" = ")
                .append(3 - 56)
                .append(" ")
                .append(3)
                .append(" * ")
                .append(56)
                .append(" = ")
                .append(3 * 56));

        System.out.print("*".repeat(40));
        System.out.printf("\n");

        // 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        String str = "3 + 56 = 59";
        System.out.println(str);
        StringBuilder builder2 = new StringBuilder(str);
        System.out.println(builder2.deleteCharAt(7));
        System.out.println(builder2.insert(7, "равно"));

        System.out.print("*".repeat(40));
        System.out.printf("\n");

        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        String str2 = "3 + 56 = 59";
        System.out.println(str2);
        StringBuilder builder3 = new StringBuilder(str2);
        System.out.println(builder3.replace(7, 8, "равно"));

    }
}
