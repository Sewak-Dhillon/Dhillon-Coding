// In C++, there are three access specifiers:

// public - members are accessible from outside the class

// private - members cannot be accessed (or viewed) from outside the class

// protected - members cannot be accessed from outside the class, however, they can be accessed in inherited classes. 


#include<iostream>
using namespace std;
class myclass{
    private:
    int num1;
    int num2;
    public:
    int a;
    string str;
    myclass(int a1,string str1){
        a = a1;
        str = str1;
    }
    void display(){
        cout<<"My name is "<<str<<endl<<"My age is "<<a;
    }
    int multiple(int a,int b); // Methode declaration.
};

// Defining method outside of class.
int myclass::multiple(int a,int b){
    // cout<<endl<<"Multiplication of "<<a<<" with "<<b<<" is "<<a*b<<endl;
    num1 = a;
    num2 = b;
    return num1*num2;
}
int main()
{
    myclass obj(10,"gursewak");
    obj.display();
    cout<<endl<<"Result of mutiplication : "<<obj.multiple(96,83);

 return 0;
}