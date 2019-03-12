object Driver {
  def main(args:Array[String]): Unit ={
    println("Enter an Item ID")
    val a:Int=scala.io.StdIn.readInt()
    println("Enter an Item Name")
    val b:String=scala.io.StdIn.readLine()
    println("Enter an Item Price")
    val c:Int=scala.io.StdIn.readInt()
    val item1=new Item(a,b,c)
    item1.printDetails()
    
  }

}
