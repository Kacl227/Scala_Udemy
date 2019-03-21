package lectures.basics

object ValuesVariablesTypes extends App {
  // val <varname>: <type> = <value>
  val x: Int = 42

  // types are optional, compiler is smart enough
  val y = 21
  println(x)

  // vals are intermediate constants, and they are immutable
  // semicolons are optional,
  // unless multiple expressions are on same line

  // String- characters in double quotes
  val aString: String = "hello"

  val aBoolean: Boolean = false

  // Char- single character in single quotes
  val aChar: Char = 'a'
  val aShort: Short = 32767

  // 2^63 - 1: L is required since this num is longer than max int,
  // and long is int subtype
  val aLong: Long = 9223372036854775807L

  // f is necessary to indicate to compiler this is float, not double
  val aFloat: Float = 3.1f
  val aDouble: Double = 3.2

  // variables are mutable, prefer vals over vars in functional programming
  var aVariable: Int = 4
}
