import java.io.*;
import java.util.*;

public class Base {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
        }

        System.out.println("Массив случайных чисел от -10 до 10");
        System.out.println(Arrays.toString(array));

        int min = maxNegativeNumber(array);
        System.out.println("Максимальный отрицательный элемент массива: " + min);

        int max = minPositiveNumber(array);
        System.out.println("Минимальное положительное значение: " + max);

        int sort = changeNumbers(array);
        System.out.println("\nСортировка случайных чисел:");
        System.out.println(Arrays.toString(array));
    }

    //поиск максимально отрицательного элемента массива
    public static int maxNegativeNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] < max)
                max = array[i];
        }
        return max;
    }


    //Ищем минимальное положительное число
    public static int minPositiveNumber(int[] array) {
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Смена местами максимально отрицательного и минимально положительного элементов массива
    public static int changeNumbers(int[] array) {
        int sort = array[0];
        int min = maxNegativeNumber(array);
        int max = minPositiveNumber(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                if (array[i] == max) {
                    array[i] = min;
                }
                if (array[i] == min) {
                    array[i] = max;
                }
            } else {
                if (array[i] == max) {
                    array[i] = min;
                }
                }
            }
        return sort;
        }

    }


