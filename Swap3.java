import java.util.Scanner;
class Swap3{
public static void main(String args[])
{
int a,b;
Scanner obj1 = new Scanner(System.in);
System.out.println("Enter value of a:");
a=obj1.nextInt();
System.out.println("Enter value of b:");
b=obj1.nextInt();
System.out.println("Before Swapping a= "+a);
System.out.println("Before Swapping b= "+b);
b=a+b;
a=b-a;
b=b-a;
System.out.println("After Swapping a= "+a);
System.out.println("After Swapping b= "+b);
}
}