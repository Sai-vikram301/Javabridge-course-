import java.util.Scanner;
class Mark
{
public static void main(String[] args)
{
Scanner nk = new Scanner(System.in);
System.out.print("Enter Obtained Marks ");
int m = nk.nextInt();
if(m>=80)
{
System.out.println("You Got Grade 'A'");
}
else if(m>=50)
{
System.out.println("You Got Grade 'B'");
}
else if(m>=35)
{
System.out.println("You Got Grade 'C'");
}
else
{
System.out.println("You Got 'FAIL'");
}
}
}

