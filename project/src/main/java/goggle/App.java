package goggle;

import java.util.Scanner;

public class DisariumNo {
public static void main(String[]args) 
{
	int no;
	Scanner sc=new Scanner(System.in);
	no=sc.nextInt();
	int n=no;
	int sum=0;
	int count=0;
	int copy=no;
	while(n!=0)
	{
		n=n/10;
		count++;
	}
	while(no!=0)
	{
		int rem=no%10;
		sum+=Math.pow(rem, count);
		count--;
		no=no/10;
	}
	if(copy==sum)
	{
		System.out.println("Disarium");
	}else
	{
		System.out.println("not Disarium");
	}
}
}