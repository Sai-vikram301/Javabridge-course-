import java.util.Scanner;
class Acer
{
public static void main(String[] args)
{
Scanner nk=new Scanner(System.in);
int a=nk.nextInt();
float average;
int sum=0,i;
int marks[]=new int[a];
for(i=0;i<a;i++)
{
marks[i]=nk.nextInt();
sum=sum+marks[i];
}
System.out.println(sum);
average=sum/a;
System.out.println(average);
}
}