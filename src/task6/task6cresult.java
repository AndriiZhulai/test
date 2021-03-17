package task6;

public class task6cresult {
    public static void main(String[] args) {
        //рядки
        int line_i = 5;
        //стовпчики
        int column_j = 8;

        //Повторіть кожен рядок
        for (int i = 1; i <= line_i; i++) {
            //Повторіть кожену колонку
            for (int j = 1; j <= column_j; j++) {
                //Усередині цього циклу друкуйте зірочку для першого або останнього рядка або для першого або останнього стовпця,
                // інакше надрукуйте порожній простір. Що, якщо (i == 1 || i == рядки || j == 1 || j == стовпці),
                // тоді друкуйте зірку, інакше пробіл
                if (i == 1 || i == line_i || j == 1 || j == column_j) {
                    /* Print star for 1st and last row, column */
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            //Після друку всіх стовпців рядка перейдіть до наступного рядка,
                    //тобто надрукуйте новий рядок після внутрішнього циклу.
            System.out.println();
        }
    }
}
//тут описано як виводити
//https://www.javatpoint.com/how-to-print-pattern-in-java

//https://codeforwin.org/2015/07/c-program-to-print-hollow-square-star-pattern.html


