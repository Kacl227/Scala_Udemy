package lectures.basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println( 2 + 3 * 4)
  // Math operators: + - * /
  // Bitwise ops: & | ^ << >> >>>

  // Relational ops: == != > >= < <=

  // side effects: -= *= /= +=, only for variables

  // Instructions vs Expressions
  // Instructions do something, expressions have a type and value

  // IF in Scala is an expression, and returns a value
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  print(aConditionedValue)

  // Loops are discouraged in Scala
  var i = 0
  while (i < 10) {
    println(i)
    i +=  1
  }

  // Everything in scala is an expression
  // Never write this again
  var aVariable = 9

  // side effects are expressions returning 'Unit', aka void
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  // side effect examples: println(), while, reassignments

  // Code blocks
  // value of block is value of last expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  // 1. "hello world" has the value of "hello world", while
  // println("hello world") returns void
  // 2.
}
