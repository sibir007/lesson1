package ru.geekbrains.lesson1;

public class FirstApp {
    public static void main(String[] args) {
        // 2. Переменные пройденных типов
        byte byteVar = 127;
        short shortVar = -32000;
        int intVar = 1000000000;
        long longVar = -5000000000l;
        float floatVar = 238783.23947f;
        double doubleVar = 327493.2398;
        char charVar = 'A';
        boolean boolVar = true;
        String strVar = "Переменная типа String";

        // 3. вызов метода, вычисляющий выражение a * (b + (c / d))
        delimeter(3);
        float a = 10f;
        float b = 13.5f;
        float c = 32.4f;
        float d = 3.2f;
        System.out.println("результат выполнения метода вычисляющего выражение:\n" +
                "a * (b + (c / d))\n" +
                "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + "\n" +
                countMet(a, b, c, d));


        // 4. Вызов метода, принимающего на вход два целых
        // числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        delimeter(4);
        int num1 = 16;
        int num2 = 5;
        System.out.println("сумма двух целых чисел:\n" +
                "num1 = " + num1 + ", num2 = " + num2 + "\n" +
                "лежит в пределах от 10 до 20 (включительно): " + ifMet1(num1, num2));


        // 5. Вызов метода печатающего в консоль положительное
        // число или отпрцательное
        delimeter(5);
        int num3 = 10;
        ifMet2(num3);

        // 6. Вызов метода возвращающего true, если число
        // отрицательное, и false если положительное.
        delimeter(6);
        int num4 = 3;
        System.out.println("число " + num4 + " отрицательное: " + ifMet3(num4));

        // 7. Вызов метода, которому в качестве параметра передается строка,
        // обозначающая имя. Метод выводит в
        // консоль сообщение «Привет, указанное_имя!».
        delimeter(7);
        String name = "Dima";
        printNameMet(name);

        // 8. Вызов метода  который определяет, является ли год високосным,
        // и выводит сообщение в консоль
        delimeter(8);
        int year = 2120;
        leapYear(year);


    }
    /*
    метод печатет линию разделитель заданий
     */
    public static void delimeter(int numTask){
        System.out.println("----------" + numTask + "----------");
    }
    /*
    3. метод, вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат, где a, b, c, d – аргументы
    этого метода, имеющие тип float.
     */
    public static float countMet(float a, float b, float c, float d){
        return (c / d + b) * a;
    }

    /*
    4. метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    public static boolean ifMet1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /*
    5. Метод, которому в качестве параметра передается целое число,
    метод печатает в консоль положительное ли число передали или
    отрицательное. Ноль считаем положительным числом.
     */
    public static void ifMet2(int num) {
        if (num >= 0) {
            System.out.println("число " + num + " положительное");
        } else {
            System.out.println("число " + num + " отрицательное");
        }
    }


    /*
    6. Метод, возвращающее true, если число отрицательное,
    и false если положительное.
     */
    public static boolean ifMet3(int num){
        return num < 0;
    }

    /*
    7. Метод, которому в качестве параметра передается строка,
    обозначающая имя. Метод выводит в консоль сообщение
    «Привет, указанное_имя!».
     */
    public static void printNameMet(String name){
        System.out.println("Привет " + name + "!");
    }

    /*
    8. Метод  который определяет, является ли год високосным,
       и выводит сообщение в консоль
     */
    public static void leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.println(year + " год високосный");
                    return;
                }
                System.out.println(year + " год не високосный");
                return;
            }
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

}
