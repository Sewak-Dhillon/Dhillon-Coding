#include <iostream>
using namespace std;
int main()
{
    int day = 1;
    switch (day)
    {
    case 1:
        cout << "Monday\n";
        // break;
    case 2:
        cout << "Tuesday\n";
        // break;
    case 3:
        cout << "Wednesday\n";
        // break;
    case 4:
        cout << "Thursday\n";
        // break;
    case 5:
        cout << "Friday\n";
        // break;
    case 6:
        cout << "Saturday\n";
        // break;

    default:
        cout << "Sunday\n";
        // break;
    }
    return 0;
}

#include<iostream>
using namespace std;
int main()
{
// While loop
    int x = 5;
while(x)
{
    cout << x << "\n";
    --x;
}
// DO While loop
x = 5;
do
{
    cout << x << "\n";
    --x;
}while(x);
 return 0;
}


//For loop 
#include<iostream>
using namespace std;
int main()
{
    int x = 5;
    for(int i = 0;i<x;i++){
        cout<<"gursewak singh\n";
    }
 return 0;
}


// break statement is used to exit the loop.

// while continue is used to skip any instance of loop.