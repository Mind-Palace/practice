object exercise {

  def product(f:Int => Int)(a:Int, b:Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }

  product(x => x*x)(1,3)

  def factorial(n: Int) = product(x => x)(1, n)

  factorial(5)

  def mapReduce(f:Int => Int, combine: (Int, Int) => Int, unitValue: Int)(a:Int, b:Int): Int = {
    if (a > b) unitValue
    else combine(f(a), mapReduce(f, combine, unitValue)(a + 1, b))
  }

  mapReduce((x => x), (x, y) => x * y, 1)(1, 4)

}