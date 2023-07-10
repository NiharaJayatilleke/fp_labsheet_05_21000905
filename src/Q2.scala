object Q2 extends App{
  def isPrime(k:Int, i:Int):Boolean=(i, k%i) match{
    case (x, _) if (x<=1) => true
    case (_, 0) => false
    case _ => isPrime(k, i-1)
  }

  def primeSeq(n:Int): Unit ={
    if(n>1) {
      primeSeq(n-1)
      if (isPrime(n, Math.sqrt(n).toInt))
        print(s"$n ")
    }
  }

  primeSeq(10)
}
