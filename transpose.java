import java.util.Scanner;
class Array
{	
int i,j,r,c,a[][],sum=0;
Scanner obj1=new Scanner(System.in);
void read()
{
System.out.println("enter no.of rows and cols:");
r=obj1.nextInt();
c=obj1.nextInt();
a=new int[r][c];
System.out.println("enter the matrix elements:");
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
{
 a[i][j]=obj1.nextInt();
}
}
}
void disp()
{
System.out.println("matrix");
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
void transpose()
{
System.out.println("Transpose ");
for(i=0;i<c;i++)
{
 for(j=0;j<r;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println(" ");
}
}
void trace()
{
if(r==c)
{
System.out.println ("Trace of the matrix");
for(i=0;i<c;i++)
{
sum=sum+a[i][i];
}
System.out.println(sum);
}
else
System.out.println(sum);
}
}

class transpose
{
public static void main(String args[])
{
Array a=new Array();
a.read();
a.disp();
a.transpose();
a.trace();
}
}
