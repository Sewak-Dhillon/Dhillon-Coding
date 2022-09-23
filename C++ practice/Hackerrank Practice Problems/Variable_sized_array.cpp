#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int num1, num2, num3, x, y;
    int ar[100000];
    cin >> num1 >> num2;
    vector<vector<int>> arr(num1);
    for (int i = 0; i < num1; i++)
    {
        cin >> num3;
        arr[i].resize(num3);
        for (int j = 0; j < num3; j++)
        {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < num2; i++)
    {
        cin >> x>>y;
        cout<<arr[x][y]<<endl;
    }
    return 0;
}
