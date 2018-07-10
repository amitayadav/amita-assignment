package edu.knoldus

class Sorting {

  def insertionSort(list: List[Int]): List[Int] = {
    val arr = list.toArray
    for(i <- 0 until arr.length)
    {
      val j=arr(i)
      var k=i

      while(k>0 && arr(k-1)> j)
      {

        arr(k)=arr(k-1)

        k-= 1
      }
      arr(k)=j
    }
     arr.toList

    //arr.toList



  }


  def selectionSort(list: List[Int]): List[Int] = {val arr = list.toArray
    for (i <- 0 until (arr.length -1))
    {
      var min = i
      //find min
      for(j <- (i+1) until arr.length)
      {
        if (arr(j) < arr(min))
          min = j
      }

      //swap ith number with that at min position
      if (i != min)
      {
        val swap = arr(i);
        arr(i) = arr(min);
        arr(min) = swap;
      }
    }
    arr.toList
  }

  def bubbleSort(list: List[Int]): List[Int] = {
    val arr = list.toArray
    for (i <- 0 until arr.length - 1; j <- 0 until arr.length - 1 - i)
    {
      if (arr(j) > arr(j + 1)) {
        val temp = arr(j)
        arr(j) = arr(j + 1)
        arr(j + 1) = temp
      }
    }
    arr.toList





  }


}
