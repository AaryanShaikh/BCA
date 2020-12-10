#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b;
	clrscr();
	printf("Enter the first number\n");
	scanf("%d",&a);
	printf("Enter the second number\n");
	scanf("%d",&b);
	
	if(a>b)
	{
		printf("The first number is greatest");
	}
	else{
		
	printf("The second number is greatest");
	}
	getch();
}