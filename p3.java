/*
Write a program to find volume and surface area of cuboid.
v=l*b*h;
surface area=2*(l*b+b*h+h*l);
*/
import java.util.Scanner;
class p3
{
public static void main(String[] args)
{
int l,b,h,v,sa;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,breadth and height of cuboid");
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
v=l*b*h;
sa=2*(l*b+b*h+h*l);
System.out.println("Volume of cuboid="+v);
System.out.println("Surface area of cuboid="+sa);
}
}


Output:--


D:\ST2021>javac p3.java

D:\ST2021>java p3
Enter length,breadth and height of cuboid
2 4 5
Volume of cuboid=40
Surface area of cuboid=76