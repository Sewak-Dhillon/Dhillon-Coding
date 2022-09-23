#include<iostream>
using namespace std;

void myfunc(string name = "gursewak",int age = 19){
    cout<<name<<endl<<age<<endl;
}
void swapnum(int &a,int &b){
    int temp = a;
    a = b;
    b = temp;
}
void array1(int arr[],int len){
    for(int i = 0;i<len;i++){
            cout<<arr[i]<<endl;
    }
}
int main()
{
    int arr[] = {10,20,30,40,50,60,70,80,90,100};
    int len = sizeof(arr)/sizeof(int);
    int a = 20;
    int b = 30;
    cout<<"Before : "<<a<<" "<<b<<endl;
    swapnum(a,b);
    cout<<"After : "<<a<<" "<<b<<endl;
    myfunc("shan",20);
    myfunc("guri",20);
    myfunc();
    array1(arr,len);
    return 0;
}


// Function Overloading.

#include<iostream>
using namespace std;
int multiple(int a,int b){
    return a*b;
}
float multiple(float a,float b){
    return a*b;
}
double multiple(double a,double b){
    return a*b;
}
int main()
{
    int num1 = multiple(10,20);
    cout<<num1<<endl;
    float num2 = multiple(3.3,6.8);
    cout<<num2<<endl;
    double num3 = multiple(4.3,2.3);
    cout<<num3<<endl;

 return 0;
}

// Recursion in C++.

// Fictorial of number.

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

