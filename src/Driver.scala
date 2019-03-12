object Driver {
  def main(args:Array[String]): Unit ={
    println("Enter the Item ID :")
    val id:Int=scala.io.StdIn.readInt()
    println("Enter the Item Name :")
    val name:String=scala.io.StdIn.readLine()
    println("Enter the Item Price :")
    val price:Double=scala.io.StdIn.readDouble()
    val item1=new Item()
    println("Enter the Item Quantity :")
    val quantity:Int=scala.io.StdIn.readInt()

    item1.addItems(id,name,price,quantity)
    item1.printDetails()
    
  }

}
