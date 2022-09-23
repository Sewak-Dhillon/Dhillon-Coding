#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
	// Complete this function
    vector<int> matrix;
    stringstream obj(str);
    int num;
    char c;
    while(obj >> num){
        matrix.push_back(num);
        obj >> c;
    }
    return matrix;
    
    }

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
