//Store name of your 5 friends in array and display names in alphabetic order
import java.util.*;
class p18
{
public static void main(String[] args)
{
String [] name=new String[5];//Declaration of array
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter five names");
for(i=0; i<5; i++)
{
name[i]=sc.nextLine();
}
Arrays.sort(name);
System.out.println("Names in alphabetical order");
for(i=0; i<5; i++)
{
System.out.println(name[i]);
}
}
}
