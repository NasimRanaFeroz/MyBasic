#include <iostream>

using namespace std;

int searchArray(int array[], int element);

int main()
{
    int numbers[] = {3,4,2,1,5,6,7,8,9};
    int input;
    int result;

    cout <<"Enter element to search: "<< '\n';
    cin>>input;

    result = searchArray(numbers, input);

    if(result != -1){
        cout << "You have "<< input<<" at "<< result<<'\n';
    }
    else{
        cout<< "You don't have this element in the array."<<'\n';
    }

    string game[10];
    fill(game, game+(10/2), "Football");
    fill(game+(10/2), game+10, "Cricket");
    for(string g:game){
        cout << g <<'\n';
    }

    return 0;
}

int searchArray(int array[], int element){
    for(int i=0; i<sizeof(array)/sizeof(array[0]); i++){
       if(array[i]==element){
        return i;
       }
    }
    return -1;

}
