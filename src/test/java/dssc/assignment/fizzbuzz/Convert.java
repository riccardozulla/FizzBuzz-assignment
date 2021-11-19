package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Convert {

  private final FizzBuzz fizzBuzz = new FizzBuzz();

  @ParameterizedTest
  @CsvSource({"1, 1", "2, 2", "41, 41"})
  void multiple_of_3_and_5(int number, String expected) {
    Assertions.assertEquals(expected, fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 27})
  void numbers_divisible_by_3_to_Fizz(int number) {
    Assertions.assertEquals("Fizz", fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 50})
  void multiple_of_5_to_Buzz(int number) {
    Assertions.assertEquals("Buzz", fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 45, 75})
  void multiple_of_3_and_5_to_FizzBuzz(int number) {
    Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(number));
  }
}
