#include<stdio.h>
#include<conio.h>
void main()
{
	int rev=0,n,digit,temp,sum=0;
	clrscr();
	printf("Enter any 5 digit number\n");
	scanf("%d",&n);
	temp=n;
	while(temp>0)
	{
		digit=temp%10;
		sum=sum+digit;
		temp=temp/10;
	}
	while(n!=0)
	{
		rev=rev*10;
		rev=rev+n%10;
		n=n/10;
	}
	printf("the reverse is %d\n",rev);
	printf("the sum of digits is %d\n",sum);
getch();
	}

	