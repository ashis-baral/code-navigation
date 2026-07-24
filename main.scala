class Calculator {
  def add(a: Int, b: Int): Int = {
    a + b
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val c = new Calculator()
    println(c.add(2, 3))
  }
}
