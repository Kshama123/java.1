//WAP to convert a decimal number to it's binary,octal,hexa-decimal equivalent
import java.util.*;
class p27
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
n=sc.nextInt();
System.out.println("Binary="+Integer.toString(n,2));
System.out.println("Octal="+Integer.toString(n,8));
System.out.println("Hexa-decimal="+Integer.toString(n,16));
}
}