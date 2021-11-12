package dssc.assignment.fizzbuzz;

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
}
