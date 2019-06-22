#include<stdio.h>
int main()
{
int i,j,num;
scanf("%d",&num);
for(i=1; i<=num; i++)
{
for(j=1; j<num+1; j++)
{
printf("%d",i);
}
printf("\n");
}
return 0;
}