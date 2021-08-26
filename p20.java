//WAP to take user name as input and display name in uppercase, lowercase,and find length also.
import java.util.*;
class p20
{
public static void main(String[] args)
{
String name;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name :");
name=sc.nextLine();
System.out.println("Name in uppercase="+name.toUpperCase());
System.out.println("Name in lowercase="+name.toLowerCase());
System.out.println("Length of name="+name.length());
}
}