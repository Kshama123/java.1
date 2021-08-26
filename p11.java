//WAP to print the table of given number  //t=n*i;
import java.util.*;
class p11
{
public static void main(String[] args)
{
int n,i,t;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
n=sc.nextInt();
i=1;
while(i<=10)
{
t=n*i;
System.out.println(n+"*"+i+"="+t);
i++;
}
}
}