//WAP to make a simple calculator using switch
import java.util.*;
class p8
{
public static void main(String[]args)
{
int a,b,res=0,ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter 1 for addition");
System.out.println("Enter 2 for substaction");
System.out.println("Enter 3 for multiplication");
System.out.println("Enter 4 for division");
ch=sc.nextInt();
switch(ch)
{
case 1:
res=a+b;
System.out.println("Result="+res);
break;
case 2:
res=a-b;
System.out.println("Result="+res);
break;
case 3:
res=a*b;
System.out.println("Result="+res);
break;
case 4:
res=a/b;
System.out.println("Result="+res);
break;
default:
System.out.println("Invalid choice");
break;
}
}
}