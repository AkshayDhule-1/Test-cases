#include<stdio.h>

int a = 5, b = 10, c = 20;
int *p = NULL, *r = NULL, *s = NULL;


int main()
{

	r = &a;
	p = &c;

	if(a==5){

		if (b==2)
		{
			r= &b;
		}
		else
		{
			if(c==20)
			{
				r=&a;
			}
			r=&c;
		}
	}


	printf("\n *r = %d", *r);

	printf("\n *p = %d", *p);

	return 0;
}
