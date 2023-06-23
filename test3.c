#include<stdio.h>

int a = 5, b = 10, c = 20;
int *p = NULL, *r = NULL, *s = NULL;

int main()
{
	r = &a;

	if (a == 5) {
		p = &a;
		r = &b;
	}
	else {
		p = &b;
		r = &c;
	}

	printf("\n *p = %d ", *p);
	printf("\n *r = %d", *r);

	return 0;
}
