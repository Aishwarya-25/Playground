#include<stdio.h>
int main()
{
int i,j,k,n;
scanf("%d",&n);
k=1;
for(i=1; i<=n; i++)
{
for(j=1; j<=i; j++)
{
if(k%2==1)
{
printf("*");
}
else
{
printf("#");
}
k++;
}
printf("\n");
}
return 0;
}