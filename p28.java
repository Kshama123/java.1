//WAP to find sum of two numbers using user defined static maethod.
import java.util.*;
class p28
{
//here we can create method
static int add(int a,int b)
{
return(a+b);
}
public static void main(String[] args)
{
int x,y,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
x=sc.nextInt();
y=sc.nextInt();
sum=add(x,y);
System.out.println("Sum="+sum);
}
//Here we can create method
}