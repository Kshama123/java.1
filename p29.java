//WAP to find volume of cuboid using user defined non-static method in java.
import java.util.*;
class p29
{
public static void main(String[] args)
{
int l,b,h,v;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,breadth and height of cuboid");
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
p29 p=new p29();//object of class p29
v=p.volume(l,b,h);
System.out.println("Volume of cuboid="+v);
}
public int volume(int l,int b,int h) //Non-static method(Instance Method)
{
//return(l*b*h);
int v;
v=l*b*h;
return v;
}
}