class Swap2{
int a=10, b=20;
public static void main(String args[])
{
Swap2 val=new Swap2();
System.out.println("Before Swapping a= "+val.a);
System.out.println("Before Swapping b= "+val.b);
val.b=val.a+val.b;
val.a=val.b-val.a;
val.b=val.b-val.a;
System.out.println("After Swapping a= "+val.a);
System.out.println("After Swapping b= "+val.b);
}
}