package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(task5(22, 7));
        Task6(8);
        System.out.println(task7(1));
        Task8("Spam,Eggs", 3);
        System.out.println(Task9(2025));
        Task10();
        Task11();
        Task12();
        Task13();
        int[] result = Task14(7, 4);
        System.out.println(Arrays.toString(result));
    }

    public static void printThreeWords() {                // задание 1
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {                   // задание 2
        int a = 4;
        int b = -3;

        int sum = a + b;

        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {                       //Задание 3
        int value = 322;
        System.out.println(
                value <= 0 ? "Красный" : value <= 100 ? "Жёлтый" : "Зелёный");
    }

    public static void compareNumbers() {                   //Задание 4
        int a = 3;
        int b = 4;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    static boolean task5(int a, int b) {                   //Задание 5
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void Task6(int number) {                  //Задание 6
        System.out.println(number >= 0 ? "Число положительное" : "Число отрицательное");
    }

    public static boolean task7(int number) {               //Задание 7
     return number < 0;
    }

    public static void Task8(String str, int count) {       //Задание 8
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean Task9(int year) {                 //Задание 9
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void Task10() {                        // задание 10
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println("Массив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Task11() {                             //Задание 11
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("\nМассив от 1 до 100:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Task12() {                           //Задание 12
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println("\nМассив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static void Task13() {                           //Задание 13
        int n = 5;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        System.out.println("\nМассив с единицами на главной диагонали:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] Task14(int len, int initialValue) {   //Задание 14
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
