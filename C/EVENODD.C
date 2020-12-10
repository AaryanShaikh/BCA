#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b;
	clrscr();
	printf("Enter the number\n");
	scanf("%d",&a);
	b=a%2;
	if(b==0)
	{
		printf("the number is even number\n");
	}
	else{
		printf("The number is odd number\n");
	}
	getch();
}