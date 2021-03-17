package task8;

import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++)
        {
            if ((i%3==0 || i%5==0) && i%2!=0)
            System.out.println(i);
            else{
                System.out.println("incorrect value");
            }
        }


        }
    }


