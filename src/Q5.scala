object Q5 extends App{
  def evenSum(n: Int): Int = {
    if (n <= 2) 0
    else if (n % 2 == 0) n - 2 + evenSum(n - 2)
    else n - 1 + evenSum(n - 1)
  }

  println(evenSum(6))
  println(evenSum(5))
}
