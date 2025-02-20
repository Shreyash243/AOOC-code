public class Student 
{
String Studentname;
int Studentid;
double Studentmarks;

public Student(String n,int i,double m){
Studentname=n;
Studentid=i;
Studentmarks=m;
}
public void display(){
System.out.println("Student name: "+Studentname);
System.out.println("Student Id: "+Studentid);
System.out.println("Student marks: "+Studentmarks);
}
public static void main(String[]args){

Student s1=new Student("Shreyash",120,98.55);

s1.display();
}
}