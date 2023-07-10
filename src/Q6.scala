import scala.io.StdIn.readInt

object Q6 extends App{
  def fibonacci(n:Int):Int=n match{
    case 0 => 0
    case x if x==1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }

  def fibSeq(n:Int): Unit ={
    if(n>0)
      fibSeq(n-1)
    println(fibonacci(n))
  }

  printf("Enter a value for n: ")
  val m = readInt()
  fibSeq(m)
}
