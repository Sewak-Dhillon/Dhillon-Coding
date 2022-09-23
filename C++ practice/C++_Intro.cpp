#include<iostream>
#include<cmath>
using namespace std;
int main()
{
//  string str;
//  int age;
//  cin>>str>>age; // User input
//  cout<<"My name is "<<str<<" and I am "<<age<<" old"; // Output Format

// const int pi = 3.14; 
// Constant value

// float radius;
// cout<<"Enter the radius : ";
// cin>>radius;
// cout<<"Area of Circle : "<<pi*radius*radius;

// int myNum = 5;               // Integer (whole number)
// float myFloatNum = 5.99;     // Floating point number
// double myDoubleNum = 9.98;   // Floating point number
// char myLetter = 'D';         // Character
// bool myBoolean = true;       // Boolean
// string myText = "Hello";     // String

// char a = 65;
// cout<<a;
// a = 66;
// cout<<a;
// a = 67;
// cout<<a;


// Some of Operator

int a = 10;
int b = 10;

cout<< a + b<<"\n"; //Addition
cout<< a - b<<"\n"; //Subtraction
cout<< a / b<<"\n"; //Division
cout<< a * b<<"\n"; //Multiplication
cout<< ++a<<"\n"; //Increment operator
cout<< --a<<"\n"; //Decrement operator
cout<< a % b<<"\n"; //Modulos operator

a = a >> 1; 
//a = 10 = binary(1010)
//after a >> 1 => 1010 =>0101 = 5
cout<<a<<"\n";

b = b << 1;
//b = 10 = binary(1010)
//after b << 1 => 1010 =>10100 = 20
cout<<b<<"\n";

int c = 5 ^ 3;
// 101 ^ 011 = 110 XOR operation going on here
cout<<c<<"\n";


//References in C++.

// A reference variable is a "reference" to an existing variable, and it is created with the & operator.

string food = "pizza";
string &meal = food;

// Both of them will give you same output.

cout<<food<<endl; 
//output : pizza
cout<<&food<<endl;
//output will be  the memory address of a variable.

cout<<meal<<endl;
cout<<&meal<<endl;

// Pointers in C++.

int a1 = 20;
int* ptr = &a1;

//Both of them will print the memory location of variable.
cout<<&a1<<endl;
cout<<ptr<<endl;

//Both of them will print the value stored in the variable.
cout<<a1<<endl;
cout<<*ptr<<endl; // It is also known as dereferencing.(Extracting value from address)

// We can even modify the value using *ptr.
*ptr = 800; 
cout<<a1<<endl;





 return 0;
}

