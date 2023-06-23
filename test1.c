#include<stdio.h>

int a = 3, b = 10, c = 20;
int *x = NULL, *y = NULL;

int main()
{
	
	x = &a;
	
	y = &b;
	
	x = &c;

	
	printf("\n *y = %d ", *y);

	printf("\n *x = %d", *x);

	return 0;
}
