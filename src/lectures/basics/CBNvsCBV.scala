package lectures.basics

object CBNvsCBV extends App{

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  // In call by value, parameter value is computed prior to function execution
  // From the computer's perspective, 'x' is directly replaced with the value computed
  calledByValue(System.nanoTime())

  // Expression is evaluated each time the param is used.
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34) This will cause stack overflow
  printFirst(34, infinite()) // lazy evaluation
}
