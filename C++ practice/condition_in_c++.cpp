#include<iostream>
using namespace std;
int main()
{
    // if else statement
    int x = 20;
    if(x>10 && x<18){
        cout<<"You can't Drive, you are under age";
    }

    else if(x>=18){
        cout<<"You can Drive";
    }

    else{
        cout<<"You are child";
    }

    // if else in one line

    // variable = (condition) ? expressionTrue : expressionFalse;
    int y = 18;
    string str = (y>=18) ? "you can drive" : "you can't drive";
    cout<<str;
 return 0;
}