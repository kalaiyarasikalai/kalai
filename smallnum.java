import java.util.*;
class smallnum
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String l=s.next();
int k=s.nextInt();
int a[]=new int[l.length()];
int n=Integer.parseInt(l);
int i=0;
if(n>0)
{
while(n>0)
{
int c=n%10;
a[i++]=c;
n=n/10;
}
Arrays.sort(a);
for(int j=0;j<l.length()-k;j++)
System.out.print(a[j]);
}
else
System.out.println("0");
}
}
