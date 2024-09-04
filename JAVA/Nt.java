import java.util.Scanner;
class Nt
{
public static void main(String[] args)
{
int a,b,c;
Scanner ns = new Scanner(System.in);
a = ns.nextInt();
b = ns.nextInt(); 
c = ns.nextInt();
if((a>b)&&(a>c))
{
System.out.println(a + " is Greater");
}
else if((b>a)&&(b>c))
{
System.out.println(b + " is Greater");
}
else
{
System.out.println(c + " is Greater");
}
 }
  }

