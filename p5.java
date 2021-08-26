//WAP to find roots of quadratic equation
import java.util.*;
class p5
{
public static void main(String[]args)
{
double a,b,c,d,r1,r2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for a,b and c");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=(b*b-4*a*c);
if(d<0)
{
System.out.println("Roots are imaginary");
}else{
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Root1="+r1);
System.out.println("Root2="+r2);
}
}
}

