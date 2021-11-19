package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Convert {

  @ParameterizedTest
  @CsvSource({"1, 1", "2, 2", "40, 40"})
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

  @Test
  void number_5_to_Buzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Buzz", fizzBuzz.convert(5));
  }
  @Test
  void number_10_to_Buzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Buzz", fizzBuzz.convert(10));
  }

  @Test
  void number_50_to_Buzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("Buzz", fizzBuzz.convert(50));
  }
}
