#include<stdio.h>
int main()
{
  int n,last;
  scanf("%d",&n);
  last=(n%100)/10;
  printf("%d",last);
  return 0;
}