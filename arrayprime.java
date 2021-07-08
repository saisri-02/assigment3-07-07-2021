import java.util.*;
class Arrayprime
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int n=sc.nextInt();
int a[ ]=new int[n];
System.out.println("Enter elements in array : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
    int count=1;
    for(int j=2;j<a[i];j++)
    {
        if(a[i]%j==0)
        {
            count=0;
            break;
        }
    }
if(count==1)
{
     System.out.print(a[i]+" ");
}
}
}
}