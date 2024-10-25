#include <iostream>

using namespace std;

void sort(int array[], int size);

int main()
{
    int unsorted[] = {6,8,5,3,9,1,2,4};
    int size = sizeof(unsorted)/sizeof(unsorted[0]);

    sort(unsorted,size);

    for(int element : unsorted){
        cout << element << " ";
    }

    return 0;
}
 void sort(int array[], int size){
     int temp;
     for(int i=0; i<size-1; i++){
        for(int j=0; j<size-i-1; j++){
            if(array[j]>array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
     }


 }
