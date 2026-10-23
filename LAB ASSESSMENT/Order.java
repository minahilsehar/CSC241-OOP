public class Order{
	private	int orderNo;
	private Customer customer;
	private OrderItem[] items;
	private int itemCount=0;

public Order(int orderNo,Customer customer){
	this(orderNo,customer,5);
}

public Order(int orderNo,Customer customer,int capacity){
	this.orderNo=orderNo;
	this.customer=customer;
	if(capacity<=0){
	capacity=5;
}
	this.items=new OrderItem[capacity];
	this.itemCount=0;
}
public void addItem(FoodItem food, int quantity){
	if(food==null){
	System.out.println("Cannot add. Food item is null.");
	return;
}
else if(quantity<=0){
	System.out.println("Cannot add"+food.getName()+":Quantity must be positive.");
	return;
}
else if(itemCount==items.length){
	System.out.println("Cannot add"+food.getName()+":Order is full");	return;
}
items[itemCount] =new OrderItem(food,quantity);
        itemCount++;
}

public void findItem(int itemCode) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItem().getItemCode() == itemCode) {
                System.out.println("Item Found: " + items[i].getItem().getName()
                        + " | Quantity: " + items[i].getQuantity());
                return;
            }
        }
        System.out.println("Item not found");
}

public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
        total += items[i].getSubTotal();
 }
        return total;
 }

public void displayOrder(){
    System.out.println("Order No: " + orderNo);
    customer.displayCustomer();
    System.out.println("--- Order Items ---");

    for (int i = 0; i < itemCount; i++){
    items[i].displayOrderItem();
}

    System.out.println("Total Bill: Rs. " + calculateTotal());
}
}


	







	















