//Implement a program for Decimal to Binary Conversion

#include<stdio.h>
void dtb(int n)
{
    int i=0,j,a[n];
    while(n>0)
    {
        a[i]=n%2;
        n=n/2;
        i++;
    }
    for(j=i-1;j>=0;j--)
    {
        printf("%d",a[j]);
    }
}
void main()
{
    int a;
    printf("ENTER THE DECIMAL NUMBER: ");
    scanf("%d",&a);
    printf("BINARY NUMBER OF GIVEN DECIMAL NUMBER IS:");
    dtb(a);
}
