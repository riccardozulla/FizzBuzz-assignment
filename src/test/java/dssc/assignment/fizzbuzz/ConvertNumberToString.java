package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertNumberToString {

  @Test
  void number_1(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  void number_2() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("2", fizzBuzz.convert(2));
  }
}
