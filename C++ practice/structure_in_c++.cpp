#include<iostream>
using namespace std;
int main()
{
struct employee{
    string ename;
    int eid;
    float salary;
}emp1,emp2,emp3;

emp1.ename = "gursewak singh";
emp1.eid = 12013279;
emp1.salary = 50000;

emp2.ename = "shanpreet singh";
emp2.eid = 12013289;
emp2.salary = 90000;

emp3.ename = "navjot singh";
emp3.eid = 12013589;
emp3.salary = 40000;

cout<<emp1.ename<<endl;
cout<<emp1.eid<<endl;
cout<<emp1.salary<<endl;

cout<<emp2.ename<<endl;
cout<<emp2.eid<<endl;
cout<<emp2.salary<<endl;

cout<<emp3.ename<<endl;
cout<<emp3.eid<<endl;
cout<<emp3.salary<<endl;

 return 0;
}