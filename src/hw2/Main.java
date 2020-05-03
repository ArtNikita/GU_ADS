package hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int size = 100_000;
        Random r = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt();
        }

        new Thread(() -> {
            ArrayImpl<Integer> array1 = new ArrayImpl<>(Arrays.copyOf(array, array.length));
            long a1Start = System.nanoTime();
            array1.sortBubble(false);
            System.out.printf("Simple bubble sort time: %d ms.\n", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - a1Start));
        }).start();

        new Thread(() -> {
            ArrayImpl<Integer> array2 = new ArrayImpl<>(Arrays.copyOf(array, array.length));
            long a2Start = System.nanoTime();
            array2.sortBubble(true);
            System.out.printf("Modified bubble sort time: %d ms.\n", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - a2Start));
        }).start();

        new Thread(() -> {
            ArrayImpl<Integer> array3 = new ArrayImpl<>(Arrays.copyOf(array, array.length));
            long a3Start = System.nanoTime();
            array3.sortInsert();
            System.out.printf("Insert sort time: %d ms.\n", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - a3Start));
        }).start();

        new Thread(() -> {
            ArrayImpl<Integer> array4 = new ArrayImpl<>(Arrays.copyOf(array, array.length));
            long a4Start = System.nanoTime();
            array4.sortSelect();
            System.out.printf("Select sort time: %d ms.\n", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - a4Start));
        }).start();
    }
}
