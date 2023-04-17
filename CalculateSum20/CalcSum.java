import java.util.stream.IntStream;


//Write a program that calculates the  sum of teh squares of the first 20 positive integers. 
//(1-20), use a lambda experssion to map each integer and then accumulate or sum the resulting
//stream of integers to a single value using the reduce() method.
//
//


public class CalcSum {
  public static void main(String[] args){ 
    int sumOfSquares = IntStream.rangeClosed(1,20)
      .map(x -> x*x)
      .reduce(0, (A, B) -> A + B);


  System.out.println("Sum of the first 20 squares is:" + sumOfSquares);
    
  }
}
