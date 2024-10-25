#include <stdio.h>
#include <stdlib.h>

double area(double height, double lenth)
{
    double result = height * lenth;
    return result;
    printf("I don't matter.");
}

int main()
{
    printf("Answer: %f.\n", area(3.4, 5.6));

    return 0;
}
