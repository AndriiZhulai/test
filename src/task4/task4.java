package task4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int [] array1 = {4, 9, 16, 25, 36, 49, 64, 81, 100, 121};

        double[] array2 = new double[10];
        for(int i = 0; i < array1.length ; i++) {
            array2[i] = Math.sqrt(array1[i]);}

            System.out.println(Arrays.toString(array2));



    }
}
