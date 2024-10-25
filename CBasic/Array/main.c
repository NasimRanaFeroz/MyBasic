#include <stdio.h>
#include <stdlib.h>

int main()
{
    int primeNumbers[] = {2, 3, 5, 7, 11, 13};
    primeNumbers[3] = 45;
    printf("%d\n", primeNumbers[3]);

    int oddNumbers[10];
    oddNumbers[0] = 1;
    printf("%d\n", oddNumbers[0]);

    return 0;
}
