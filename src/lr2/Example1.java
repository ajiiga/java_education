package lr2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayWithRandomNumbers(array);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}