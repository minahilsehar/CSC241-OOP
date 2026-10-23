public class OrderItem{
	private FoodItem item;
	private int quantity;
public OrderItem(FoodItem item,int quantity){
	this.item=item;
	this.quantity=quantity;
}
public FoodItem getItem(){
	 return item; 
}
public int getQuantity(){
	 return quantity; 
}
public double getSubTotal(){
	return item.getPrice()*quantity;
}
public void displayOrderItem(){
	    System.out.println("FoodItem: "+ item.getName()
            + " | Quantity: " +quantity
            + " | Price: " +item.getPrice()
            + " | Subtotal: " +getSubTotal());
}
}
