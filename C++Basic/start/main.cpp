#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int age;
    string name;

   /* cout << "What is your name? :";
    getline(cin >>ws, name);
    cout << "Your name is " <<name << endl;

    cout << "How old are you? :";
    cin >> age;
    cout << "You are" << age << "years old." <<'\n';

    int grade = 69;
    (grade>=60)? cout << "Passed" : cout << "Failed";
    */
    srand(time(NULL));
    int ab = (rand()%6)+1;
    cout << ab;

    return 0;
}
