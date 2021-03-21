package testlesson1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testlesson1 {
    public static void main(String[] args) {
        // write your code here
       /* List<Character> buffer= new ArrayList<Character>();
        buffer.add('h');
        buffer.add('e');
        buffer.add('l');
        buffer.add('l');
        buffer.add('o');
        System.out.println(buffer);*/
        //System.out.println(printList(ArrayList());

        printList(transformIntToChar(72,101,108,108,111,32,
                119,111,114,108,100));

    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}