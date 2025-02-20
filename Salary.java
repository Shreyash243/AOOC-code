import java.util.Scanner;
public class Salary
{

public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);

System.out.print("Enter the salary: ");

int Salary = scanner.nextInt();

if(Salary>10000)
{

System.out.println("Salary:"+Salary+2000);
}
else
{
System.out.println("Salary: "+Salary+1000);
}
}
}