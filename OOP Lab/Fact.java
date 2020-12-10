//Program to find the factorial of a number
import java.util.*;
public class fact{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int i,fact=1;
System.out.println("Enter the number");

	int n=in.nextInt();	
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial of "+n+" is "+fact);
}
}