public class Car{
String model;
int year;

public Car(){
model="Unknown";
year=0;
}
public static void main(String[]args){

Car MyCar=new Car();

System.out.println("Car Model : "+MyCar.model);
System.out.println("Manufacturing Year : "+MyCar.year);
}
}