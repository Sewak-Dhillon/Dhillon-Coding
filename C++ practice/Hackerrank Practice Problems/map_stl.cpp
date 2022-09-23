#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int q;
    map<string,int> m;
    cin>>q;
    for(int i=0;i<q;i++){
        int type,no;
        string str;
        cin>>type;
        if(type == 1){
            cin>>str>>no;
            map<string,int>::iterator itr = m.find(str);
            if(itr != m.end()){
            no += m[str];
            m.erase(str);
            }
            m.insert(make_pair(str, no));
        }
        else if(type == 2){
            cin>>str;
            m.erase(str);
        }
        else if(type == 3){
            cin>>str;
            map<string,int>::iterator itr = m.find(str);
            if(itr != m.end()){
                cout<<m[str]<<endl;
            }
            else{
                cout<<"0\n";
            }
        }
    }
    return 0;
}



