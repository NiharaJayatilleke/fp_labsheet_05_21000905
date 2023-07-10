object Q3 extends App{
  def sum(n:Int):Int={
    if (n>0)
      n + sum(n-1)
    else 0
  }

  println(sum(5))
}
