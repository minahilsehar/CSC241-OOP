    public class demo{
       public static void main(String args[]){ 
         
         Person p1=new Person("Ali","email");
         // Constructor called. If arguments not passed to constructor it will give error.
         Person p2=new Person("Ahmed","@email",new Date(),"Lahore");
         Person p3=new Person("Ahmed","@email, null);

  
         p1.display();
         p2.display();
         p3.display();
         
  }
}


         