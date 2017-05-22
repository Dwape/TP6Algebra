
/**
 * class Calc
 * @author Gianluca Scolaro
 * @author Eduardo Lalor
 * @since  5/9/17.
 */
public class Calc implements Calculator{

    public double sum(double a, double b){
        return a+b;
    }

    public double subtraction(double a, double b){
        return a-b;
    }

    public double multiplication(double a, double b){
        return a*b;
    }

    public double division(double a, double b){
        return a/b;
    }
}
