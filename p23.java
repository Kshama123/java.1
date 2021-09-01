//WAP to enter a sentence, now find word in sentence and replace that word into the word.    sen-->sentence  fw--->find what   rw-->replace with
import java.util.*;
class p23
{
public static void main(String[] args)
{
String sen,fw,rw;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a sentence :");
sen=sc.nextLine();
System.out.print("Find what?");
fw=sc.nextLine();
System.out.print("Replace with :");
rw=sc.nextLine();
System.out.println("Modified sentence="+sen.replace(fw,rw));
}
}

