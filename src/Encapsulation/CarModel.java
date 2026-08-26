package Encapsulation;


//Complete the code for car class here
class Car{
 public String model;
 public String color;
 public int year;
 Car(String model,String color,int year){
     this.model=model;
     this.color=color;
     this.year=year;
 }
 Car(){
     
 }
 
}

class CarModel{
 public static void main(String[] args) {
     // Create new_car object for the Car class
     Car new_car=new Car();
     
     // initialized attributes for the new_car
     new_car.model = "Sedan";
     new_car.color = "Red";
     new_car.year = 2020;
     
     // Complete code for printing attributes for the Car class
     System.out.println(new_car.model);
     System.out.println(new_car.color);
     System.out.println(new_car.year);
             
 }
}
