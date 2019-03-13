class Inventory {
    var item1=new Item(1,"Pen",25.00, 10)
    var item2=new Item(2,"Pencil",15.00, 10)
    var item3=new Item(3,"Book",50.00, 10)


    def addQuantity(itemId:Int,itemQuantity:Int):Unit ={
        val selectId:Int=itemId
        selectId match {
            case 1 =>
                item1.quantity=item1.quantity+itemQuantity

            case 2 =>
                item2.quantity=item2.quantity+itemQuantity

            case 3 =>
                item3.quantity=item3.quantity+itemQuantity

            case _ =>
                println("Please enter a valid Item ID!")

        }
    }


    def reduceQuantity(itemId:Int,itemQuantity:Int)={
        val selectId:Int=itemId
        selectId match {
            case 1 =>
                if(item1.quantity<itemQuantity){
                    println("Quantity not available")
                }else{
                    item1.quantity=item1.quantity-itemQuantity
                    println("Inventory Updated Successfully")
                }

            case 2 =>
                if(item2.quantity<itemQuantity){
                    println("Quantity not available")
                }else{
                    item2.quantity=item2.quantity-itemQuantity
                    println("Inventory Updated Successfully")
                }

            case 3 =>
                if(item3.quantity<itemQuantity){
                    println("Quantity not available")
                }else{
                    item3.quantity=item3.quantity-itemQuantity
                    println("Inventory Updated Successfully")
                }

            case _ =>
                println("Please enter a valid Item ID!")

        }
    }


    def updatePrice(itemId:Int,itemPrice:Double)={
        val selectId:Int=itemId
        selectId match {
            case 1 =>
                item1.price=itemPrice

            case 2 =>
                item2.price=itemPrice

            case 3 =>
                item3.price=itemPrice

            case _ =>
                println("Please enter a valid Item ID!")

        }
    }

    def printItems()={
        println("Item ID    Item Name   Quantity    Price")
        println("  "+item1.id+"         "+item1.name+"          "+item1.quantity+"        "+item1.price)
        println("  "+item2.id+"         "+item2.name+"       "+item2.quantity+"        "+item2.price)
        println("  "+item3.id+"         "+item3.name+"         "+item3.quantity+"        "+item3.price)

    }


    def purchaseItems(itemId:Int,itemQuantity:Int):Double={
        val selectId:Int=itemId
        selectId match {
            case 1 =>
                if(item1.quantity<itemQuantity){
                    println("Quantity not available")
                    return 0
                }else{
                    item1.quantity=item1.quantity-itemQuantity
                    return item1.price
                }

            case 2 =>
                if(item2.quantity<itemQuantity){
                    println("Quantity not available")
                    return 0
                }else{
                    item2.quantity=item2.quantity-itemQuantity
                    return item2.price
                }

            case 3 =>
                if(item3.quantity<itemQuantity){
                    println("Quantity not available")
                    return 0
                }else{
                    item3.quantity=item3.quantity-itemQuantity
                    return item3.price
                }

            case _ =>
                println("Please enter a valid Item ID!")
                return 0

        }
    }



}