#include<stdio.h>
int a = 10, r= 5;
int **s = NULL;
int *p= NULL;
int *q= NULL;

int main()
{
	p = &a;
	s = &p;
	q = &p;

	q = &r;
	
	printf("q = %d\n",*q);
	s = &q;
	printf("s = %d\n",**s );
	printf("p = %d\n",*p );

	return 0;
}
