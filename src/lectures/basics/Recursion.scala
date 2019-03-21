package lectures.basics

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      val result = n * factorial(n - 1)
      return result
    }

  def factorial2(n: Int): Int = {
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if(x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    }
    factorialHelper(n, 1)
  }
  // Stack over flow occurs when recursive depth is too large
/*
    factorialHelper(10, 1)
    factorialHelper(9, 10)
    factorialHelper(8, 9 * 10)
    factorialHelper(7, 8 * 9 * 10)
    ...
    factorialHelper(1, 1 * 2 * 3 * ... * 10)
    =  1 * 2 * 3 * ... * 10


 */
}
