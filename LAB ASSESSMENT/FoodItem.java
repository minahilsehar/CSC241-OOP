public class FoodItem{
	private int itemCode;
	private String name;
	private double price;
	private FoodCategory category;

public FoodItem(int itemCode,String name,double price,FoodCategory category){
	this.itemCode=itemCode;
	this.name=name;
	this.price=price;
	this.category=category;
}
public FoodItem(int itemCode,String name,double price){
	this(itemCode,name,price,FoodCategory.SNACK);
}
public int getItemCode(){
	return itemCode;
}
public String getName(){
	return name;
}
public double getPrice(){
	return price;
}
public FoodCategory getCategory(){
	return category;
}
public void displayItem(){
	System.out.println("Name: "+name+"     "+"Price: "+price+"	"+"Item Code: "+itemCode+"	"+"Food Category: "+"	");
}
}

	
	

























	