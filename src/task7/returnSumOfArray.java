package task7;

public class returnSumOfArray {

        static int array[] = {1,2,3,4,5};


        static int sum()
        {
            int sum = 0;
            int i;

            for (i = 1; i < array.length-1; i++){
                sum = sum + array[i];}

            return sum;
        }

}
