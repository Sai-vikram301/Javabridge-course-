import java.util.Scanner;
public class Move
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("Enter number of elements:");
int n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++){
	System.out.println(arr[i]);
}
}
}


