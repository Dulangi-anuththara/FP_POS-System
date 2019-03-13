class Inventry {
    def purchaseItem()={
        println("Enter Item ID to purchase : ")
        val getId:Integer=scala.io.StdIn.readInt()
        println("Enter Item Quantity to purchase : ")
        val getQuantity:Integer=scala.io.StdIn.readInt()
    }

    def addItems(itemId:Int, itemName:String, itemPrice:Double, itemQuantity:Int):Unit ={
        val item=new Item(itemId,itemName,itemPrice,itemQuantity)

    }

    def printDetails()={

    }

}