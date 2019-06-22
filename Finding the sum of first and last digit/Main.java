#include<stdio.h>
int main()
{
 int n,firstdigit,lastdigit,sum=0;
  scanf("%d",&n);
  lastdigit=n%10;
  firstdigit=n;
  while(n>=10)
  {
    n=n/10;
  }
  firstdigit=n;
  sum=firstdigit+lastdigit;
  printf("%d\n",sum);
  return 0;
}