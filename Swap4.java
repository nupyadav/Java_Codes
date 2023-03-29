import java.util.Scanner;
class Swap4{
int a,b;
public static void main(String args[])
{
Scanner obj1= new Scanner(System.in);
Swap4 val= new Swap4();
System.out.println("Enter the value of a:");
val.a= obj.nextInt();
System.out.println("Enter the value of b:");
val.b= obj1.nextInt();
System.out.println("Before Swapping a= "+val.a);
System.out.println("Before Swapping b= "+val.b);
val.b=val.a+val.b;
val.a=val.b-val.a;
val.b=val.b-val.a;
System.out.println("After Swapping a= "+val.a);
System.out.println("After Swapping b= "+val.b);
}
}