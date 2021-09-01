//WAP to take a matrix of(3*3)store elements in matrix and display elements
import java.util.*;
class p25
{
public static void main(String[] args)
{
int[][] A=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a matrix of (3*3)");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("You have entered following matrix");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
System.out.print(A[i][j]+"");
}
System.out.print("\n");
}
}
}