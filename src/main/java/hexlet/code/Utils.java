package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random RANDOM = new Random();

    public static int getRandomInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min должен быть меньше или равен max");
        }
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}

