package FinalExercise;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class RandomNumbers {
    public static int[] getRandomNumbers(int size, int count) {
        if (count > size) {
            throw new IllegalArgumentException("Cannot return more unique numbers than the size.");
        }

        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Generate unique random numbers
        while (uniqueNumbers.size() < count) {
            uniqueNumbers.add(random.nextInt(size));
        }

        // Convert Set to array
        int[] result = new int[count];
        int index = 0;
        for (int num : uniqueNumbers) {
            result[index++] = num;
        }
        return result;
    }
}

