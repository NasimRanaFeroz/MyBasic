#include <stdio.h>
#include <stdlib.h>

void money(int a)
{
    if(a < 500){
        printf("Awww!");
    }
    else{
        printf("Wooooooow!");
    }
}

int main()
{
    money(8);
    return 0;
}
