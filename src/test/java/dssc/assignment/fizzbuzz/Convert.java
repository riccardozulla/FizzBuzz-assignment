package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Convert {

  @ParameterizedTest
  @CsvSource({"1, 1", "2, 2", "40, 40"})
  void numbers_not_divisible_by_3_and_5(int number, String expected) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals(expected, fizzBuzz.convert(number));
  }

  @Test
  void number_3_to_Fizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Fizz", fizzBuzz.convert(3));
  }

  @Test
  void number_6_to_Fizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Fizz", fizzBuzz.convert(6));
  }
}
