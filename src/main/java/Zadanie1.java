import java.util.stream.IntStream;

public class Zadanie1 {

    /*
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/

    public static int theSquareOfTheSum() {
        int sum = IntStream.rangeClosed(1, 100)
                .reduce(0, Integer::sum);
        return sum * sum;
    }
    public static int theSumOfTheSquares() {
        return IntStream.rangeClosed(1, 100)
                .map(x -> x * x)
                .sum();
    }

    public static void finalNumber(){
        int result = theSquareOfTheSum()- theSumOfTheSquares();
        System.out.println("The Square of the Sum = "+theSquareOfTheSum());
        System.out.println("The Sum of the Squares = "+theSumOfTheSquares());
        System.out.println("Wynik: "+result);
    }

}
