#include<stdio.h>
int main()
{
int num, sum, digits, firstDigit, lastDigit;
sum = 0;
scanf("%d", &num);
lastDigit  = num % 10;
digits    = (int) log10(num); 
firstDigit = (int) (num / pow(10, digits)); 
sum = firstDigit + lastDigit; 
printf("%d", sum);
return 0;
}