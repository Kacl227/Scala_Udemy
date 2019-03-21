package lectures.basics

object Functions extends App {
  // def <name>(<param1Name>: <param1Type>,...): <ReturnType> = {}
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("taco", 2))

  // We can leave out return type of function, if it is not recursive
  def aParameterlessFunction() = 42
  // Parameter-less functions don't need parentheses
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, numRuns: Int): String = {
    if (numRuns == 1) aString
    else aString + aRepeatedFunction(aString, numRuns-1)
  }

  println(aRepeatedFunction("Puppies", 4))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int) = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
    1. Create a greeting function which prints string with name and age
    2. Factorial function
    3. Fibonacci function
    4. Test if a number is prime
  */

  def greeting(name: String, age: Int): Unit =
    println("Hi, my name is " + name + " and I am " + age + " years old")

  greeting("Katie", 23)

  def factorial(num: Int): Int =
    if (num==1) 1
    else num * factorial(num-1)

  println(factorial(5))

  def fibonacci(num: Int): Int =
    if (num==1 || num==2)
      1
    else
      fibonacci(num - 1) + fibonacci(num - 2)

  /* fibonacci(5) = fibonacci(4) + fibonacci(3)
      = fibonacci(3) + fibonacci(2) + fibonacci(2) + fibonacci(1)
      = fibonacci(2) + fibonacci(1) + 1+ 1 + 1
      = 1 + 1 + 1 + 1 + 1 = 5
   */

  println("Fibonacci:" + fibonacci(5).toString)

  def isPrime(num: Int): Boolean = {
    def isFactor(factor: Int) = (num / factor.toDouble != (num / factor.toDouble).toInt)

    def isPrimeUntil(factor: Int): Boolean = {
      if (factor == 1) true
      else
        isPrimeUntil(factor - 1) && isFactor(factor)
    }

    // loop through every item between 1 and num / 2, checking if it is a factor
    val highestPotentialFactor = (num / 2)
    isPrimeUntil(highestPotentialFactor)
  }

  println(isPrime(49))
  println(isPrime(2003))
}
