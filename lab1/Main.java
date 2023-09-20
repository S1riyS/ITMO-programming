import java.lang.Math;

public class Main {
    private static float randomInRange(float min, float max) {
        return min + (float) (Math.random() * (max - min));
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

                double currentResult = switch ((int) cArray[i]) {
                    case 3 -> Math.cos(Math.asin(Math.pow(((x - 5.5) / 17), 2)));
                    case 13, 15, 17, 19 -> Math.pow(Math.exp(Math.pow(x, x)), (double) 1 / 3);
                    default -> Math.asin(Math.pow(Math.sin(Math.exp(Math.cos(x))), 2));
                };
                result[i][j] = currentResult;
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
