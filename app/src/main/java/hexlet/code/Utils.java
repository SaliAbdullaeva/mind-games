package hexlet.code;

import java.util.Random;


public class Utils {

    private static final Random RAND = new Random();

    public static int nextInt(int origin, int bound) {
        return RAND.nextInt(origin, bound);
    }

    public static int nextInt(int bound) {
        return RAND.nextInt(bound);
    }

    public static int[] nextIntArray(int[] bounds) {
        final int length = bounds.length;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = nextInt(bounds[i]);
        }

        return array;
    }

    public static int[] nextIntArray(int length, int bound) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = nextInt(bound);
        }

        return array;
    }

    public static String randomFromArray(String[] array) {
        final int bound = array.length;
        int index = nextInt(bound);
        return array[index];
    }

}

