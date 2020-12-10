#include<stdio.h>
#include<conio.h>
void main()
{
	int l=0,a,i;
	clrscr();
	printf("Enter the number\n");

	for(i=1;i<=5;i++)
	{
		scanf("%d",&a);

		if(a>l)
		{
			l=a;
		}
	}
	printf("The largest of 5 numbers is=%d",l);
	getch();
}
	