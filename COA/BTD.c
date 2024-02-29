//Implement a program for Binary to Decimal Conversion

#include<stdio.h>
void main()
{
  int dec=0,rem,n,bin,base=1;
  printf("ENTER BINARY NO.:");
  scanf("%d",&n);
  bin=n;
  while(n>0)
  {
    rem=n%10;
    dec=dec+rem*base;
    n=n/10;
    base=base*2;
  }
  printf("DECIMAL NUMBER OF GIVEN BINARY NO. IS :%d",dec);
}
