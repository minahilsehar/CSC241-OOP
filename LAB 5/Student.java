public class Student{
  public String name;
  public int age;
Student(String name, int age){
        this.name = name;   
        this.age = age;
}
Student(int age){
        this.age = age;
}
public void display(){
   System.out.println("Name:"+name);
   System.out.println("Age:"+age);
 }
}
  