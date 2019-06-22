#include <stdio.h>
int main()
{
int num, temp, rem, sum = 0;
scanf("%d", &num);
temp = num;
while (num != 0)
{
rem = num % 10;
sum += rem * rem * rem;
num = num / 10;
}
if (temp == sum)
printf("Armstrong Number", temp);
else
printf("Not an Armstrong Number", temp);
return 0;
}