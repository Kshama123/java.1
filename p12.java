//WAP to find factorial of given number
import java.util.*;
class p12
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n,fact=1;
System.out.println("Enter any number");
n=sc.nextInt();
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println("Factorial="+fact);
}
}
