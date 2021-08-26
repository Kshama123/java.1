//WAP to find sum of digits of given number
import java.util.*;
class p13
{
public static void main(String[] args)
{
int n,r,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
n=sc.nextInt();
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("Sum of digits="+sum);
}
}
