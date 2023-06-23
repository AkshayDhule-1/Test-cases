#include<stdio.h>

int a=10,b=20;
int *p= NULL,*r=NULL;

int main()
{	
	p= &a;
	r = &b;
	printf("%d",*p);
	
	return 0;
}
