package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

  public static void main(String... args) {
    int upperBound = 105;
    for (int i = 1; i < upperBound; ++i) {
      String test = "";
      test += isMultipleOf(i, 3) ? "Fizz" : "";
      test += isMultipleOf(i, 5) ? "Buzz" : "";
      test += isMultipleOf(i, 7) ? "Bang" : "";   //added for extended version

      System.out.println(test.isEmpty() ? i : test);
    }
  }

  public String convert(int number) {
    if (isMultipleOf(number, 15)) {
      return "FizzBuzz";
    }
    if (isMultipleOf(number, 5)) {
      return "Buzz";
    }
    if (isMultipleOf(number, 3)) {
      return "Fizz";
    }
    return Integer.toString(number);
  }

  private static boolean isMultipleOf(int number, int i) {
    return number % i == 0;
  }

  public void print() {
    Stream<String> FizzBuzzes = IntStream.range(1, 101).mapToObj(this::convert);
    System.out.println(FizzBuzzes.collect(Collectors.joining(", ")));
  }
}
