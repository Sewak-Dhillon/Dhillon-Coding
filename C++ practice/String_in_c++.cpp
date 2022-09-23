#include<iostream>
#include<string>
using namespace std;
int main()
{
    //Defining some string variables
    string fname = "gursewak";
    string lname = "singh";

    //String Concetenation.
    cout<<fname + " " + lname;

    //User input of string.
    string l;
    cout<<"\nEnter any string: ";
    // cin>>l;
    //Using getline() methode user is able to provide space separated input to console.
    getline(cin,l);
    cout<<l;

    //String lenght
    int len = fname.length();
    len = fname.size();

    // cout<<"\n"; // Escape squence for new-line.
    for(int i=0;i<fname.length()+1;i++){
        cout<<fname[i];
    }

 return 0;
}