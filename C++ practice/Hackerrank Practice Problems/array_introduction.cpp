// Input Format

// The first line of the input contains ,where  is the number of integers.The next line contains  space-separated integers.

// Constraints


// , where  is the  integer in the array.

// Output Format

// Print the  integers of the array in the reverse order, space-separated on a single line.

// Sample Input

// 4
// 1 4 3 2
// Sample Output

// 2 3 4 1


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int num;
    int arr[10];
    cin>>num;
    for(int i = 0;i<num;i++){
        cin>>arr[i];
    }  
    for(int i = num-1;i>=0;i--){
        cout<<arr[i];
    }
    return 0;
}
