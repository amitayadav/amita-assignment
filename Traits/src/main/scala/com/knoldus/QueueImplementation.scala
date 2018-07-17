import scala.collection.mutable.ListBuffer

trait Queue{
  val queue=new scala.collection.mutable.ListBuffer[Int]
  def enqueue(val newElement: Int): Unit= {
    /*if(queue.)
      println("queue is full")
   else*/
      queue += newElement
  }
  def dequeue={
    if(queue.isEmpty)
      println("queue is empty")
    else
      queue.remove(0)
  }
}
