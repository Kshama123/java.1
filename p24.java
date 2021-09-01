//Word counter
import java.util.*;
class p24
{
public static void main(String[] args)
{
String sen;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a sentence :");
sen=sc.nextLine();

String[] words=sen.split(" ");
int wc=words.length;
System.out.println("Number of words="+wc);
}
}


