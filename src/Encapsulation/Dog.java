package Encapsulation;
//Create Dog class as specified in problem statement
class Dog{
 public String name;
 public String breed;
 public int age;
 
 public Dog(String name,String breed,int age){
     this.name=name;
     this.breed=breed;
     this.age=age;
 }
 Dog(){
     
 }
}

class Main {
 public static void main(String[] args) {
     // Create two Dog objects dog1 and dog2
     
     Dog dog1=new Dog("Tommy","Golden Retriever",3);
     Dog dog2=new Dog("Jacky","Pug",2);

     // Set the attributes of both Dog objects
     
     // Printing for the attributes of the first Dog object
     System.out.println("Information for the first dog");
     System.out.println("Name: " + dog1.name);
     System.out.println("Breed: " + dog1.breed);
     System.out.println("Age: " + dog1.age);
     System.out.println();
     // Printing for the attributes of the second Dog object
     System.out.println("Information for the second dog");
     System.out.println("Name: " + dog2.name);
     System.out.println("Breed: " + dog2.breed);
     System.out.println("Age: " + dog2.age);
 }
}