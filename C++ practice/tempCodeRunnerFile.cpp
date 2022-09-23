#include<iostream>
using namespace std;

int fictorial(int num){
    if(num>1){
    return num * fictorial(num-1);
    }
    else{
        return 1;
    }
}

int main()
{
    int num = 5;
    cout<<num<<endl;
    cout<<fictorial(num);
    return 0;
}