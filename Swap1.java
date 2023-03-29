class Swap1{
public static void main(String args[])
{
int a=10, b=20;
System.out.println("Before Swapping a= "+a);
System.out.println("Before Swapping b= "+b);
b=a+b;
a=b-a;
b=b-a;
System.out.println("After Swapping a= "+a);
System.out.println("After Swapping b= "+b);
}
}