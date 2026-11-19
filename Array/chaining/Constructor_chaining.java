package chaining;

public class Constructor_chaining {
int age;
String name;
 Constructor_chaining(){
    this("Ankit",21);
 }
    

 Constructor_chaining(String name,int age){
    this.age=age;
    this.name=name;


 }

 void  display(){
    System.out.println(name);
    System.out.println(age);
 }
}
