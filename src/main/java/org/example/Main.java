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
        System.out.println(task7(-1));
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

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {                      //Задание 3
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");

        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {                   //Задание 4
        int a = 3;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean task5(int a, int b) {                   //Задание 5
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Task6(int number) {                  //Задание 6
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task7(int number) {               //Задание 7
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void Task8(String str, int count) {       //Задание 8
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean Task9(int year) {                 //Задание 9
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void Task10() {                           //Задание 10
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            //
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
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

    public static int[] Task14(int len, int initialValue) {  //Задание 14
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
