//WAP to find summation and subtraction of two matrices
import java.util.*;
class p26
{
public static void main(String[] args)
{
int[][] A=new int[3][3];
int[][] B=new int[3][3];
int[][] SUM=new int[3][3];
int[][] SUB=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter matrix A of(3*3)");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter matrix B of(3*3)");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
B[i][j]=sc.nextInt();
}
}
//Now we will find summation and subtraction of matrices
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
SUM[i][j]=A[i][j]+B[i][j];
SUB[i][j]=A[i][j]-B[i][j];
}
}
System.out.println("Summation of matrics");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
System.out.print(SUM[i][j]+" ");
}
System.out.print("\n");
}
System.out.println("Subtraction of matrics");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
System.out.print(SUB[i][j]+" ");
}
System.out.print("\n");
}
}
}