class Item() {
  var id:Int=0
  var name:String="abc"
  var price:Double=0.0
  var quantity:Integer=0

  def printDetails()={
    println("Item ID : "+id)
    println("Item Name : "+name)
    println("Item Price : Rs. "+price)
    println("Item Quantity : Rs. "+quantity)
    
  }

  def addItems(itemId:Int, itemName:String, itemPrice:Double, itemQuantity:Int): Unit ={
    this.id=itemId
    this.name=itemName
    this.price=itemPrice
    this.quantity=itemQuantity

  }

}
