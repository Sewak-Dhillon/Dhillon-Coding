// Input Format

// Input will contain four integers - a,b,c,d , one per line.

// Output Format

// Return the greatest of the four integers.
// PS: I/O will be automatically handled.

// Sample Input

// 3
// 4
// 6
// 5
// Sample Output

// 6

#include <iostream>
#include <cstdio>
using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a, int b, int c, int d){
    int temp1 = (a>b)? a : b;
    int temp2 = (c>d)? c : d;
    int max = (temp1>temp2)? temp1 : temp2;
    return max;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}