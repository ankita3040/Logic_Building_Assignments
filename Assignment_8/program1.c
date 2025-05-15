
/* Write a program which accept radius of circle from user and calculate its area.
Consider value of PI as 3.14. (Area = PI * Radius * Radius)

    INPUT : 5.3
    OUTPUT : 88.2026

    INPUT : 10.4
    OUTPUT : 339.6224

*/

#include<stdio.h>

double CircleArea(float fRadius)
{   
    const float PI = 3.14;
    double dArea  = 0;
    
    dArea = (PI * fRadius * fRadius);

    return dArea;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter radius : ");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of circle is %.4lf \n",dRet);

    return 0;
}

