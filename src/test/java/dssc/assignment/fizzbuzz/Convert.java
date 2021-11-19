package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Convert {

  @ParameterizedTest
  @CsvSource({"1, 1", "2, 2", "41, 41"})
  void multiple_of_3_and_5(int number, String expected) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals(expected, fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 27})
  void numbers_divisible_by_3_to_Fizz(int number) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Fizz", fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 50})
  void multiple_of_5_to_Buzz(int number) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Buzz", fizzBuzz.convert(number));
  }
}
