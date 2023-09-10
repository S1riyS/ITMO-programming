import static java.lang.Math.*;

public class Main {
    private static float randomInRange(float min, float max) {
        return min + (float) (Math.random() * (max - min));
    }

    private static boolean checkIfValueInArray(long[] array, long target) {
        for (long value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Crating necessary arrays
        long[] cArray = {3, 5, 7, 9, 11, 13, 15, 17, 19};
        float[] xArray = new float[16];
        for (int i = 0; i < 16; i++) {
            xArray[i] = randomInRange(-14.0F, 3.0F);
        }

        // Calculating resulting array
        double[][] result = new double[9][16];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                float x = xArray[j];

                if (cArray[i] == 3) {
                    result[i][j] = cos(asin(pow(((x - 5.5) / 17), 2)));
                } else if (checkIfValueInArray(new long[]{13, 15, 17, 19}, cArray[i])) {
                    result[i][j] = pow(exp(pow(x, x)), (double) 1 / 3);
                } else {
                    result[i][j] = asin(pow(sin(exp(Math.cos(x))), 2));
                }
            }
        }

        // Printing result
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%.2f \t", result[i][j]);
            }
            System.out.println();
        }
    }
}