//Write a program to find greatest number in three unequal numbers.

import java.util.*;
class p6
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println("Greatest No="+a);
}
else if(b>a&&b>c)
{
System.out.println("Greatest No="+b);
}
else
{
System.out.println("Greatest No="+c);
}
}
}

