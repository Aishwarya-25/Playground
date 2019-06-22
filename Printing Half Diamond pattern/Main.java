#include<stdio.h>
int main() 
{
int i,space,rows,star=0;
scanf("%d",&rows);
for(i=1;i<=rows;i++) {
for(space=1;space<=rows-i;space++) {
printf(" ");
}
while(star != (2*i-1)) {
printf("*");
star++;
}
star=0;
printf("\n");
}
return 0;
}