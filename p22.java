//WAP to compare two strings for equality by using equalsIgnoreCase()
import java.util.*;
class p22
{
public static void main(String [] args)
{
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first string :");
str1=sc.nextLine();
System.out.print("Enter second string :");
str2=sc.nextLine();
if(str1.equalsIgnoreCase(str2))
{
System.out.println("Both strings are equal");
}
else
{
System.out.println("Both strings are not equals");
}
}
}