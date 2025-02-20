public class Employee
{
String Empname;

int Salary;

public Employee(String E,int S){
Empname=E;
Salary=S;
}

public void display(){
System.out.println("Employee Name: "+Empname);
System.out.println("Employee Salary: "+Salary);

}
public static void main(String[]args){

Employee emp=new Employee("prasad patil",25000);
emp.display();
}
}