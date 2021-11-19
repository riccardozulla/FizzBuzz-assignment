package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

  public static void main(String... args) {
    int upperBound = 105;
    for (int i = 1; i < upperBound; ++i) {
      String test = "";
      test += i % 3 == 0 ? "Fizz" : "";
      test += i % 5 == 0 ? "Buzz" : "";
      test += i % 7 == 0 ? "Bang" : "";   //added for extended version

      System.out.println(test.isEmpty() ? i : test);
    }
  }

  public String convert(int number) {
    if (number % 15 == 0) {
      return "FizzBuzz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    return Integer.toString(number);
  }
  public void print() {
    Stream<String> FizzBuzzes = IntStream.range(1, 101).mapToObj(this::convert);
    System.out.println(FizzBuzzes.collect(Collectors.joining(", ")));
  }
}
