import java.util.Arrays;

public class HomeWorkArray1 {
    public static void main(String[] args) {
        //Task1
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = i + "-Element";
        }

        //Task2
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int k = 0; k < doubleArray.length; k++) {
            System.out.print(doubleArray[k]);
            if (k < doubleArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int j = 0; j < stringArray.length; j++) {
            System.out.print(stringArray[j]);
            if (j < stringArray.length - 1) {
                System.out.print(",");
            }

        }

        //Task3
        System.out.println();
        for (int ii = 0; ii < intArray.length; ii++) {
            System.out.print(intArray[intArray.length - ii - 1]);
            if (ii < intArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int kk = 0; kk < doubleArray.length; kk++) {
            System.out.print(doubleArray[doubleArray.length - kk - 1]);
            if (kk < doubleArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int jj = 0; jj < stringArray.length; jj++) {
            System.out.print(stringArray[stringArray.length - jj - 1]);
            if (jj < stringArray.length - 1) {
                System.out.print(",");
            }

        }

        //Task4
        System.out.println();
        for (int a = 0; a < intArray.length; a++) {
            if (!(intArray[a] % 2 == 0)) {
                intArray[a] += 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}

