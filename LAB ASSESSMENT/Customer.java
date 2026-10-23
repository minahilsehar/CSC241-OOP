public class Customer{
	private int customerId;
	private String name;
	
Customer(int customerId, String name){
	this.customerId=customerId;
	this.name=name;
}
public int getCustomerId(){
	 return customerId; 
}
public String getName(){
	 return name; 
}
public void displayCustomer(){
	System.out.println("Name: "+name+""+"Customer ID: "+customerId);
}
}
