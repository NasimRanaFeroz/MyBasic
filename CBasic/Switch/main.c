#include <stdio.h>
#include <stdlib.h>

int main()
{
    char grade = 'A';

    switch(grade){
      case 'A' : printf("Great!");
      break;
      case 'B' : printf("Okay!");
      break;
      case 'C' : printf("Bad!");
      break;
      case 'D' : printf("Very Bad!");
      break;
      case 'F' : printf("Falied!");
      break;
      default : printf("Invalid Grade.");
      break;

    }

    return 0;
}
