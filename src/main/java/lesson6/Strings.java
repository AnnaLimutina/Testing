package lesson6;

import java.util.Arrays;

public class Strings {

    public static void printAllO(String string) {

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'о') {
                System.out.println(string.charAt(i));
            }
        }
    }

    public static void countAllE(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'е') {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void findIndexesOfRit(String string) {
        for (int i = 0; i < string.length() - 2; i++) {
            if (string.toLowerCase().startsWith("рит", i)) {
                System.out.println(i);
            }
        }
    }

    public static void countStringsWithE (String[][] strings) {
        int count = 0;
        for (int i = 0;  i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (strings[i][j].contains("е")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void getAverageCount(int[] array) {
        int sum = 0;
        for (int ints: array) {
            sum += ints;
        }
        System.out.println(sum / array.length);
    }

    public static void sortBubble(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static int[] reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }





    public static void main(String[] args) {

        String s = "Перестановочный алгоритм быстрого действия";

        //Strings.printAllO(s);

        String st = "Перевыборы выбранного президента";

        //Strings.countAllE(st);

        String str = "Посмотрите как Рите нравится ритм";

        //Strings.findIndexesOfRit(str);

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        //Strings.countStringsWithE(array);

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Strings.getAverageCount(array1);
        System.out.println(Arrays.toString(Strings.reverse(array1)));

    }
}
