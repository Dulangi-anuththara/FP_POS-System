class Inventry {



    def addItem1(itemId:Int, itemName:String, itemPrice:Double, itemQuantity:Int):Unit ={
        val item=new Item(itemId,itemName,itemPrice,itemQuantity)

    }

    def addItem2(itemId:Int, itemName:String, itemPrice:Double, itemQuantity:Int):Unit ={
        val item=new Item(itemId,itemName,itemPrice,itemQuantity)

    }

    def addItem3(itemId:Int, itemName:String, itemPrice:Double, itemQuantity:Int):Unit ={
        val item=new Item(itemId,itemName,itemPrice,itemQuantity)

    }

    def deleteItem1()={
        println("Enter Item ID to purchase : ")
        val getId:Integer=scala.io.StdIn.readInt()
        println("Enter Item Quantity to purchase : ")
        val getQuantity:Integer=scala.io.StdIn.readInt()
    }

    def deleteItem2()={
        println("Enter Item ID to purchase : ")
        val getId:Integer=scala.io.StdIn.readInt()
        println("Enter Item Quantity to purchase : ")
        val getQuantity:Integer=scala.io.StdIn.readInt()
    }


    def deleteItem3()={
        println("Enter Item ID to purchase : ")
        val getId:Integer=scala.io.StdIn.readInt()
        println("Enter Item Quantity to purchase : ")
        val getQuantity:Integer=scala.io.StdIn.readInt()
    }

}