#include<stdio.h>
#include<conio.h>
void main()
{
	int n,i,r,flag=0;
	clrscr();
	printf("Enter the number\n");
	scanf("%d",&n);
	for(i=2;i<=(n-1);i++)
	{
		r=n%i;
		if(r==0)
		{
			flag=1;
		}
	}
	if(flag==0)
	{
		printf("The number is prime\n");
	}
	else{
		printf("The number is not prime\n");
	}
	getch();
}