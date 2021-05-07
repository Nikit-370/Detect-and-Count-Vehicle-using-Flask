import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int num;
int temp;
int rem=0;
int sum=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();

temp=num;

while(num>0)
{
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(temp==sum)
{
System.out.println("The number is Armstrong");
}
else
{
System.out.println("Not a Armstrong number");
}
}
}
