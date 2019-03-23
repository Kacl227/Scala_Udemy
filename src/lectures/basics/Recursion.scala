package lectures.basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      val result = n * factorial(n - 1)
      return result
    }

  def factorial2(n: Int): Int = {
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    }

    factorialHelper(n, 1) // Tail recursion
    // Use tail recursion instead of loops
    // Tail recursion occurs when recursive call is last call in function
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

  @tailrec
  def catHelper(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else catHelper(aString, n - 1, accumulator + aString)
  }

  def cat(aString: String, n: Int): String = {
    catHelper(aString, n, "")
  }

  println(cat("Pretzel", 6))

  @tailrec
  def primeHelper(num: Int, i: Int, accumulator: Boolean): Boolean = {
    if (!accumulator) false
    else if (i <= 1) true
    else {
      val isDivisible = num % i != 0
      primeHelper(num, i - 1, accumulator && isDivisible)
    }
  }

  def primeTailRec(num: Int): Boolean = {
    primeHelper(num, num / 2, true)
  }

  println(primeTailRec(2003))
  println(primeTailRec(629))

  def fibonnaci(numTerms: Int): Int = {
    // For tail recursive implementation of recursive func, you need
    // an accumulator for each recursive call
    @tailrec
    def fibonnaciHelper(n: Int, term1: Int, term2: Int): Int = {
      if (n == numTerms) term2
      else {
        fibonnaciHelper(n + 1, term2, term1 + term2)
      }
    }
    if (numTerms <= 2) 1
    else fibonnaciHelper(2, 1, 1)
  }

  println(fibonnaci(10))
}
