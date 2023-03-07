public class Seminar_1 {

    // примитивные типы данных
    int i; //32bit
    public  int j;  // переменная будет видна за классом main
    private  int k;  // переменная НЕ будет видна за классом main
    long l; //64bit
    byte b; //8bit
    short sh; //16bit
    float f; //32bit floating poin
    double d; //64bit floating poin
    boolean aBoolean;
    char aChar; //16bit без знака

    // ссылочный тип данных
    String string = "Привет мир!";  // так можно обьявить и инициализировать строку
    String string1; // создание пустой строки
    String string2 = "";  // тоже создание пустой строки
    String tmpS = new String("Привет мир!");  // Правильное обьявление и инициализация переменной ссылочного типа

}
