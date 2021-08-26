//WAP to generate fibonacci series up to n terms, where values of n is entered by user.
//0 1 1 2 3 5 8 13.................................n  terms



import java.util.*;
class p15
{
public static void main(String[] args)
{
int n1=0,n2=1,n3,n,i;
Scanner sc=new Scanner(System.in);
System.out.print("How many terms you want in series ?");
n=sc.nextInt();
System.out.println(n1);
System.out.println(n2);
for(i=1; i<=n-2; i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}