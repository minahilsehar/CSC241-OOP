public class Person{
     private String id ="SP26-BAI-032" ;
     private String name;
     private String email;
     //private String dob;
     private Date dob;              //Date is a user defined class.
     private String city;

 public Person(String name,String email){
            this(id,name,email,"Default dob");     
  }
 public Person(String name,String email, String dob, String city){  
            this.name=name;
            this.email=email;
            this.dob= dob;
            this.city=city;
}
public Person (String name, String email, Date dob){
            this(name.email,dob,"Default city");
public void display(){
            System.out.println("ID :"+id);
            System.out.println("Name :"+name);
            System.out.println("Email :"+email);
            System.out.println("dob :"+dob);
            System.out.println("City :"+city);
  }

}
           
