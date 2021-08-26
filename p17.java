//WAP to find sum and average of ten numbers using array
import java.util.*;
class p17
{
public static void main(String[] args)
{
int [] x=new int[10];
int i,sum=0;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 numbers in list");
for(i=0; i<10; i++)
{
x[i]=sc.nextInt();
sum=sum+x[i];
}
avg=sum/10;
System.out.println("Sum="+sum);
System.out.println("Average="+avg);
}
}