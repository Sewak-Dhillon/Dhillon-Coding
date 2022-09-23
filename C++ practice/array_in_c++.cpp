#include <iostream>
using namespace std;
int main()
{
    int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    for (int i = 0; i < 10; i++)
    {
        cout << arr[i] << " ";
    }

    // Get size of array.

    int len = sizeof(arr) / sizeof(int);
    cout << "\n"
         << len;
    return 0;
}

// Multi-dimensional Array.
// Number of elements in multi-dimensional array equals
// For 2D => i * j
// For 3D => i * j * k and so on

#include <iostream>
using namespace std;
int main()
{
    cout<<"\n\n******2D Array******\n\n";
    int arr[2][2] = {{10, 20}, {30, 40}};
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << "[" << i << "][" << j << "] =" << arr[i][j] << endl;
        }
    }
    cout<<"\n\n******3D Array******\n\n";

    int arr1[2][2][2] = {
        {{10, 20},
         {30, 40}},
        {{100, 200},
         {300, 400}}};
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            for (int k = 0; k < 2; k++)
            {
                cout << "[" << i << "][" << j << "][" << k << "] =" << arr1[i][j][k] << endl;
            }
        }
    }

    return 0;
}
