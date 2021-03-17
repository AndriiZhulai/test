package task2;

public class SquareOfFigure {
    void area(float x){
    System.out.println("Theareaofthesquareis:"+Math.pow(x,2));

}
    void area(float x,float y){
        System.out.println("Theareaoftherectangleis:"+x*y);
    }

    void area(double x){
        System.out.println("Theareaoftherectangleis:"+Math.PI*Math.pow(x,2));
    }
}

