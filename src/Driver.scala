object Driver {
  def main(args:Array[String]): Unit ={

    val inventry=new Inventry()


    println("Select an option :")
    println("1 - Add an item to the inventory")
    println("2 - Delete item from the inventory")

    var opt:Int=scala.io.StdIn.readInt()


    opt match {
      case 1 =>
        println("Enter the Item ID :")
        val id:Int=scala.io.StdIn.readInt()
        println("Enter the Item Name :")
        val name:String=scala.io.StdIn.readLine()
        println("Enter the Item Price :")
        val price:Double=scala.io.StdIn.readDouble()
        println("Enter the Item Quantity :")
        val quantity:Int=scala.io.StdIn.readInt()



        //inventry.addItems(id,name,price,quantity)

        println("Item added successfully")

      case 2 => println("Item purchased")

      case _ => println("Invalid option")

    }



  }

}
