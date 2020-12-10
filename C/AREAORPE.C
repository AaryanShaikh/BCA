#include<stdio.h>
#include<conio.h>
void main()
{
	int l,b,a,p;
	clrscr();
	printf("Enter the length \n");
	scanf("%d",&l);
	printf("Enter the breath \n");
	scanf("%d",&b);
	a=l*b;
	p=2*(l*b);
	if(a>p)
	{
			printf("Area is greater \n");
	}
	else
	{
			printf("perimeter is greater \n");

	}
	getch();
}

	
