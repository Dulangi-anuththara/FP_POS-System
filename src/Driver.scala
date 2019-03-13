object Driver {
  def main(args:Array[String]): Unit ={

    val inventory=new Inventory()
    var opt:Int=1

    do{

      println("\nSelect an option :")
      println("1 - Add an item to the inventory")
      println("2 - Delete item from the inventory")
      println("3 - Update the price of an item")
      println("4 - Print inventory details")
      println("5 - Purchase items")
      println("0 - Exit")

      opt=scala.io.StdIn.readInt()


      opt match {
        case 1 =>

          println("Enter the Item ID :")
          val id:Int=scala.io.StdIn.readInt()
          println("Enter the Item Quantity :")
          val quantity:Int=scala.io.StdIn.readInt()

          inventory.addQuantity(id,quantity)

          println("Inventory Updated Successfully")

          inventory.printItems()

        case 2 =>

          println("Enter the Item ID :")
          val id:Int=scala.io.StdIn.readInt()
          println("Enter the Item Quantity :")
          val quantity:Int=scala.io.StdIn.readInt()

          inventory.reduceQuantity(id,quantity)
          inventory.printItems()

        case 3 =>

          println("Enter the Item ID :")
          val id:Int=scala.io.StdIn.readInt()
          println("Enter the Item Price :")
          val price:Double=scala.io.StdIn.readInt()

          inventory.updatePrice(id,price)
          println("Price Updated Successfully")

          inventory.printItems()

        case 4 =>

          inventory.printItems()

        case 5 =>

          var opt2:Int=1
          var amount:Double=0

          do{

            println("\nSelect an option :")
            println("1 - Purchase item")
            println("0 - Checkout and get the total amount")

            opt2=scala.io.StdIn.readInt()

            opt2 match {
              case 1 =>

                println("Enter the Item ID :")
                val id:Int=scala.io.StdIn.readInt()
                println("Enter the Required Quantity :")
                val quantity:Int=scala.io.StdIn.readInt()

                var retVal:Double=inventory.purchaseItems(id,quantity)

                if(retVal!=0){
                  amount=amount+(retVal*quantity)
                }

              case _ =>

                println("\nPurchase finished\n")
                println("Total Amount : "+amount+"\n")
                opt=0
            }

          }while(opt2!=0)

          inventory.printItems()

        case 0 =>

          opt=0

        case _ =>

          println("Invalid option")

      }
    }while(opt!=0)






  }

}
