public class Product{
     private String id;
     private String name;
     private double price;
     private double quantity;
     private static double maxPrice=0;
     private static double minPrice=0;
     private static int count = 0;
     private Date md;
Product(String name,double price,double quantity,Date md){

    Product(String name,double price,double quantity){
    this.id= String.format("P%03d",count++);
    this.name=name;
    this.price=price;
    this.quantity=quantity; 
    this.md=md;
    if(count==1) {
    minPrice=price;
    maxPrice=price;
} 
   if(count>1 && minPrice>price){
    minPrice=price;
}
   if(count>1 && maxPrice<price){
    maxPrice=price; 
} 
}
public void display(){
  
   System.out.println("ID: %-20s \n "+id);
   System.out.println("Name: %-20s \n "+name);
   System.out.println("Quantity: %.2f \n "+quantity);
   System.out.println("Price: %s \n "+price);
   System.out.println("Max Price: %s %2f \n "+maxPrice);
   System.out.println("Min Price: %s %2f\n "+minPrice);
   System.out.println("Manufacturing Date: %s \n "+md.toString());

 }
}




















    
    
    

    